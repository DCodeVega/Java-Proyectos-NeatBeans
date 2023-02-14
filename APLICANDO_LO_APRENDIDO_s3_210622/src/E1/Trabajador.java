package E1;
import java.util.Scanner;
public class Trabajador {
    public int dt,pd,sl;

    public Trabajador(int dt, int pd) {
        this.dt = dt;
        this.pd = pd;
    }
    public void leer(){
        Scanner leer=new Scanner (System.in);
        System.out.println("**********************************");
        System.out.print("Introducir Días Trabajados: ");
        dt=leer.nextInt();
        System.out.print("Introduucir Pago Diario:    ");
        pd=leer.nextInt();        
    }       
    public void calcularSL(){   
        System.out.println("");
        System.out.println("**********************************");             
        sl=dt*pd;
        System.out.println("Dias Trabajados: "+dt+" , Pago Diario: "+pd+" Bs");
        System.out.println("Total Salario Liquido es:  "+sl+" Bs");        
    }
}
