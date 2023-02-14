
package E2;
import java.lang.reflect.Method;
public class Main2 {

    public static void main(String[] args)throws Exception{
        Numeros n1=new Numeros();
        n1.setTamaño(5);
        System.out.println("Cantidad de Numeros: "+n1.getTamaño());
        
        Method vl1=n1.getClass().getDeclaredMethod("iValores", new Class[0]);
        vl1.setAccessible(true);
        vl1.invoke(n1,new Object [0]);
        
        Method sm1=n1.getClass().getDeclaredMethod("cSuma", new Class [0]);
        sm1.setAccessible(true);
        sm1.invoke(n1,new Object [0]);
        
        Method pr1=n1.getClass().getDeclaredMethod("cPromedio", new Class[0]);
        pr1.setAccessible(true);
        pr1.invoke(n1,new Object [0]);
        
        
        Numeros n2=new Numeros();
        
        Method lr=n2.getClass().getDeclaredMethod("leer", new Class [0]);
        lr.setAccessible(true);
        lr.invoke(n2, new Object [0]);
        
        Method vl2=n2.getClass().getDeclaredMethod("iValores", new Class [0]);
        vl2.setAccessible(true);
        vl2.invoke(n2, new Object [0]);
        
        Method sm2=n2.getClass().getDeclaredMethod("cSuma", new Class [0]);
        sm2.setAccessible(true);
        sm2.invoke(n2, new Object [0]);
        
        Method pr2=n2.getClass().getDeclaredMethod("cPromedio", new Class [0]);
        pr2.setAccessible(true);
        pr2.invoke(n2, new Object [0]);
        

    }
    
}
