package E9;
public class Adminnistrador_de_datos extends Ingenieros{
    public Adminnistrador_de_datos(String nombre, String ci, double dt, double pd,
            double tr, double dExtras) {
        super(nombre, ci, dt, pd, tr, dExtras);
    } 
   public void IdentificacionDBA(){
       System.out.println("Nombre: "+nombre);
       System.out.println("C.I. : "+ci);
   }
   public void calcularSLDBA(){
       sl=dt*pd;
       System.out.println("Salario Liquido del Administrador de Base de Datos: "+sl+" Bs");
   }
   public void calcularDescuentoDBA(){
       dxm=2;
       td=dxm*tr;
       System.out.println("Descuento de: "+dxm+" Bs por minuto, tiempo de Retraso: "+tr+" minutos");
       System.out.println("Total Descuento: "+td+" Bs");
   }
   public void calcularBonoDBA(){
       bAntg=sl*0.15;
       System.out.println("Bono Antiguedad: "+bAntg+" Bs");
       bDextras=(0.10*sl)*dExtras;
       System.out.println("Dias Extras Trabajados: "+dExtras+" Dias");
       System.out.println("Bono Dias Extras: "+bDextras+" Bs");
       bTotal=bAntg+bDextras;
       System.out.println("Bono Total: "+bTotal+" Bs");  
   }
   public void calcularSFDBA(){
       sf=(sl-td)+bTotal;
       System.out.println("Salario Final: "+sf+" Bs");
   }  
}
