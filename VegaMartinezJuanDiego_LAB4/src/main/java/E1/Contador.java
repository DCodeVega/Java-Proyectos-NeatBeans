
package E1;

public class Contador extends Trabajador{
    public int dm=3,tr,td,sf;

    public Contador(int tr, int dt, int pd) {
        super(dt, pd);
        this.tr = tr;
    }
    
    public void calcularDT(){
        td=dm*tr;
        System.out.println("Por "+tr+" minutos de Retraso, con una Tarifa de "+dm+" Bs por minuto.Total Descuento es de: "+td+" Bs");
    }
    public void calcularSF(){
        sf=sl-td;
        System.out.println("Salario Final del Contador: "+sf+" Bs");
    }
}
