package E8;
import java.lang.reflect.Method;
public class main8 {

    public static void main(String[] args)throws Exception {
        Triangulo o1=new Triangulo(0);
        
        Method m1=o1.getClass().getDeclaredMethod("Mensaje", new Class [0]);
        m1.setAccessible(true);
        m1.invoke(o1, new Object [0]);
        
        TRectangulo t1=new TRectangulo(6, 5, 4);               
        
        Method m22=t1.getClass().getDeclaredMethod("calcularPerimetroR", new Class[0]);
        m22.setAccessible(true);
        m22.invoke(t1, new Object [0]);
        
        Method m23=t1.getClass().getDeclaredMethod("calcularAreaR", new Class[0]);
        m23.setAccessible(true);
        m23.invoke(t1, new Object [0]);
        
        Method m24=t1.getClass().getDeclaredMethod("calcularAlturaR", new Class[0]);
        m24.setAccessible(true);
        m24.invoke(t1, new Object [0]);
        
        TIsosceles t2=new TIsosceles(12, 4);
        
        Method m32=t2.getClass().getDeclaredMethod("calcularPerimetroI", new Class[0]);
        m32.setAccessible(true);
        m32.invoke(t2, new Object [0]);
        
        Method m33=t2.getClass().getDeclaredMethod("calcularAreaI", new Class[0]);
        m33.setAccessible(true);
        m33.invoke(t2, new Object [0]);
        
        Method m34=t2.getClass().getDeclaredMethod("calcularAlturaI", new Class[0]);
        m34.setAccessible(true);
        m34.invoke(t2, new Object [0]);
        
        TEquilatero t3=new TEquilatero(15);
        
        Method m42=t3.getClass().getDeclaredMethod("calcularPerimetroE", new Class[0]);
        m42.setAccessible(true);
        m42.invoke(t3, new Object [0]);
        
        Method m43=t3.getClass().getDeclaredMethod("calcularAreaE", new Class[0]);
        m43.setAccessible(true);
        m43.invoke(t3, new Object [0]);
        
        Method m44=t3.getClass().getDeclaredMethod("calcularAlturaE", new Class[0]);
        m44.setAccessible(true);
        m44.invoke(t3, new Object [0]);
        
        TRectangulo t4=new TRectangulo(0, 0, 0);
        
        Method m51=t4.getClass().getDeclaredMethod("leerTR", new Class[0]);
        m51.setAccessible(true);
        m51.invoke(t4, new Object [0]);
        
        Method m52=t4.getClass().getDeclaredMethod("calcularPerimetroR", new Class[0]);
        m52.setAccessible(true);
        m52.invoke(t4, new Object [0]);
        
        Method m53=t4.getClass().getDeclaredMethod("calcularAreaR", new Class[0]);
        m53.setAccessible(true);
        m53.invoke(t4, new Object [0]);
        
        Method m54=t4.getClass().getDeclaredMethod("calcularAlturaR", new Class[0]);
        m54.setAccessible(true);
        m54.invoke(t4, new Object [0]);
        
        TIsosceles t5=new TIsosceles(0, 0);
        
        Method m61=t5.getClass().getDeclaredMethod("leerTI", new Class[0]);
        m61.setAccessible(true);
        m61.invoke(t5, new Object [0]);
        
        Method m62=t5.getClass().getDeclaredMethod("calcularPerimetroI", new Class[0]);
        m62.setAccessible(true);
        m62.invoke(t5, new Object [0]);
        
        Method m63=t5.getClass().getDeclaredMethod("calcularAreaI", new Class[0]);
        m63.setAccessible(true);
        m63.invoke(t5, new Object [0]);
        
        Method m64=t5.getClass().getDeclaredMethod("calcularAlturaI", new Class[0]);
        m64.setAccessible(true);
        m64.invoke(t5, new Object [0]);
        
        TEquilatero t6=new TEquilatero(15);
        
        Method m71=t6.getClass().getDeclaredMethod("leerTE", new Class[0]);
        m71.setAccessible(true);
        m71.invoke(t6, new Object [0]);
        
        Method m72=t6.getClass().getDeclaredMethod("calcularPerimetroE", new Class[0]);
        m72.setAccessible(true);
        m72.invoke(t6, new Object [0]);
        
        Method m73=t6.getClass().getDeclaredMethod("calcularAreaE", new Class[0]);
        m73.setAccessible(true);
        m73.invoke(t6, new Object [0]);
        
        Method m74=t6.getClass().getDeclaredMethod("calcularAlturaE", new Class[0]);
        m74.setAccessible(true);
        m74.invoke(t6, new Object [0]);
    }  
}
