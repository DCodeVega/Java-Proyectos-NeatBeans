package Ej10;
import java.util.Scanner;
public class Adminnistrador_de_datos extends Ingenieros{

    public Adminnistrador_de_datos(String nombre, String ci, double dt, double pd,
            double tr, double dExtras) {
        super(nombre, ci, dt, pd, tr, dExtras);
    }
    private void LeerDBA(){
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
   private void IdentificacionDBA(){
       System.out.println("Nombre: "+getNombre());
       System.out.println("C.I. : "+getCi());
   }
   private void calcularSLDBA(){
       setSl(getDt()*getPd());
       System.out.println("Salario Liquido del Administrador de Base de Datos: "
               + ""+getSl()+" Bs");
   }
   private void calcularDescuentoDBA(){
       setDxm(2);
       setTd(getDxm()*getTr());
       System.out.println("Descuento de: "+getDxm()+" Bs por minuto, tiempo de "
               + "Retraso: "+getTr()+" minutos");
       System.out.println("Total Descuento: "+getTd()+" Bs");
   }
   private void calcularBonoDBA(){
       setbAntg(getSl()*0.15);
       System.out.println("Bono Antiguedad: "+getbAntg()+" Bs");
       setbDextras((0.10*getSl())*getdExtras());
       System.out.println("Dias Extras Trabajados: "+getdExtras()+" Dias");
       System.out.println("Bono Dias Extras: "+getbDextras()+" Bs");
       setbTotal(getbAntg()+getbDextras());
       System.out.println("Bono Total: "+getbTotal()+" Bs");
       
   }
   private void calcularSFDBA(){
       setSf((getSl()-getTd())+getbTotal());
       System.out.println("Salario Final: "+getSf()+" Bs");
   }   
}
