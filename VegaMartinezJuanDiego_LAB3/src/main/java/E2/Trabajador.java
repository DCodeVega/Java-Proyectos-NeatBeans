
package E2;
import java.util.Scanner;
public class Trabajador {
    public int dt,pd;
    public double sl,td,sf;

    public Trabajador(){
        
    }
    public Trabajador(int dt, int pd) {
        this.dt = dt;
        this.pd = pd;
    }
    
    public void calcularSL(){
        sl=dt*pd;
        System.out.println("Salario Liquido: "+sl+" Bs");
    }
    public void calcularTD(){
        td=0.02*sl;
        System.out.println("Total Descuento: "+td+" Bs");    
    }
    public void calcularSF(){
        sf=sl-td;
        System.out.println("Salario Final: "+sf+" Bs");
    }
    
    public void leer(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar Dias trabajados: ");
        dt = leer.nextInt();
        System.out.println("Ingresar tu Pago Diario: ");
        pd=leer.nextInt();
        
    }
}
