
package E2;
import java.util.Scanner;
public class trabajador {
    public int dt,pd,sl;
    
    public void leer(){
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingresar Dias Trabajados: ");
        dt = leer.nextInt();
        System.out.print("Ingresar Pago Diario: ");
        pd = leer.nextInt();        
    }
    public void calcularSL(){
        sl=dt*pd;
        System.out.println("Salario Liquido: "+sl);
    }
}
