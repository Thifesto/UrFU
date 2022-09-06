package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public List<Integer> valuesuzp = new ArrayList<>();
    public List<Integer> valuesrd = new ArrayList<>();

    public List<Integer> valuesfd = new ArrayList<>();

    public List<Integer> valuesiy = new ArrayList<>();

    public void addValueuzp(Integer i) {
        valuesuzp.add(i);
    }

    public void addValuerd(Integer i) {
        valuesrd.add(i);
    }

    public void addValuefd(Integer i) {
        valuesfd.add(i);
    }

    public void addValueiy(Integer i) {
        valuesiy.add(i);
    }

    public double calculateuzp() {
        if (valuesuzp.isEmpty())
            return 0;
        double sumoc = 0.0;
        //System.out.println(values.size());
        double sum1 = (valuesuzp.stream().reduce(0, Integer::sum));
        sumoc = sum1/valuesuzp.size();
        //System.out.printf("%.2f",sumoc);
        return sumoc;
        //return values.stream().reduce(0, Integer::sum) /values.size();
    }

    public double calculaterd() {
        if (valuesrd.isEmpty())
            return 0;
        double sumoc = 0.0;
        double sum1 = (valuesrd.stream().reduce(0, Integer::sum));
        sumoc = sum1/valuesrd.size();
        return sumoc;
    }

    public double calculatefd() {
        if (valuesfd.isEmpty())
            return 0;
        double sumoc = 0.0;
        double sum1 = (valuesfd.stream().reduce(0, Integer::sum));
        sumoc = sum1/valuesfd.size();
        return sumoc;
    }

    public double calculateiy() {
        if (valuesiy.isEmpty())
            return 0;
        double sumoc = 0.0;
        double sum1 = (valuesiy.stream().reduce(0, Integer::sum));
        sumoc = sum1/valuesiy.size();
        return sumoc;
    }
}
