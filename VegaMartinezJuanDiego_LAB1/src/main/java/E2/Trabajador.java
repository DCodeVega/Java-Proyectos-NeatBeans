
package E2;

public class Trabajador {
    String nombre;
    int dt,sh;
    int sl;
    public void calcularSL(){
        sl=dt*sh;
        System.out.println("Salario Liquido Total: "+sl+" Bs");
    }
}
