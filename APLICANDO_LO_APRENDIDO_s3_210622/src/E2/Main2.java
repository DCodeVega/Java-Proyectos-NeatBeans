package E2;
import java.lang.reflect.Method;
public class Main2 {
    public static void main(String[] args) throws Exception{
        Trabajador t1=new Trabajador (55, 25);
        
        Method m1=t1.getClass().getDeclaredMethod("calcularSL", new Class [0]);
        m1.setAccessible(true);
        m1.invoke(t1, new Object[0]);
        
        Contador t2=new Contador(10, 28, 45);
        
        Method m2=t2.getClass().getDeclaredMethod("calcularSLdeContador", new Class [0]);
        m2.setAccessible(true);
        m2.invoke(t2, new Object[0]);
        
        Method m3=t2.getClass().getDeclaredMethod("calcularTD", new Class [0]);
        m3.setAccessible(true);
        m3.invoke(t2, new Object[0]);
        
        Method m4=t2.getClass().getDeclaredMethod("calcularSF", new Class [0]);
        m4.setAccessible(true);
        m4.invoke(t2, new Object[0]);
        
        Contador t3=new Contador(0, 0, 0);
        
        Method m=t3.getClass().getDeclaredMethod("leerC", new Class [0]);
        m.setAccessible(true);
        m.invoke(t3, new Object[0]);
        
        Method m5=t3.getClass().getDeclaredMethod("calcularSLdeContador", new Class [0]);
        m5.setAccessible(true);
        m5.invoke(t3, new Object[0]);
        
        Method m6=t3.getClass().getDeclaredMethod("calcularTD", new Class [0]);
        m6.setAccessible(true);
        m6.invoke(t3, new Object[0]);
        
        Method m7=t3.getClass().getDeclaredMethod("calcularSF", new Class [0]);
        m7.setAccessible(true);
        m7.invoke(t3, new Object[0]);
    } 
}
