
package E5;
public class Factura {
    public int nroFactura,pp,cp;
    public String ciCliente,producto;
    public double subtotal,total;
    
    public void InfoProductos(){
        System.out.println("Numero de Factura: "+nroFactura+"\n"+"CI del Cliente: "+ciCliente);
        System.out.println("Producto: "+producto+"\n"+"cantidad: "+cp+"\n"+"Precio: "+pp+" Bs");  
    }
    public void calcularSubtotal(){
        subtotal=pp*cp;
        System.out.println("Sub Total: "+subtotal+" Bs");
    }
    public void calcularTotalN(){
        total=subtotal;
        System.out.println("Total: "+total+" Bs");
    }
}
