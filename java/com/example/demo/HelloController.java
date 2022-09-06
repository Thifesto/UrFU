package com.example.demo;

import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private ToggleGroup groupuzp1;

    @FXML
    private ToggleGroup groupuzp2;
    @FXML
    private ToggleGroup groupuzp3;

    @FXML
    private ToggleGroup groupuzp4;

    @FXML
    private ToggleGroup groupuzp5;

    @FXML
    private ToggleGroup groupuzp6;

    @FXML
    private ToggleGroup groupuzp7;

    @FXML
    private ToggleGroup groupuzp8;

    @FXML
    private ToggleGroup groupuzp9;

    @FXML
    private ToggleGroup groupuzp10;

    @FXML
    private ToggleGroup groupuzp11;

    @FXML
    private ToggleGroup groupuzp12;

    @FXML
    private ToggleGroup groupuzp13;

    @FXML
    private ToggleGroup groupuzp14;

    @FXML
    private ToggleGroup groupuzp15;

    @FXML
    private ToggleGroup groupuzp16;

    @FXML
    private ToggleGroup groupuzp17;

    @FXML
    private ToggleGroup groupuzp18;

    @FXML
    private ToggleGroup groupuzp19;

    @FXML
    private ToggleGroup groupuzp20;

    @FXML
    private ToggleGroup groupuzp21;

    @FXML
    private ToggleGroup groupuzp22;

    @FXML
    private ToggleGroup groupuzp23;

    @FXML
    private ToggleGroup groupuzp24;

    @FXML
    private ToggleGroup groupuzp25;

    @FXML
    private ToggleGroup groupuzp26;

    @FXML
    private ToggleGroup groupuzp27;

    @FXML
    private ToggleGroup groupuzp28;

    @FXML
    private ToggleGroup groupuzp29;

    @FXML
    private ToggleGroup grouprd1;

    @FXML
    private ToggleGroup grouprd2;

    @FXML
    private ToggleGroup grouprd3;

    @FXML
    private ToggleGroup grouprd4;

    @FXML
    private ToggleGroup grouprd5;

    @FXML
    private ToggleGroup grouprd6;

    @FXML
    private ToggleGroup grouprd7;

    @FXML
    private ToggleGroup grouprd8;

    @FXML
    private ToggleGroup grouprd9;

    @FXML
    private ToggleGroup grouprd10;

    @FXML
    private ToggleGroup grouprd11;

    @FXML
    private ToggleGroup grouprd12;

    @FXML
    private ToggleGroup grouprd13;

    @FXML
    private ToggleGroup grouprd14;

    @FXML
    private ToggleGroup grouprd15;

    @FXML
    private ToggleGroup grouprd16;

    @FXML
    private ToggleGroup grouprd17;

    @FXML
    private ToggleGroup grouprd18;

    @FXML
    private ToggleGroup grouprd19;

    @FXML
    private ToggleGroup grouprd20;

    @FXML
    private ToggleGroup grouprd21;

    @FXML
    private ToggleGroup grouprd22;

    @FXML
    private ToggleGroup grouprd23;

    @FXML
    private ToggleGroup grouprd24;

    @FXML
    private ToggleGroup grouprd25;

    @FXML
    private ToggleGroup grouprd26;

    @FXML
    private ToggleGroup grouprd27;

    @FXML
    private ToggleGroup grouprd28;

    @FXML
    private ToggleGroup grouprd29;

    @FXML
    private ToggleGroup grouprd30;

    @FXML
    private ToggleGroup grouprd31;

    @FXML
    private ToggleGroup grouprd32;

    @FXML
    private ToggleGroup grouprd33;

    @FXML
    private ToggleGroup grouprd34;

    @FXML
    private ToggleGroup grouprd35;

    @FXML
    private ToggleGroup grouprd36;

    @FXML
    private ToggleGroup grouprd37;

    @FXML
    private ToggleGroup grouprd38;

    @FXML
    private ToggleGroup grouprd39;

    @FXML
    private ToggleGroup grouprd40;

    @FXML
    private ToggleGroup grouprd41;

    @FXML
    private ToggleGroup grouprd42;

    @FXML
    private ToggleGroup grouprd43;

    @FXML
    private ToggleGroup grouprd44;

    @FXML
    private ToggleGroup groupfd1;

    @FXML
    private ToggleGroup groupfd2;

    @FXML
    private ToggleGroup groupfd3;

    @FXML
    private ToggleGroup groupfd4;

    @FXML
    private ToggleGroup groupfd5;

    @FXML
    private ToggleGroup groupfd6;

    @FXML
    private ToggleGroup groupfd7;

    @FXML
    private ToggleGroup groupfd8;

    @FXML
    private ToggleGroup groupfd9;

    @FXML
    private ToggleGroup groupfd10;

    @FXML
    private ToggleGroup groupfd11;

    @FXML
    private ToggleGroup groupfd12;

    @FXML
    private ToggleGroup groupfd13;

    @FXML
    private ToggleGroup groupfd14;

    @FXML
    private ToggleGroup groupfd15;

    @FXML
    private ToggleGroup groupfd16;

    @FXML
    private ToggleGroup groupfd17;

    @FXML
    private ToggleGroup groupfd18;

    @FXML
    private ToggleGroup groupfd19;

    @FXML
    private ToggleGroup groupfd20;

    @FXML
    private ToggleGroup groupfd21;

    @FXML
    private ToggleGroup groupiy1;

    @FXML
    private ToggleGroup groupiy2;

    @FXML
    private ToggleGroup groupiy3;

    @FXML
    private ToggleGroup groupiy4;

    @FXML
    private ToggleGroup groupiy5;

    @FXML
    private ToggleGroup groupiy6;

    @FXML
    private ToggleGroup groupiy7;

    @FXML
    private ToggleGroup groupiy8;


    @FXML
    protected void onHelloButtonClick() throws IOException {
        Calculator calculator = new Calculator();
        RadioButton uzp1 = (RadioButton) groupuzp1.getSelectedToggle();
        if (uzp1.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp1.getText()));

        RadioButton uzp2 = (RadioButton) groupuzp2.getSelectedToggle();
        if (uzp2.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp2.getText()));

        RadioButton uzp3 = (RadioButton) groupuzp3.getSelectedToggle();
        if (uzp3.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp3.getText()));

        RadioButton uzp4 = (RadioButton) groupuzp4.getSelectedToggle();
        if (uzp4.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp4.getText()));

        RadioButton uzp5 = (RadioButton) groupuzp5.getSelectedToggle();
        if (uzp5.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp5.getText()));

        RadioButton uzp6 = (RadioButton) groupuzp6.getSelectedToggle();
        if (uzp6.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp6.getText()));

        RadioButton uzp7 = (RadioButton) groupuzp7.getSelectedToggle();
        if (uzp7.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp7.getText()));

        RadioButton uzp8 = (RadioButton) groupuzp8.getSelectedToggle();
        if (uzp8.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp8.getText()));

        RadioButton uzp9 = (RadioButton) groupuzp9.getSelectedToggle();
        if (uzp9.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp9.getText()));

        RadioButton uzp10 = (RadioButton) groupuzp10.getSelectedToggle();
        if (uzp10.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp10.getText()));

        RadioButton uzp11 = (RadioButton) groupuzp11.getSelectedToggle();
        if (uzp11.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp11.getText()));

        RadioButton uzp12 = (RadioButton) groupuzp12.getSelectedToggle();
        if (uzp12.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp12.getText()));

        RadioButton uzp13 = (RadioButton) groupuzp13.getSelectedToggle();
        if (uzp13.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp13.getText()));

        RadioButton uzp14 = (RadioButton) groupuzp14.getSelectedToggle();
        if (uzp14.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp14.getText()));

        RadioButton uzp15 = (RadioButton) groupuzp15.getSelectedToggle();
        if (uzp15.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp15.getText()));

        RadioButton uzp16 = (RadioButton) groupuzp16.getSelectedToggle();
        if (uzp16.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp16.getText()));

        RadioButton uzp17 = (RadioButton) groupuzp17.getSelectedToggle();
        if (uzp17.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp17.getText()));

        RadioButton uzp18 = (RadioButton) groupuzp18.getSelectedToggle();
        if (uzp18.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp18.getText()));

        RadioButton uzp19 = (RadioButton) groupuzp19.getSelectedToggle();
        if (uzp19.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp19.getText()));

        RadioButton uzp20 = (RadioButton) groupuzp20.getSelectedToggle();
        if (uzp20.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp20.getText()));

        RadioButton uzp21 = (RadioButton) groupuzp21.getSelectedToggle();
        if (uzp21.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp21.getText()));

        RadioButton uzp22 = (RadioButton) groupuzp22.getSelectedToggle();
        if (uzp22.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp22.getText()));

        RadioButton uzp23 = (RadioButton) groupuzp23.getSelectedToggle();
        if (uzp23.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp23.getText()));

        RadioButton uzp24 = (RadioButton) groupuzp24.getSelectedToggle();
        if (uzp24.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp24.getText()));

        RadioButton uzp25 = (RadioButton) groupuzp25.getSelectedToggle();
        if (uzp25.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp25.getText()));

        RadioButton uzp26 = (RadioButton) groupuzp26.getSelectedToggle();
        if (uzp26.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp26.getText()));

        RadioButton uzp27 = (RadioButton) groupuzp27.getSelectedToggle();
        if (uzp27.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp27.getText()));

        RadioButton uzp28 = (RadioButton) groupuzp28.getSelectedToggle();
        if (uzp28.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp28.getText()));

        RadioButton uzp29 = (RadioButton) groupuzp29.getSelectedToggle();
        if (uzp29.getText().equals("н/п") == false) calculator.addValueuzp(Integer.parseInt(uzp29.getText()));

        RadioButton rd1 = (RadioButton) grouprd1.getSelectedToggle();
        if (rd1.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd1.getText()));

        RadioButton rd2 = (RadioButton) grouprd2.getSelectedToggle();
        if (rd2.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd2.getText()));

        RadioButton rd3 = (RadioButton) grouprd3.getSelectedToggle();
        if (rd3.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd3.getText()));

        RadioButton rd4 = (RadioButton) grouprd4.getSelectedToggle();
        if (rd4.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd4.getText()));

        RadioButton rd5 = (RadioButton) grouprd5.getSelectedToggle();
        if (rd5.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd5.getText()));

        RadioButton rd6 = (RadioButton) grouprd6.getSelectedToggle();
        if (rd6.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd6.getText()));

        RadioButton rd7 = (RadioButton) grouprd7.getSelectedToggle();
        if (rd7.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd7.getText()));

        RadioButton rd8 = (RadioButton) grouprd8.getSelectedToggle();
        if (rd8.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd8.getText()));

        RadioButton rd9 = (RadioButton) grouprd9.getSelectedToggle();
        if (rd9.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd9.getText()));

        RadioButton rd10 = (RadioButton) grouprd10.getSelectedToggle();
        if (rd10.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd10.getText()));

        RadioButton rd11 = (RadioButton) grouprd11.getSelectedToggle();
        if (rd11.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd11.getText()));

        RadioButton rd12 = (RadioButton) grouprd12.getSelectedToggle();
        if (rd12.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd12.getText()));

        RadioButton rd13 = (RadioButton) grouprd13.getSelectedToggle();
        if (rd13.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd13.getText()));

        RadioButton rd14 = (RadioButton) grouprd14.getSelectedToggle();
        if (rd14.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd14.getText()));

        RadioButton rd15 = (RadioButton) grouprd15.getSelectedToggle();
        if (rd15.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd15.getText()));

        RadioButton rd16 = (RadioButton) grouprd16.getSelectedToggle();
        if (rd16.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd16.getText()));

        RadioButton rd17 = (RadioButton) grouprd17.getSelectedToggle();
        if (rd17.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd17.getText()));

        RadioButton rd18 = (RadioButton) grouprd18.getSelectedToggle();
        if (rd18.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd18.getText()));

        RadioButton rd19 = (RadioButton) grouprd19.getSelectedToggle();
        if (rd19.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd19.getText()));

        RadioButton rd20 = (RadioButton) grouprd20.getSelectedToggle();
        if (rd20.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd20.getText()));

        RadioButton rd21 = (RadioButton) grouprd21.getSelectedToggle();
        if (rd21.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd21.getText()));

        RadioButton rd22 = (RadioButton) grouprd22.getSelectedToggle();
        if (rd22.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd22.getText()));

        RadioButton rd23 = (RadioButton) grouprd23.getSelectedToggle();
        if (rd23.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd23.getText()));

        RadioButton rd24 = (RadioButton) grouprd24.getSelectedToggle();
        if (rd24.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd24.getText()));

        RadioButton rd25 = (RadioButton) grouprd25.getSelectedToggle();
        if (rd25.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd25.getText()));

        RadioButton rd26 = (RadioButton) grouprd26.getSelectedToggle();
        if (rd26.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd26.getText()));

        RadioButton rd27 = (RadioButton) grouprd27.getSelectedToggle();
        if (rd27.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd27.getText()));

        RadioButton rd28 = (RadioButton) grouprd28.getSelectedToggle();
        if (rd28.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd28.getText()));

        RadioButton rd29 = (RadioButton) grouprd29.getSelectedToggle();
        if (rd29.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd29.getText()));

        RadioButton rd30 = (RadioButton) grouprd30.getSelectedToggle();
        if (rd30.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd30.getText()));

        RadioButton rd31 = (RadioButton) grouprd31.getSelectedToggle();
        if (rd31.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd31.getText()));

        RadioButton rd32 = (RadioButton) grouprd32.getSelectedToggle();
        if (rd32.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd32.getText()));

        RadioButton rd33 = (RadioButton) grouprd33.getSelectedToggle();
        if (rd33.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd33.getText()));

        RadioButton rd34 = (RadioButton) grouprd34.getSelectedToggle();
        if (rd34.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd34.getText()));

        RadioButton rd35 = (RadioButton) grouprd35.getSelectedToggle();
        if (rd35.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd35.getText()));

        RadioButton rd36 = (RadioButton) grouprd36.getSelectedToggle();
        if (rd36.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd36.getText()));

        RadioButton rd37 = (RadioButton) grouprd37.getSelectedToggle();
        if (rd37.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd37.getText()));

        RadioButton rd38 = (RadioButton) grouprd38.getSelectedToggle();
        if (rd38.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd38.getText()));

        RadioButton rd39 = (RadioButton) grouprd39.getSelectedToggle();
        if (rd39.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd39.getText()));

        RadioButton rd40 = (RadioButton) grouprd40.getSelectedToggle();
        if (rd40.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd40.getText()));

        RadioButton rd41 = (RadioButton) grouprd41.getSelectedToggle();
        if (rd41.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd41.getText()));

        RadioButton rd42 = (RadioButton) grouprd42.getSelectedToggle();
        if (rd42.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd42.getText()));

        RadioButton rd43 = (RadioButton) grouprd43.getSelectedToggle();
        if (rd43.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd43.getText()));

        RadioButton rd44 = (RadioButton) grouprd44.getSelectedToggle();
        if (rd44.getText().equals("н/п") == false) calculator.addValuerd(Integer.parseInt(rd44.getText()));

        RadioButton fd1 = (RadioButton) groupfd1.getSelectedToggle();
        if (fd1.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd1.getText()));

        RadioButton fd2 = (RadioButton) groupfd2.getSelectedToggle();
        if (fd2.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd2.getText()));

        RadioButton fd3 = (RadioButton) groupfd3.getSelectedToggle();
        if (fd3.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd3.getText()));

        RadioButton fd4 = (RadioButton) groupfd4.getSelectedToggle();
        if (fd4.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd4.getText()));

        RadioButton fd5 = (RadioButton) groupfd5.getSelectedToggle();
        if (fd5.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd5.getText()));

        RadioButton fd6 = (RadioButton) groupfd6.getSelectedToggle();
        if (fd6.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd6.getText()));

        RadioButton fd7 = (RadioButton) groupfd7.getSelectedToggle();
        if (fd7.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd7.getText()));

        RadioButton fd8 = (RadioButton) groupfd8.getSelectedToggle();
        if (fd8.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd8.getText()));

        RadioButton fd9 = (RadioButton) groupfd9.getSelectedToggle();
        if (fd9.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd9.getText()));

        RadioButton fd10 = (RadioButton) groupfd10.getSelectedToggle();
        if (fd10.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd10.getText()));

        RadioButton fd11 = (RadioButton) groupfd11.getSelectedToggle();
        if (fd11.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd11.getText()));

        RadioButton fd12 = (RadioButton) groupfd12.getSelectedToggle();
        if (fd12.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd12.getText()));

        RadioButton fd13 = (RadioButton) groupfd13.getSelectedToggle();
        if (fd13.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd13.getText()));

        RadioButton fd14 = (RadioButton) groupfd14.getSelectedToggle();
        if (fd14.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd14.getText()));

        RadioButton fd15 = (RadioButton) groupfd15.getSelectedToggle();
        if (fd15.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd15.getText()));

        RadioButton fd16 = (RadioButton) groupfd16.getSelectedToggle();
        if (fd16.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd16.getText()));

        RadioButton fd17 = (RadioButton) groupfd17.getSelectedToggle();
        if (fd17.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd17.getText()));

        RadioButton fd18 = (RadioButton) groupfd18.getSelectedToggle();
        if (fd18.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd18.getText()));

        RadioButton fd19 = (RadioButton) groupfd19.getSelectedToggle();
        if (fd19.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd19.getText()));

        RadioButton fd20 = (RadioButton) groupfd20.getSelectedToggle();
        if (fd20.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd20.getText()));

        RadioButton fd21 = (RadioButton) groupfd21.getSelectedToggle();
        if (fd21.getText().equals("н/п") == false) calculator.addValuefd(Integer.parseInt(fd21.getText()));

        RadioButton iy1 = (RadioButton) groupiy1.getSelectedToggle();
        if (iy1.getText().equals("н/п") == false) calculator.addValueiy(Integer.parseInt(iy1.getText()));

        RadioButton iy2 = (RadioButton) groupiy2.getSelectedToggle();
        if (iy2.getText().equals("н/п") == false) calculator.addValueiy(Integer.parseInt(iy2.getText()));

        RadioButton iy3 = (RadioButton) groupiy3.getSelectedToggle();
        if (iy3.getText().equals("н/п") == false) calculator.addValueiy(Integer.parseInt(iy3.getText()));

        RadioButton iy4 = (RadioButton) groupiy4.getSelectedToggle();
        if (iy4.getText().equals("н/п") == false) calculator.addValueiy(Integer.parseInt(iy4.getText()));

        RadioButton iy5 = (RadioButton) groupiy5.getSelectedToggle();
        if (iy5.getText().equals("н/п") == false) calculator.addValueiy(Integer.parseInt(iy5.getText()));

        RadioButton iy6 = (RadioButton) groupiy6.getSelectedToggle();
        if (iy6.getText().equals("н/п") == false) calculator.addValueiy(Integer.parseInt(iy6.getText()));

        RadioButton iy7 = (RadioButton) groupiy7.getSelectedToggle();
        if (iy7.getText().equals("н/п") == false) calculator.addValueiy(Integer.parseInt(iy7.getText()));

        RadioButton iy8 = (RadioButton) groupiy8.getSelectedToggle();
        if (iy8.getText().equals("н/п") == false) calculator.addValueiy(Integer.parseInt(iy8.getText()));

        double uzpres = calculator.calculateuzp();
        double rdres = calculator.calculaterd();
        double fdres = calculator.calculatefd();
        double iyres = calculator.calculateiy();
        double p1 = (uzpres + rdres + fdres + iyres)/4;
        Label lbluzp = new Label();
        Label lblrd = new Label();
        Label lblfd = new Label();
        Label lbliy = new Label();
        Label lblp1 = new Label();
        lbluzp.setText("Итоговая оценка за подпроцесс Управление учетными записями и правами субъектов логического доступа: " + String.format("%.2f",uzpres));
        lblrd.setText("Итоговая оценка за подпроцесс Идентификация, аутентификация, авторизация (разграничение доступа) при осуществлении логического доступа: " + String.format("%.2f",rdres));
        lblfd.setText("Итоговая оценка за подпроцесс Защита информации при осуществлении физического доступа: " + String.format("%.2f",fdres));
        lbliy.setText("Итоговая оценка за подпроцесс Идентификация и учет ресурсов и объектов доступа: " + String.format("%.2f",iyres));
        lblp1.setText("Итоговая оценка за процесс Обеспечение защиты информации при управлении доступом: " + String.format("%.2f",p1));
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, lbluzp, lblrd, lblfd, lbliy, lblp1);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 850, 300);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Оценка");
        stage.show();
        //Stage result = new Stage();
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("result.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 650, 400);
        //result.setScene(scene);
        //result.showAndWait();
        //ResultController controller = fxmlLoader.getController();
        //controller.setInfo(c);
    }
}