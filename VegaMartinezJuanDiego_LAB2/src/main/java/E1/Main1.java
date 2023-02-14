
package E1;
public class Main1 {
    public static void main(String[] args) {
        Suma obj1=new Suma();
        obj1.setN1(56);
        obj1.setN2(28);      
        System.out.println("Primer Numero: "+obj1.getN1());
        System.out.println("Segundo Numero: "+obj1.getN2());
        obj1.sumar();
    }  
}
