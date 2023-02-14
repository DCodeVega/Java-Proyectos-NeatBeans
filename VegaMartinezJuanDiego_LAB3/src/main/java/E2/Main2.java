
package E2;

public class Main2 {

    public static void main(String[] args) {
        Trabajador t1=new Trabajador(15, 80);
        t1.calcularSL();
        t1.calcularTD();
        t1.calcularSF();
        
        Trabajador t2=new Trabajador();
        t2.leer();
        t2.calcularSL();
        t2.calcularTD();
        t2.calcularSF();
        
 
    }
    
}
