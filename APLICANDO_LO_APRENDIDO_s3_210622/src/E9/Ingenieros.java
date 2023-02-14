package E9;
import java.util.Scanner;
public class Ingenieros {
    public String nombre,ci;   
    public double sl,dt,pd,cb,tr,dxm,td,sf,dExtras;
    public double dAFP,bAntg,bDextras,bTotal;

    public Ingenieros(String nombre, String ci, double dt, double pd, double tr) {
        this.nombre = nombre;
        this.ci = ci;
        this.dt = dt;
        this.pd = pd;
        this.tr = tr;
    }     
    public Ingenieros(String nombre, String ci, double dt, double pd, double tr, double dExtras) {
        this.nombre = nombre;
        this.ci = ci;
        this.dt = dt;
        this.pd = pd;
        this.tr = tr;
        this.dExtras = dExtras;
    }   
    public void leer(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar Nombre: ");
        nombre=leer.nextLine();
        System.out.println("Ingresar C.I. : ");
        ci=leer.nextLine();
        System.out.println("Ingresar Dias Trabajados: ");
        dt=leer.nextInt();
        System.out.println("Ingresar Pago Diario: ");
        pd=leer.nextInt();
        System.out.println("Ingresar Tiempo de Retraso: ");
        tr=leer.nextInt();
        System.out.println("Ingresar Dias Extras Trabajados: ");
        dExtras=leer.nextInt();
    }  
}
