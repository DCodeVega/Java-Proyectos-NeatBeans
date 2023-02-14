
package E5;
public class ComprasPromocion extends Factura{
    public double desc;
    
    public void calcularDesctuento(){
        desc=subtotal*0.50;
        System.out.println("Descuento de Promocion: "+desc+" Bs");
    }
    public void calcularTotalCP(){
        total=subtotal-desc;
        System.out.println("Total: "+total+" Bs");
    }
}
