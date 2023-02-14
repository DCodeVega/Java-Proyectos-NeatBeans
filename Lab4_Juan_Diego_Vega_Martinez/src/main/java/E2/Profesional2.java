
package E2;

public class Profesional2 extends Trabajador{
    private int ant;
    private double ba,sfp2;
    
    public void calcularBA(){
        if(ant>2){
            if(ant>5){
                if(ant>7){
                    ba=(getSl()*001);
                    System.out.println("Bono de Antiguedad: "+ba+" Bs");
                }
                else{
                    ba=(getSl()*0.75);
                    System.out.println("Bono de Antiguedad: "+ba+" Bs");
                }
            }
            else{
                ba=(getSl()*0.50);
                    System.out.println("Bono de Antiguedad: "+ba+" Bs");
            }
        }
        else{
            ba=(getSl()*0);
                System.out.println("Bono de Antiguedad: "+ba+" Bs");
        }
    }
    public void calcularSFP2(){
        sfp2=getSl()+ba;
        System.out.println("Salario Final de Profesional 2: "+sfp2+" Bs");
    }
    public void setAnt(int ant) {
        this.ant = ant;
    }
    
}
