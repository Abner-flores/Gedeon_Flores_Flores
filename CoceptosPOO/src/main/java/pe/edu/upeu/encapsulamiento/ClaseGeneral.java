package pe.edu.upeu.encapsulamiento;

public class ClaseGeneral {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Abner");
        p.setEdad(25);
        p.saludo();
        p.apellido= "flores";

        Trabajador t = new Trabajador();
        t.setNombre("Abner");
        t.setApellido("flores");
        t.setEdad(25);
        t.setArea("sistemas");
        t.setGenero('M');
        System.out.println(t);

    }
}
