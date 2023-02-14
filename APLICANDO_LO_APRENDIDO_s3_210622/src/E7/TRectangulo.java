package E7;
import java.util.Scanner;
public class TRectangulo extends Triangulo{

    public TRectangulo(int lado1, int lado2, int lado3) {
        super(lado1, lado2, lado3);
    }
      
    public void leerTR(){
        Scanner leerTR=new Scanner (System.in);
        System.out.println("--------------------------------");
        System.out.println("*****Triangulo Rectangulo*****");
        System.out.print("Ingresar lado 1(Base=Hipotenusa):  ");
        lado1=leerTR.nextInt();       
        System.out.print("Ingresra lado 2(Cateto a):  ");
        lado2=leerTR.nextInt();
        System.out.print("Ingresar lado 3(Cateto b):  ");
        lado3=leerTR.nextInt();          
    }
    
    public void calcularPerimetroR(){
        perimetro=lado1+lado2+lado3;
        System.out.println("Perimetro del Triangulo Rectangulo es: "+perimetro);    
    }
    public void calcularAreaR(){
        area=(lado2*lado3)/2;
        System.out.println("Area del Triangulo Rectangulo es: "+area);      
    }
    public void calcularAlturaR(){
        altura=(lado3*lado2)/lado1;
        System.out.println("Altura del Triangulo Rectangulo es: "+altura);
        System.out.println("-------------------------------------------------");
    }   
}
