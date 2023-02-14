
package E1;
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
   public void sumar(){
       s=n1+n2;
       System.out.println("la Suma de los Numeros es: "+s);      
   }
}
