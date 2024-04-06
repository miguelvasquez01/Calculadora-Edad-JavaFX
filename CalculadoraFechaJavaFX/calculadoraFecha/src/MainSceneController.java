import java.time.LocalDate;
import java.time.Period;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class MainSceneController {

    @FXML
    private DatePicker dpfechaNacimiento;

    @FXML
    private TextField tfEdad;

    @FXML
    void botonCalcularEdadClicked(ActionEvent event) {

        if(dpfechaNacimiento.getValue() == null){//Valido que al presionar el botón el campo de fecha de nacimiento no este vacio
            tfEdad.setText("Debe seleccionar una fecha");
        }

        LocalDate fechaNacimiento = dpfechaNacimiento.getValue();//Fecha de nacimiento en tipo LocalDate
        LocalDate fechaActual = LocalDate.now();//Fecha actual en tipo LocalDate

        Period edad = Period.between(fechaNacimiento, fechaActual);//Obtengo el periodo entre la fecha de nacimiento y la actual
        int edadFinal = edad.getYears();//Obtengo los años de ese periodo
        
        tfEdad.setText(edadFinal+" años");
    }

}

