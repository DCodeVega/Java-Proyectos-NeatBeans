
package E5;

public class Main5 {

    public static void main(String[] args) {
        Trabajador obj1=new Trabajador();
        System.out.println("----1----");
        obj1.dt=30;
        obj1.pd=80;
        System.out.println("Dias Trabajados: "+obj1.dt+" Dias");
        System.out.println("Pago por Dia: "+obj1.pd+" Bs");
        obj1.calcularSL();
        obj1.calcularD();
        obj1.calcularBT();
        obj1.calcularSF();
        
        Trabajador obj2=new Trabajador();
        System.out.println("----2----");
        obj2.dt=28;
        obj2.pd=90;
        System.out.println("Dias Trabajados: "+obj2.dt+" Dias");
        System.out.println("Pago por Dia: "+obj2.pd+" Bs");
        obj2.calcularSL();
        obj2.calcularD();
        obj2.calcularBT();
        obj2.calcularSF();
    }   
}
