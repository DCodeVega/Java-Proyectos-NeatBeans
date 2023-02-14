
package E4;
public class Cheque extends Pago{
    private int numCheque;
    
    public void NumCheque(){
        System.out.println("Numero de Cheque: "+numCheque);
    }
    public void setNumCheque(int numCheque) {
        this.numCheque = numCheque;
    }
}
