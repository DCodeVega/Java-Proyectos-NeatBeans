
package E4;

public class Trabajador {
    int dt,pd;
    double sl,dp,drc,cafp,as,td,bt,sf;
    
    public void calcularSL(){
        sl=dt*pd;
        System.out.println("Salario Liquido: "+sl+" Bs");
    }
    public void calcularDP(){
        dp= 0.01*sl;
        System.out.println("Descuento Provisional del Trabajo: "+dp+" Bs");
    } 
    public void calcularDRC(){
        drc=0.0171*sl;
        System.out.println("Descuento al Riesgo Comun: "+drc+" Bs");
    }
    public void calcularCAFP(){
        cafp=0.005*sl;
        System.out.println("Comision a la AFP: "+cafp+" Bs");
    }
    public void calcularAS(){
        as=0.005*sl;
        System.out.println("Aporte Solidario: "+as+" Bs");
    }
    public void calcularTD(){
        td=dp+drc+cafp+as;
        System.out.println("Total Descuento: "+td+" Bs");
    }
    public void calcularBT(){
        bt=7.50*dt;
        System.out.println("Bono Té: "+bt+" Bs");
    }
    public void calcularSF(){
        sf=(sl+bt)-td;
        System.out.println("Salario Final: "+sf+" Bs");
    }
}
