
package E5;
public class ComprasSinPromocion extends Factura{
    public double impuesto;
    
    public void calcularImpuesto(){
        impuesto=subtotal*0.16;
        System.out.println("Total Impuestos: "+impuesto+" Bs");
    }
    public void calcularTotalCsP(){
        total=subtotal+impuesto;
        System.out.println("Total: "+total+" Bs");
    }
}
