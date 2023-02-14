
package E1;
import java.lang.reflect.Method;
public class Main1 {

    public static void main(String[] args) throws Exception {
        Trabajador obj1=new Trabajador();
        obj1.setDt(14);
        obj1.setPd(80);
        
        Method o1=obj1.getClass().getDeclaredMethod("calcularSL", new Class[0]);
        o1.setAccessible(true);
        o1.invoke(obj1, new Object[0]);

    }
    
}
