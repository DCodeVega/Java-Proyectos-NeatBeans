
package E5;

public class Main5 {

    public static void main(String[] args) {
        Sueldo obj1=new Sueldo();
        System.out.println("----1----");
        obj1.dt=15;
        obj1.pd=100;
        System.out.println("Dias Trabajados: "+obj1.dt);
        System.out.println("Pago Diario: "+obj1.pd);
        obj1.calcularSL();
        obj1.calcularD();
        obj1.calcularBT();
        obj1.calcularSF();
        
        Sueldo obj2=new Sueldo();
        System.out.println("----2----");
        obj2.dt=18;
        obj2.pd=150;
        System.out.println("Dias Trabajados: "+obj2.dt);
        System.out.println("Pago Diario: "+obj2.pd);
        obj2.calcularSL();
        obj2.calcularD();
        obj2.calcularBT();
        obj2.calcularSF();

    }
    
}
