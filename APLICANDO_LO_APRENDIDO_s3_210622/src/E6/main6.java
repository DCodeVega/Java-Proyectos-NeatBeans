package E6;
import java.lang.reflect.Method;
public class main6 {
    public static void main(String[] args)throws Exception {
        Numeros n1=new Numeros();
        
        Method m1=n1.getClass().getDeclaredMethod("CantidadNumeros", new Class[0]);
        m1.setAccessible(true);
        m1.invoke(n1, new Object[0]);
        
        Method m2=n1.getClass().getDeclaredMethod("leerNumeros", new Class[0]);
        m2.setAccessible(true);
        m2.invoke(n1, new Object[0]);
        
        Method m3=n1.getClass().getDeclaredMethod("MenuOperaciones", new Class[0]);
        m3.setAccessible(true);
        m3.invoke(n1, new Object[0]);       
    }   
}
