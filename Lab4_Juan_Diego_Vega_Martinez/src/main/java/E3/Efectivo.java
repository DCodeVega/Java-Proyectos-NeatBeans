
package E3;

public class Efectivo extends Pago{
    public double descuento;
    
    public void calcularDesc(){
        descuento=imp*0.10;
        System.out.println("Descuento Total: "+descuento+" Bs");
    }
}
