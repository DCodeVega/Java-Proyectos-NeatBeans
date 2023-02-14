
package E1;

public class Trabajador {
    public int dt,pd,sl;

    public Trabajador(int dt, int pd) {
        this.dt = dt;
        this.pd = pd;
    }   
    
    public void calcularSL(){
        sl=dt*pd;
        System.out.println("El Salario Liquido es: "+sl+" Bs");
    }
        
}
