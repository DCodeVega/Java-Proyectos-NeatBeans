
package E4;


public class Main4 {

    public static void main(String[] args) {
        Trabajador obj1=new Trabajador();
        System.out.println("----------------------");
        obj1.nombre="Juan";
        obj1.dt=15;
        obj1.pd=100;
        System.out.println("Nombre: "+obj1.nombre);
        System.out.println("Dias Trabajadas: "+obj1.dt);
        System.out.println("Pago Diario: "+obj1.pd);
        obj1.calcularSL();
        obj1.calcularTD();
        obj1.calcularSF();
        
        Trabajador obj2=new Trabajador();
        System.out.println("----------------------");
        obj2.nombre="Luis";
        obj2.dt=18;
        obj2.pd=150;
        System.out.println("Nombre: "+obj2.nombre);
        System.out.println("Dias Trabajados: "+obj2.dt);
        System.out.println("Pago Diario: "+obj2.pd);
        obj2.calcularSL();
        obj2.calcularTD();
        obj2.calcularSF();

    }
    
}
