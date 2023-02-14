
package E2;
import java.util.Scanner;
public class Contador extends trabajador{
    public int dm,tr,td,sf;
    
    public void leerC(){
        Scanner leerC=new Scanner(System.in);
        System.out.println("Ingresar su Descuento por minuto: ");
        dm=leerC.nextInt();
        System.out.println("Ingresar sus Minutos de retraso: ");
        tr=leerC.nextInt();
    }
    public void calcularDT(){
        td=dm*tr;
        System.out.println("total Descuento de retraso: "+td);
    }
    public void calcularSF(){
        sf=sl-td;
        System.out.println("Sueldo Total Final: "+sf);
    }
}
