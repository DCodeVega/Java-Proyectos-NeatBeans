
package E1;

public class Main1 {
    public static void main(String[] args) {       
        System.out.println("------------1------------");
        Trabajador t1=new Trabajador();
        t1.dt=10;
        t1.pd=150;   
        t1.calcularSL();
        
        System.out.println("------------2------------");       
        Profesional1 p1_1=new Profesional1();
        p1_1.idp="p1";
        p1_1.dt=10;
        p1_1.pd=220;     
        p1_1.calcularSL();
        p1_1.idp1();
        p1_1.calcularBT();
        p1_1.calcularSFP1();
        
        System.out.println("------------3------------");       
        Profesional2 p2_1=new Profesional2();
        p2_1.dt=20;
        p2_1.pd=300;
        p2_1.ant=2;   
        p2_1.calcularSL();
        p2_1.calcularBA();
        p2_1.calcularSFP2();       
    }
}
