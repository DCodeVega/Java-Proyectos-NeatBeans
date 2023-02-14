package E2;
import java.util.Scanner;
public class Contador extends Trabajador{
    private double dxm=1.50,tr,td,sf;
    
    public Contador(double tr, int pd, int dt) {
        super(pd, dt);
        this.tr = tr;
    }   
    public void leerC(){
        Scanner leer=new Scanner (System.in);
        System.out.println("**********************************");
        System.out.print("Introducir Días Trabajados: ");
        setDt(leer.nextInt());
        System.out.print("Introduucir Pago Diario:    ");
        setPd(leer.nextInt()); 
        System.out.print("Ingresar Tiempo de Retraso: ");
        tr=leer.nextInt();
    }   
    private void calcularSLdeContador(){       
        System.out.println("**********************************");   
        setSl(getDt()*getPd());
        System.out.println("Dias Trabajados: "+getDt()+" , Pago Diario: "+getPd()+" Bs");
        System.out.println("Total Salario Liquido es:  "+getSl()+" Bs");
        System.out.println("Total Salario Liquido: "+getSl()+" Bs");
    }
    
    private void calcularTD(){
        Scanner leer2=new Scanner (System.in);
        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        
        td=dxm*tr;
        System.out.println("Total Descuento: "+td+" Bs");
    }
    private void calcularSF(){
        sf=getSl()-td;
        System.out.println("Total Salario Final: "+sf+" Bs");
    }      
}
