package pe.edu.upeu.abspolimorfismo;

public class Loro extends Animal {
    @Override
    void emitirSonido() {
        System.out.println("Emitiendo Sonido gaaaaa");
    }

    @Override
    void dormir() {
        //super.dormir();
        System.out.println("Loro dormirzzzz.....");
    }
}
