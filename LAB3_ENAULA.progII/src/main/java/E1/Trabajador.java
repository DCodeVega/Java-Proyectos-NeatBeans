
package E1;

public class Trabajador {    
    private int dt,pd,sl;
    
    
    private void calcularSL(){
        sl=dt*pd;
        System.out.println("Salario Liquido: "+sl);
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public void setPd(int pd) {
        this.pd = pd;
    }

    
    
}
