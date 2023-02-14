
package E2;
import java.util.Scanner;
public class Suma {
    private int n1,n2;
   private int s;
    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN2() {
        return n2;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getS() {
        return s;
    }
    public void setS(int s) {
        this.s = s;
    }
   public void leer(){
       Scanner leer=new Scanner (System.in);
       System.out.println("ingresar primer Numero: 0X"+n1+"X0");
       n1=leer.nextInt();
       System.out.println("ingresar segundo NUmero: 0X"+n2+"X0");
       n2=leer.nextInt();
   }
   public void sumar(){
       s=n1+n2;
       System.out.println("la Suma de los Numeros es: "+s);      
   }
}
