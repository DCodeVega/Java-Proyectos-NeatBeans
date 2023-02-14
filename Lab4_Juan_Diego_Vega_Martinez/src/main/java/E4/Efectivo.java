
package E4;
public class Efectivo extends Pago{
    private double descuento;
    
    public void calcularDesc(){
        descuento=getImp()*0.10;
        System.out.println("Descuento Total: "+descuento+" Bs");
    }
}
