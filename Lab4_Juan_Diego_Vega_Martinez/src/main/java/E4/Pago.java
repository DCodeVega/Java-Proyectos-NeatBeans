
package E4;
public class Pago {
    private String nomCliente;
    private int importe;
    private double imp;
    
    public void calcularImp(){
        imp=importe+(importe*0.16);
        System.out.println("Importe Total: "+imp+" Bs");
    }
    public void NomCliente(){
        System.out.println("Nombre de Cliente: "+nomCliente);
    }
    public String getNomCliente() {
        return nomCliente;
    }
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }
    public int getImporte() {
        return importe;
    }
    public void setImporte(int importe) {
        this.importe = importe;
    }
    public double getImp() {
        return imp;
    }
    public void setImp(double imp) {
        this.imp = imp;
    }  
}
