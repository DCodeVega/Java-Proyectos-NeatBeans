
package E3;
import java.lang.reflect.Method;
public class Main3 {
    public static void main(String[] args) throws Exception {
        Suma obj1=new Suma();
        obj1.setN1(37);
        obj1.setN2(46);
        
        Method o1=obj1.getClass().getDeclaredMethod("sumar",new Class [0]);
        o1.setAccessible(true);
        o1.invoke(obj1, new Object[0]);
    } 
}
