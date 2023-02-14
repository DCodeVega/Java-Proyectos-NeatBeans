package E1;
public class Contador extends Trabajador{
    public double dxm=1.50,tr,td,sf;

    public Contador(double tr, int dt, int pd) {
        super(dt, pd);
        this.tr = tr;
    }
          
    public void calcularTD(){       
        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");     
        td=dxm*tr;
        System.out.println("Descuento de: "+dxm+" Bs por minuto,"
                + " tiempo de retraso es de: "+tr+" minutos");
        System.out.println("Descuento Total es de:      "+td+" Bs");          
    }
    public void calcularSF(){
        sf=sl-td;
        System.out.println("Total Salario Final:        "+sf+" Bs");
    }      
}
