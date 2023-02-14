
package PaquetePrueba;
import E1.Equilatero;
import java.lang.reflect.Method;

public class MainPrueba1 {

    public static void main(String[] args)throws Exception {
        Equilatero t3=new Equilatero();
        t3.setLa(20);
        System.out.println("Lados del Triangulo Equilatero: "+t3.getLa());
        System.out.println(":::::::::::equilatero 3ro:::::::::::");
        
        Method op3=t3.getClass().getDeclaredMethod("cPerimetro",new Class [0]);
        op3.setAccessible(true);
        op3.invoke(t3, new Object [0]);
        
        Method oa3=t3.getClass().getDeclaredMethod("cArea", new Class[0]);
        oa3.setAccessible(true);
        oa3.invoke(t3, new Object [0]);

    }
    
}
