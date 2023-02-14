package E7;
import java.util.Scanner;
public class TIsosceles extends Triangulo{
    public TIsosceles(int lado1, int lado2) {
        super(lado1, lado2);
    }
       
    public void leerTI(){
        Scanner leerTI=new Scanner (System.in);
        System.out.println("--------------------------------");
        System.out.println("*****Triangulo Isosceles*****");
        System.out.print("Ingresar lado 1(lado Repetido):  ");
        lado1=leerTI.nextInt();
        System.out.print("<<<<<");
        System.out.print("Ingresar lado 2(Base):  ");
        lado2=leerTI.nextInt();
        System.out.print("<<<<<");
    }   
    public void calcularPerimetroI(){
        perimetro=(2*lado1)+lado2;
        System.out.println("Perimetro del Triangulo Isosceles es: "+perimetro);
    }
    public void calcularAreaI(){
        area=(lado2*Math.sqrt(Math.pow(lado1, 2)-(Math.pow(lado2, 2)/4)))/2;
        System.out.println("area del Triangulo Isosceles es: "+area);
    }
    public void calcularAlturaI(){
        altura=Math.sqrt(Math.pow(lado1, 2)-(Math.pow(lado2, 2)/4));
        System.out.println("Altura del Triangulo Isosceles es: "+altura);
        System.out.println("-------------------------------------------------");
    }
}
