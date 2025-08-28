package pe.edu.upeu.enums;

enum TIPO_PAGO {Efectivo, Credito, TRansferencia, Yape}

enum MES{Enero, Febrero, }



public class pago {
    TIPO_PAGO tipo;
    MES mes;
    double monto;
    String cuenta;
    double impuestos;

public static void main(String[] args) {
    pago p = new pago();
    p.tipo = TIPO_PAGO.Efectivo;
    p.mes = MES.Enero;
    p.monto = 100;
    p.cuenta = "14545 54545 5454 5454";
    p.impuestos = 100;

    System.out.println("tipo de pago"+p.tipo);
    System.out.println("monto"+p.monto);
    System.out.println("cuenta"+p.cuenta);
    System.out.println("impuestos"+p.impuestos);
}
}
