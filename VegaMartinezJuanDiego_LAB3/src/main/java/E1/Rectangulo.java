
package E1;

public class Rectangulo {
    public int base,altura;
    public double p,a;
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public void cArea(){
        a=base*altura;
        System.out.println("Area:"+a);
    }
    public void cPerimetro(){
        p=2*base+2*altura;
        System.out.println("Perimetro: "+p);
    }
 
    
    
}
