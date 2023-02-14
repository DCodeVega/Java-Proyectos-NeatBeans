package Ej10;
import java.lang.reflect.Method;
public class Main10 {
    public static void main(String[] args)throws Exception {
        
      Programador t1=new Programador("Alejandra", "142536 BN", 30, 60, 10);
      
      System.out.println("----------------------------");
      
      Method m11=t1.getClass().getDeclaredMethod("IdentificacionProg", new Class[0]);
      m11.setAccessible(true);
      m11.invoke(t1, new Object[0]);
      
      Method m12=t1.getClass().getDeclaredMethod("calcularSLProg", new Class[0]);
      m12.setAccessible(true);
      m12.invoke(t1, new Object[0]);
      
      Method m13=t1.getClass().getDeclaredMethod("calcularDescuentoProg", new Class[0]);
      m13.setAccessible(true);
      m13.invoke(t1, new Object[0]);
      
      Method m14=t1.getClass().getDeclaredMethod("calcularSFProg", new Class[0]);
      m14.setAccessible(true);
      m14.invoke(t1, new Object[0]);
      
      Analista t2=new Analista("Adriana", "963852 PD", 25, 70, 30);
      
      System.out.println("----------------------------");
      
      Method m21=t2.getClass().getDeclaredMethod("IdentificacionAnl", new Class[0]);
      m21.setAccessible(true);
      m21.invoke(t2, new Object[0]);
      
      Method m22=t2.getClass().getDeclaredMethod("calcularSLAnl", new Class[0]);
      m22.setAccessible(true);
      m22.invoke(t2, new Object[0]);
      
      Method m23=t2.getClass().getDeclaredMethod("calcularDescuentoAnl", new Class[0]);
      m23.setAccessible(true);
      m23.invoke(t2, new Object[0]);
      
      Method m24=t2.getClass().getDeclaredMethod("calcularBonoAnl", new Class[0]);
      m24.setAccessible(true);
      m24.invoke(t2, new Object[0]);
      
      Method m25=t2.getClass().getDeclaredMethod("calcularSFAnl", new Class[0]);
      m25.setAccessible(true);
      m25.invoke(t2, new Object[0]);
      
      Adminnistrador_de_datos t3=new Adminnistrador_de_datos("Laura", "654321 TJ", 30, 50, 20, 2);
      
      System.out.println("----------------------------");
      
      Method m31=t3.getClass().getDeclaredMethod("IdentificacionDBA", new Class[0]);
      m31.setAccessible(true);
      m31.invoke(t3, new Object[0]);
      
      Method m32=t3.getClass().getDeclaredMethod("calcularSLDBA", new Class[0]);
      m32.setAccessible(true);
      m32.invoke(t3, new Object[0]);
      
      Method m33=t3.getClass().getDeclaredMethod("calcularDescuentoDBA", new Class[0]);
      m33.setAccessible(true);
      m33.invoke(t3, new Object[0]);
      
      Method m34=t3.getClass().getDeclaredMethod("calcularBonoDBA", new Class[0]);
      m34.setAccessible(true);
      m34.invoke(t3, new Object[0]);
      
      Method m35=t3.getClass().getDeclaredMethod("calcularSFDBA", new Class[0]);
      m35.setAccessible(true);
      m35.invoke(t3, new Object[0]);
      
      Adminnistrador_de_datos t4=new Adminnistrador_de_datos("", "", 0, 0, 0, 0);
      
      System.out.println("----------------------------");
      
      Method m4=t4.getClass().getDeclaredMethod("LeerDBA", new Class[0]);
      m4.setAccessible(true);
      m4.invoke(t4, new Object[0]);
      
      Method m41=t4.getClass().getDeclaredMethod("IdentificacionDBA", new Class[0]);
      m41.setAccessible(true);
      m41.invoke(t4, new Object[0]);
      
      Method m42=t4.getClass().getDeclaredMethod("calcularSLDBA", new Class[0]);
      m42.setAccessible(true);
      m42.invoke(t4, new Object[0]);
      
      Method m43=t4.getClass().getDeclaredMethod("calcularDescuentoDBA", new Class[0]);
      m43.setAccessible(true);
      m43.invoke(t4, new Object[0]);
      
      Method m44=t4.getClass().getDeclaredMethod("calcularBonoDBA", new Class[0]);
      m44.setAccessible(true);
      m44.invoke(t4, new Object[0]);
      
      Method m45=t4.getClass().getDeclaredMethod("calcularSFDBA", new Class[0]);
      m45.setAccessible(true);
      m45.invoke(t4, new Object[0]);
    }   
}
