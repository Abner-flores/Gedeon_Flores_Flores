package pe.edu.upeu.encapsulamiento;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
/*@Getter
@Setter*/
public class Trabajador {
    private String nombre;
    private String apellido;
    private int edad;
    private char Genero;
    private String area;

    @Override
    public String toString() {
        return "Tiene la siguientyes caracteristicas: \n"+
                "nombre:"+nombre+
                "\napellido:"+apellido
                ;
    }
}
