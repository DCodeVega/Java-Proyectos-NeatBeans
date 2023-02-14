package E2;
public class Trabajador {
    private int pd,dt,sl;

    public Trabajador(int pd, int dt) {
        this.pd = pd;
        this.dt = dt;
    }         
    //Getters y Setters
    public int getPd() {
        return pd;
    }
    public void setPd(int pd) {
        this.pd = pd;
    }
    public int getDt() {
        return dt;
    }
    public void setDt(int dt) {
        this.dt = dt;
    }
    public int getSl() {
        return sl;
    }
    public void setSl(int sl) {
        this.sl = sl;
    }
    //Metodos
    private void calcularSL(){   
        System.out.println("");
        System.out.println("**********************************");             
        sl=dt*pd;
        System.out.println("Dias Trabajados: "+dt+" , Pago Diario: "+pd+" Bs");
        System.out.println("Total Salario Liquido es:  "+sl+" Bs");        
    }
}
