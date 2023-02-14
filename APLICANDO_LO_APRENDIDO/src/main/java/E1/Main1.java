
package E1;
import java.lang.reflect.Method;

public class Main1 {

    public static void main(String[] args)throws Exception {
        //creando trinagulo 1 (usando sus atributos)
        T_Isoceles trg1=new T_Isoceles();
        trg1.setA(10);
        trg1.setB(5);
        System.out.println("Lado a: "+trg1.getA());
        System.out.println("Lado b: "+trg1.getB());
        
        //creando los calculos 1 (usando sus operaciones/Metodo)
        Method cP1=trg1.getClass().getDeclaredMethod("cPerimetro", new Class [0]);
        cP1.setAccessible(true);
        cP1.invoke(trg1, new Object [0]);        
        // Perimetro t1
        Method cA1=trg1.getClass().getDeclaredMethod("cArea", new Class[0]);
        cA1.setAccessible(true);
        cA1.invoke(trg1, new Object [0]);
        // Area t1
        
        //creando trinagulo 1 (usando sus atributos)
        System.out.println("*******SEGUNDO OBJETO*********");       
        T_Isoceles trg2=new T_Isoceles();
        trg2.setA(20);
        trg2.setB(10);
        System.out.println("Lado a: "+trg2.getA());
        System.out.println("Lado b: "+trg2.getB());
        
        //creando los calculos 1 (usando sus operaciones/metodo)
        Method cP2=trg2.getClass().getDeclaredMethod("cPerimetro", new Class [0]);
        cP2.setAccessible(true);
        cP2.invoke(trg2, new Object [0]);
        // Perimetro t2
        Method cA2=trg2.getClass().getDeclaredMethod("cArea", new Class [0]);
        cA2.setAccessible(true);
        cA2.invoke(trg2, new Object[0]);
        // Area t2
 
    }
    
}
