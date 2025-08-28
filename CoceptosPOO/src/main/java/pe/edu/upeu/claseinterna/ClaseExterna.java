package pe.edu.upeu.claseinterna;

public class ClaseExterna {
    int a,b;
    class ClaseIxterna1{

        public boolean sumar() {
            return false;
        }
    }
    class ClaseIxterna2{
        double r;
        double sumar(){
            r=a+b;
            return r;
        }
    }
    public static void main(String[] args) {
        ClaseExterna c=new ClaseExterna();
        c.a=10;
        c.b=5;
        ClaseIxterna1 ci1=c.new ClaseIxterna1();
        System.out.println(ci1.sumar());

        ClaseIxterna2 ci2=c.new ClaseIxterna2();
        System.out.println(ci2.sumar());

    }

}
class Clasexterna3{

}