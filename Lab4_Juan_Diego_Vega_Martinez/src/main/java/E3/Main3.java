
package E3;
public class Main3 {
    public static void main(String[] args) {
        System.out.println("------------1-----------");
        Pago p1=new Pago();
        p1.nomCliente="Luis";
        p1.importe=1000;
        p1.NomCliente();
        p1.calcularImp();
        
        System.out.println("------------2-----------");
        Cheque ch1=new Cheque();
        ch1.numCheque=002;
        ch1.importe=2000;
        ch1.NumCheque();
        ch1.calcularImp();
        
        System.out.println("------------3-----------");
        Credito c1=new Credito();
        c1.numCredito=1051;
        c1.importe=3000;
        c1.NumCredito();
        c1.calcularImp();
        c1.calcularInteres();
            
        System.out.println("------------4-----------");
        Efectivo e1=new Efectivo();
        e1.importe=4000;
        e1.calcularImp();
        e1.calcularDesc();
    }   
}
