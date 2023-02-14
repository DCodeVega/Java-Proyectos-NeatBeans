
package E4;
public class Credito extends Pago{
    private int numCredito;
    private double interes;
    
    public void NumCredito(){
        System.out.println("Numero de Credito: "+numCredito);
    }
    public void calcularInteres(){
        interes=getImp()*0.20;
        System.out.println("Interes Total: "+interes+" Bs");
    }
    public void setNumCredito(int numCredito) {
        this.numCredito = numCredito;
    } 
}
