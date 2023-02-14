package Juego_Robot;
import java.lang.reflect.Method;
public class main1 {

    public static void main(String[] args)throws Exception {
        Presentacion escena1=new Presentacion();
        
        Method m1=escena1.getClass().getDeclaredMethod("Bienvenida", new Class[0]);
        m1.setAccessible(true);
        m1.invoke(escena1, new Object[0]);
                
        Juegos escena2=new Juegos();
        escena2.Juegos();        
    }
    
}
