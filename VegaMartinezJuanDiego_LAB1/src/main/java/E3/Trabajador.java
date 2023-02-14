
package E3;

public class Trabajador {
    int ht,sh,dt,pd;
    double ss,sl,td,sf;
    public void calcularSS(){
        ss=ht*sh;
        System.out.println("Salario Semanal: "+ss+" Bs");   
    }
    public void calcularSL(){
        sl=dt*pd;
        System.out.println("Salario Liquido: "+sl+" Bs");
    }
    public void calcularTD(){
        td=0.020*sl;
        System.out.println("Total Descuento: "+td+" Bs");
    }
    public void calcularSF(){
        sf=sl-td;
        System.out.println("Salario Final: "+sf+" Bs");
    }
}
