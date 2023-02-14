package E9;
public class Analista extends Ingenieros{

    public Analista(String nombre, String ci, double dt, double pd, double tr) {
        super(nombre, ci, dt, pd, tr);
    }
    
    public void IdentificacionAnl(){
        System.out.println("Nombre: "+nombre);
        System.out.println("C.I. : "+ci);
    }
    public void calcularSLAnl(){
        sl=dt*pd;
        System.out.println("Salario Liquido del Analista: "+sl+" Bs");
    }
    public void calcularDescuentoAnl(){
        dxm=1;
        dAFP=0.16*sl;       
        td=(dxm*tr)+dAFP;
        System.out.println("Descuento de: "+dxm+" Bs por minuto, tiempo de Retraso: "+tr+" minutos");       
        System.out.println("Descuento de la AFP: "+dAFP+" Bs");
        System.out.println("Total Descuento: "+td+" Bs");
    }
    public void calcularBonoAnl(){
        bAntg=sl*0.05;
        System.out.println("Bono Antiguedad: "+bAntg+" Bs");
        bTotal=bAntg;
        System.out.println("Bono Total: "+bTotal);
    }
    public void calcularSFAnl(){
        sf=(sl-td)+bTotal;
        System.out.println("Salario Final Total: "+sf+" Bs");
    }
}
