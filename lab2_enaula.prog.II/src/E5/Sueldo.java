
package E5;

public class Sueldo {
    int dt,pd;
    double sl,d,bt,sf;
    public void calcularSL(){
        sl=dt*pd;
        System.out.println("Sueldo Liquido: "+sl);
    
    }
    public void calcularD(){
        d=0.1*sl;
        System.out.println("Descuento: "+d);
    
    }
    public void calcularBT(){
        bt=5*dt;
        System.out.println("Bono Té:"+bt);
    
    }
    public void calcularSF(){
        sf=(sl+bt)-d;
        System.out.println("Sueldo Final: "+sf);
    
    }
    
}
