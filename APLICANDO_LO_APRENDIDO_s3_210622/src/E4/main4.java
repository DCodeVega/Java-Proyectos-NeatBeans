package E4;
import java.lang.reflect.Method;
public class main4 {

    public static void main(String[] args)throws Exception {
        Banco obj1=new Banco();
        Method m1=obj1.getClass().getDeclaredMethod("leer", new Class[0]);
        m1.setAccessible(true);
        m1.invoke(obj1, new Object[0]);
    }    
}
