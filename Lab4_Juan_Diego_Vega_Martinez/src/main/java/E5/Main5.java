
package E5;
public class Main5 {
    public static void main(String[] args) {
        System.out.println("----------1----------");
        Factura c1N=new Factura();
        c1N.nroFactura=101;
        c1N.ciCliente="123456 Cbba";
        c1N.producto="Monitores AoC";
        c1N.pp=750;
        c1N.cp=17;       
        c1N.InfoProductos();
        c1N.calcularSubtotal();
        c1N.calcularTotalN();
        
        System.out.println("----------2----------");
        ComprasPromocion c1CP=new ComprasPromocion();
        c1CP.nroFactura=102;
        c1CP.ciCliente="456123 SC";
        c1CP.producto="Procesador Core i5";
        c1CP.pp=1200;
        c1CP.cp=8;       
        c1CP.InfoProductos();
        c1CP.calcularSubtotal();
        c1CP.calcularDesctuento();
        c1CP.calcularTotalCP();
        
        System.out.println("----------3----------");
        ComprasSinPromocion c1CsP=new ComprasSinPromocion();
        c1CsP.nroFactura=103;
        c1CsP.ciCliente="321654 LP";
        c1CsP.producto="Tarjeta Grafica RTX 2060";
        c1CsP.pp=3260;
        c1CsP.cp=6;
        c1CsP.InfoProductos();
        c1CsP.calcularSubtotal();
        c1CsP.calcularImpuesto();
        c1CsP.calcularTotalCsP();
    }
}
