package pe.edu.upeu.asistencia.enums;

import javafx.beans.property.StringProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Carrera {
    SISTEMAS(Facultad.FIA,"ING. de sistemas"),
    CIVIL(Facultad.FIA,"ING. de civil"),
    AMBIENTAL(Facultad.FIA,"ING. de ambiental"),

    ADMINISTRACION(Facultad.FCE,"Administracion"),
    NUTICION(Facultad.FCE,"NUTICION"),
    EDUCACION(Facultad.FACIHED,"EDUCACION"),
    ;
    private Facultad facultad;
    private String descripcion;
}
