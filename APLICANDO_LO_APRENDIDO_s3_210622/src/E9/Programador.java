package E9;
public class Programador extends Ingenieros {

    public Programador(String nombre, String ci, double dt, double pd, double tr) {
        super(nombre, ci, dt, pd, tr);        
    }    
    public void IdentificacionProg(){
        System.out.println("Nombre: "+nombre);
        System.out.println("C.I. : "+ci);
    }
    public void calcularSLProg(){
        sl=dt*pd;
        System.out.println("Salario Liquido del Programador: "+sl+" Bs");
    }
    public void calcularDescuentoProg(){
         dxm=1.50;
         td=tr*dxm;
         System.out.println("Descuento de: "+dxm+" Bs por minuto, tiempo de Retraso: "+tr+" minutos");
         System.out.println("Total Descuento: "+td+" Bs");        
    }
    public void calcularSFProg(){
        sf=sl-td;
        System.out.println("Salario Final Total: "+sf+" Bs");
    }
}
