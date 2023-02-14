package E8;
import java.util.Scanner;
public class TRectangulo extends Triangulo{
    
    public TRectangulo(int lado1, int lado2, int lado3) {
        super(lado1, lado2, lado3);
    }
    
    private void leerTR(){
        Scanner leerTR=new Scanner (System.in);
        System.out.println("--------------------------------");
        System.out.println("*****Triangulo Rectangulo*****");
        System.out.print("Ingresar lado 1(Base=Hipotenusa):  ");
        setLado1(leerTR.nextInt());       
        System.out.print("Ingresra lado 2:  ");
        setLado2(leerTR.nextInt());
        System.out.print("Ingresar lado 3:  ");
        setLado3(leerTR.nextInt());          
    }  
    private void calcularPerimetroR(){
        setPerimetro(getLado1()+getLado2()+getLado3());
        System.out.println("Perimetro del Triangulo Rectangulo es: "+getPerimetro());    
    }
    private void calcularAreaR(){
        setArea((getLado2()*getLado3())/2);
        System.out.println("Area del Triangulo Rectangulo es: "+getArea());      
    }
    private void calcularAlturaR(){
        setAltura((getLado3()*getLado2())/getLado1());
        System.out.println("Altura del Triangulo Rectangulo es: "+getAltura());
        System.out.println("-------------------------------------------------");
    }    
}
