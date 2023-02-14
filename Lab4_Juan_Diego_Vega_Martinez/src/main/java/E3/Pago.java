
package E3;
public class Pago {
    public String nomCliente;
    public int importe;
    public double imp;
    
    public void calcularImp(){
        imp=importe+(importe*0.16);
        System.out.println("Importe Total: "+imp+" Bs");
    }
    public void NomCliente(){
        System.out.println("Nombre de Cliente: "+nomCliente);
    }
}
