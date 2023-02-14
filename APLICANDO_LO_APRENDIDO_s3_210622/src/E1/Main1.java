package E1;
public class Main1 {
    public static void main(String[] args) {
        Trabajador t1=new Trabajador(30, 50);
        t1.calcularSL();
        
        Contador t2=new Contador(10, 30, 60);
        t2.calcularSL();
        t2.calcularTD();
        t2.calcularSF();
        
        Contador t3=new Contador(0, 0, 0);
        t3.leer();
        t3.calcularSL();
        t3.calcularTD();
        t3.calcularSF();
    } 
}
