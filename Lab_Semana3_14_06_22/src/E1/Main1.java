
package E1;
import java.lang.reflect.Method;
public class Main1 {

    public static void main(String[] args)throws Exception {
        // Trabajador 1
        Trabajador t1=new Trabajador (30, 60);
        
        Method m1=t1.getClass().getDeclaredMethod("calcularSL", new Class[0]);
        m1.setAccessible(true);
        m1.invoke(m1, new Object [0]);
        
        // Trabajador 2 (Contador)
        Contador t2=new Contador (8.0, 31, 80);              
        
        Method m2=t2.getClass().getDeclaredMethod("cDescuentoTotal", new Class [0]);
        m2.setAccessible(true);
        m2.invoke(m1, new Object[0]);
        
        Method m3=t2.getClass().getDeclaredMethod("cSalarioFinal", new Class [0]);
        m3.setAccessible(true);
        m3.invoke(m3, new Object [0]);

    }
    
    
}
