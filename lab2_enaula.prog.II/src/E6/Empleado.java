
package E6;


public class Empleado {
    String ci,estado,nombre;
    double sl,dj,dafp,drc,sf,dt;
    public void DescuentoJ(){
           dj= 0.1*sl;
           System.out.println("Descuento De Jubilación: "+dj+" Bs");
    }
    public void DescuentoAFP(){
        dafp=0.005*sl;
        System.out.println("Descuento por la AFP: "+dafp+" Bs");
    }
    public void DescuentoRC(){
        drc=0.0171*sl;
        System.out.println("Descuento por Riesgo Comun: "+drc+" Bs");
    }
    public void DescuentoT(){
        dt=dj+dafp+drc;
        System.out.println("Descuento Total: "+dt+" Bs");
    }
    public void calcularSF(){
        sf=sl-dt;
        System.out.println("Sueldo Final: "+sf+" Bs");
    }
}
