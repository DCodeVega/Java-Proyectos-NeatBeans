
package E2;

public class Main2 {

    public static void main(String[] args) {
        Trabajador t1=new Trabajador();
        t1.setNombre("Juan");
        t1.setAnt(3);
        t1.mostrar();
        t1.cSalarioF();
        System.out.println("");
        System.out.println("--------------------");
        Trabajador t2=new Trabajador();
        t2.setNombre("Maria");
        t2.setAnt(6);
        t2.mostrar();
        t2.cSalarioF();
        System.out.println("");
        System.out.println("--------------------");
        Trabajador t3=new Trabajador();
        t3.setNombre("Ana");
        t3.setAnt(16);
        t3.mostrar();
        t3.cSalarioF();
        
        
        

    }
    
}
