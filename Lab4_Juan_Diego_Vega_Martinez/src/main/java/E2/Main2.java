
package E2;
public class Main2 {
    public static void main(String[] args) {
        System.out.println("------------1------------");
        Trabajador t1=new Trabajador();
        t1.setDt(10);
        t1.setPd(150);
        
        t1.calcularSL();
        
        System.out.println("------------2------------");       
        Profesional1 p1_1=new Profesional1();
        p1_1.setIdp("p1");      
        p1_1.setDt(10);
        p1_1.setPd(220);
        
        p1_1.calcularSL();
        p1_1.idp1();
        p1_1.calcularBT();
        p1_1.calcularSFP1();
        
        System.out.println("------------3------------");       
        Profesional2 p2_1=new Profesional2();
        p2_1.setDt(20);
        p2_1.setPd(300);
        p2_1.setAnt(2);
        
        p2_1.calcularSL();
        p2_1.calcularBA();
        p2_1.calcularSFP2();
    }   
}
