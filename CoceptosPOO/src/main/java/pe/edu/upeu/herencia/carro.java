package pe.edu.upeu.herencia;

public class carro extends vehiculo {


    public static void main(String[] args) {
        carro c = new carro();
        System.out.println("caracteristicas");
        c.marca="toyota";
        System.out.println("marca"+c.marca);
        System.out.println("modelo"+c.modelo);
        System.out.println("color"+"no se puede eredarpor ser privado");
        c.sonido();
    }
}
