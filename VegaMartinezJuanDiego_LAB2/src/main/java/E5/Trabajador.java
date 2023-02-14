
package E5;
public class Trabajador {
    private int dt,pd;
    private int sl;   
    private void calcularSL(){
        sl=dt*pd;
        System.out.println("Salario Liquido: "+sl);
    }
    public int getDt() {
        return dt;
    }
    public void setDt(int dt) {
        this.dt = dt;
    }
    public int getPd() {
        return pd;
    }
    public void setPd(int pd) {
        this.pd = pd;
    }
    public int getSl() {
        return sl;
    }
    public void setSl(int sl) {
        this.sl = sl;
    }  
}
