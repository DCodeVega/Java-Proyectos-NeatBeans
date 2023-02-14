
package E8;
import java.util.Scanner;
public class Trabajador {
    private int dt,pd;
    private double sl,d,bt,sf;       
    public void leer(){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingresar Dias Trabajados: ");
        dt=leer.nextInt();
        System.out.println("Ingresar Pago Diario: ");
        pd=leer.nextInt();
    }
    public void calcularSL(){           
        sl=dt*pd;
        System.out.println("Sueldo Liquido: "+sl+" Bs");        
    }
    public void calcularD(){
        d=0.1*sl;
        System.out.println("Descuento: "+d+" Bs");  
    }
    public void calcularBT(){
        bt=5*dt;
        System.out.println("Bono té: "+bt+" Bs");
    }
    public void calcularSF(){
        sf=(sl+bt)-d;
        System.out.println("Sueldo Final: "+sf+" Bs");
        System.out.println("::::::::Termino la Informacion de esta Persona::::::::");
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
    public double getSl() {
        return sl;
    }
    public void setSl(double sl) {
        this.sl = sl;
    }
    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }
    public double getSf() {
        return sf;
    }
    public void setSf(double sf) {
        this.sf = sf;
    }
}
