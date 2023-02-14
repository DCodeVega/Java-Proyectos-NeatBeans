
package E1;
import java.lang.reflect.Method;
public class Main1 {

    public static void main(String[] args)throws Exception {
        Equilatero t1=new Equilatero();
        t1.setLa(5);
        System.out.println(":::::::::::equilatero 1ro:::::::::::");
        System.out.println("Lados del Triangulo Equilatero: "+t1.getLa());
        
        
        Method op1=t1.getClass().getDeclaredMethod("cPerimetro",new Class [0]);
        op1.setAccessible(true);
        op1.invoke(t1, new Object [0]);
        
        Method oa1=t1.getClass().getDeclaredMethod("cArea", new Class[0]);
        oa1.setAccessible(true);
        oa1.invoke(t1, new Object [0]);
        
        Method oh1=t1.getClass().getDeclaredMethod("cAltura", new Class[0]);
        oh1.setAccessible(true);
        oh1.invoke(t1, new Object[0]);
        
        Equilatero t2=new Equilatero();
        t2.setLa(10);
        System.out.println(":::::::::::equilatero 2do:::::::::::");
        System.out.println("Lados del Triangulo Equilatero: "+t2.getLa());
        
        
        Method op2=t2.getClass().getDeclaredMethod("cPerimetro",new Class [0]);
        op2.setAccessible(true);
        op2.invoke(t2, new Object [0]);
        
        Method oa2=t2.getClass().getDeclaredMethod("cArea", new Class[0]);
        oa2.setAccessible(true);
        oa2.invoke(t2, new Object [0]);
        
        Method oh2=t2.getClass().getDeclaredMethod("cAltura", new Class[0]);
        oh2.setAccessible(true);
        oh2.invoke(t2, new Object[0]);
        

    }
    
}




//Math,sqrt(4)==raiz =2
//Math.pow(2,3)==potencia  =8