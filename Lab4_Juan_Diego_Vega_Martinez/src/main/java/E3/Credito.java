
package E3;
public class Credito extends Pago {
    public int numCredito;
    public double interes;
    
    public void NumCredito(){
        System.out.println("Numero de Credito: "+numCredito);
    }
    public void calcularInteres(){
        interes=imp*0.20;
        System.out.println("Interes Total: "+interes+" Bs");
    }
}
