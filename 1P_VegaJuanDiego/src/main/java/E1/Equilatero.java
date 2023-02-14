
package E1;
public class Equilatero {
    private int la;
    private double p,a,h;

    public int getLa() {
        return la;
    }
    public void setLa(int la) {
        this.la = la;
    }
    public double getP() {
        return p;
    }
    public void setP(double p) {
        this.p = p;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }   
    private void cPerimetro(){
        p=3*la;
        System.out.println("Su Perimetro es: "+p);
    }
    private void cArea(){
        a=(Math.sqrt(3)/4)*Math.pow(la, 2);
        System.out.println("Su Area es: "+a);
    }
    private void cAltura(){
        h=Math.sqrt(3*la)/2;
        System.out.println("Su Altura es: "+h);
    }
}
