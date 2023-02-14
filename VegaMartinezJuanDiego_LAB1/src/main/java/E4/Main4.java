
package E4;

public class Main4 {

    public static void main(String[] args) {
        Trabajador obj1=new Trabajador();
        System.out.println("----1----");
        obj1.dt=10;
        obj1.pd=60;
        System.out.println("Dias Trabajados: "+obj1.dt+" Dias");
        System.out.println("Pago Diario: "+obj1.pd+" Bs");
        obj1.calcularSL();
        obj1.calcularDP();
        obj1.calcularDRC();
        obj1.calcularCAFP();
        obj1.calcularAS();
        obj1.calcularTD();
        obj1.calcularBT();
        obj1.calcularSF();
        
        Trabajador obj2=new Trabajador();
        System.out.println("----2----");
        obj2.dt=14;
        obj2.pd=80;
        System.out.println("Dias Trabajados: "+obj2.dt+" Dias");
        System.out.println("Pago Diario: "+obj2.pd+" Bs");
        obj2.calcularSL();
        obj2.calcularDP();
        obj2.calcularDRC();
        obj2.calcularCAFP();
        obj2.calcularAS();
        obj2.calcularTD();
        obj2.calcularBT();
        obj2.calcularSF();
        
        

    }
    
}
