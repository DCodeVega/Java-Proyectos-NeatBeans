
package E1;

public class Trabajador {
    public int dt,pd;
    public int sl;
    
    public void calcularSL(){
        sl=dt*pd;
        System.out.println("Salario Liquido: "+sl+" Bs");
    }
    
}
