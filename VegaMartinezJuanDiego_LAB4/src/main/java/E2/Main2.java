
package E2;

public class Main2 {

    public static void main(String[] args) {
        trabajador t1=new trabajador();
        t1.leer();
        t1.calcularSL();
        System.out.println("--------------");
        
        Contador t2=new Contador();
        t2.leer();
        t2.leerC();
        t2.calcularSL();
        t2.calcularDT();
        t2.calcularSF();
    
    }
    
}
