
package E4;

public class Trabajador {
    //atributos
    String nombre;
    int dt,pd;
    double sl,td,sf;
    //metodos
    public void calcularSL(){
        sl=dt*pd;
        System.out.println("Salario Liquido: "+sl);
    }
    public void calcularTD(){
        td=0.02*sl;
        System.out.println("total Descuento: "+td);       
    }
    public void calcularSF(){
        sf=sl-td;
        System.out.println("Sueldo Final: "+sf);
    }
}
