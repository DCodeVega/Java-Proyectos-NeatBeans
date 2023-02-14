
package E1;

public class Profesional1 extends Trabajador{
    public String idp;
    public int bt,sfp1;
    
    public void idp1(){
        System.out.println("ID de Profesional 1: "+idp);
    }
    
    public void calcularBT(){
        bt=dt*5;
        System.out.println("Bono Té: "+bt+" Bs");        
    }
    public void calcularSFP1(){
        sfp1=sl+bt;
        System.out.println("Salario Final de Profesional 1: "+sfp1+" Bs");
    }
}
