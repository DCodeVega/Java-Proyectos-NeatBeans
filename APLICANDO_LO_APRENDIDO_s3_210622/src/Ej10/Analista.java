package Ej10;
import java.util.Scanner;
public class Analista extends Ingenieros{

    public Analista(String nombre, String ci, double dt, double pd, double tr) {
        super(nombre, ci, dt, pd, tr);
    }
    private void LeerAnl(){
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
    
    private void IdentificacionAnl(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("C.I. : "+getCi());
    }
    private void calcularSLAnl(){
        setSl(getDt()*getPd());
        System.out.println("Salario Liquido del Analista: "+getSl()+" Bs");
    }
    private void calcularDescuentoAnl(){
        setDxm(1);
        setdAFP(0.16*getSl());
        setTd((getDxm()*getTr())+getdAFP());
        System.out.println("Descuento de: "+getDxm()+" Bs por minuto, tiempo de "
                + "Retraso: "+getTr()+" minutos");
        System.out.println("Descuento de la AFP: "+getdAFP()+" Bs");
        System.out.println("Total Descuento: "+getTd()+" Bs");
    }
    private void calcularBonoAnl(){
        setbAntg(getSl()*0.05);
        System.out.println("Bono Antiguedad: "+getbAntg()+" Bs");
        setbTotal(getbAntg());
        System.out.println("Bono Total: "+getbTotal());
    }
    private void calcularSFAnl(){
        setSf((getSl()-getTd())+getbTotal());
        System.out.println("Salario Final Total: "+getSf()+" Bs");
    }
}
