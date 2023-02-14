
package E1;

public class Main1 {

    public static void main(String[] args) {
        Trabajador t1=new Trabajador(30, 50);
        t1.calcularSL();
        
        Contador t2=new Contador(6, 30, 90);
        t2.calcularSL();
        t2.calcularDT();
        t2.calcularSF();

    }
    
}
