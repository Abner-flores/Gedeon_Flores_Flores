package pe.edu.upeu.asistencia.control;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

import javax.swing.*;

@Controller
public class Asistenciacontroller {
    @FXML TextField txtnum1, txtnum2;
    @FXML Label txtresult;

    @FXML
    private void sumar() {
        double num1 = Double.parseDouble(txtnum1.getText());
        double num2 = Double.parseDouble(txtnum2.getText());
        double resultado = num1 + num2;

        txtresult.setText(String.valueOf(resultado));
    }
}
