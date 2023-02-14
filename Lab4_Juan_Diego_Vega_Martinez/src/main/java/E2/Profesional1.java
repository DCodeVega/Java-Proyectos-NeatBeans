
package E2;

public class Profesional1 extends Trabajador{
    private String idp;
    private int bt,sfp1;
    
    public void idp1(){
        System.out.println("ID de Profesional 1: "+idp);
    }
    
    public void calcularBT(){
        bt=getDt()*5;
        System.out.println("Bono Té: "+bt+" Bs");        
    }
    public void calcularSFP1(){
        sfp1=getSl()+bt;
        System.out.println("Salario Final de Profesional 1: "+sfp1+" Bs");
    }

    public void setIdp(String idp) {
        this.idp = idp;
    }     
}
