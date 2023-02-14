package Ej10;
import java.util.Scanner;
public class Programador extends Ingenieros {

    public Programador(String nombre, String ci, double dt, double pd, double tr) {
        super(nombre, ci, dt, pd, tr);        
    }
    private void LeerProg(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar Nombre: ");
        setNombre(leer.nextLine());
        System.out.println("Ingresar C.I. : ");
        setCi(leer.nextLine());
        System.out.println("Ingresar Dias Trabajados: ");
        setDt(leer.nextInt());
        System.out.println("Ingresar Pago Diario: ");
        setPd(leer.nextInt());
        System.out.println("Ingresar Tiempo de Retraso: ");
        setTr(leer.nextInt());
        System.out.println("Ingresar Dias Extras Trabajados: ");
        setdExtras(leer.nextInt());
    }
    private void IdentificacionProg(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("C.I. : "+getCi());
    }
    private void calcularSLProg(){
        setSl(getDt()*getPd());
        System.out.println("Salario Liquido del Programador: "+getSl()+" Bs");
    }
    private void calcularDescuentoProg(){
         setDxm(1.50);
         setTd(getTr()*getDxm());
         System.out.println("Descuento de: "+getDxm()+" Bs por minuto, tiempo de"
                 + " Retraso: "+getTr()+" minutos");
         System.out.println("Total Descuento: "+getTd()+" Bs");        
    }
    private void calcularSFProg(){
        setSf(getSl()-getTd());
        System.out.println("Salario Final Total: "+getSf()+" Bs");
    }
}
