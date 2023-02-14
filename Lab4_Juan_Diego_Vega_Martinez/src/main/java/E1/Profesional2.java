
package E1;

public class Profesional2 extends Trabajador{
    public int ant;
    public double ba,sfp2;
    
    public void calcularBA(){
        if(ant>2){
            if(ant>5){
                if(ant>7){
                    ba=(sl*001);
                    System.out.println("Bono de Antiguedad: "+ba+" Bs");
                }
                else{
                    ba=(sl*0.75);
                    System.out.println("Bono de Antiguedad: "+ba+" Bs");
                }
            }
            else{
                ba=(sl*0.50);
                    System.out.println("Bono de Antiguedad: "+ba+" Bs");
            }
        }
        else{
            ba=(sl*0);
                System.out.println("Bono de Antiguedad: "+ba+" Bs");
        }
    }
    public void calcularSFP2(){
        sfp2=sl+ba;
        System.out.println("Salario Final de Profesional 2: "+sfp2+" Bs");
    }
}
