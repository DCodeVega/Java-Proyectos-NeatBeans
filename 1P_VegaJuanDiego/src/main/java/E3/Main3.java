
package E3;

public class Main3 {

    public static void main(String[] args) {
        Trabajador t1=new Trabajador();
        System.out.println("---------Trabajador 1------------");       
        t1.setNombre("Juan");
        t1.setSl(1000);
        t1.mostrar();
        t1.dAAFP();        
        t1.cSF();
        
        System.out.println("");
        System.out.println("---------Trabajador 2------------");
               
        Trabajador t2=new Trabajador();
        t2.setNombre("Maria");
        t2.setSl(5000);
        t2.mostrar();
        t2.dACP();
        t2.dARC();
        t2.dAAFP();
        t2.cSF();

    }
    
}
