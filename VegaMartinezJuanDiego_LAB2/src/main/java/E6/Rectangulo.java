
package E6;
public class Rectangulo {
    private int base,altura;
    private int p,a;  
    public void calcularP(){
        p= (2*base)+(2*altura);
        System.out.println("El Perimetro es:       "+p);
    }
    public void calcularA(){
        a=base*altura;
        System.out.println("el Area es:            "+a);
    }    
    public void setBase(int base){
        this.base = base;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getBase(){
        return base;
    }
    public int getAltura(){
        return altura;       
    }   
}
