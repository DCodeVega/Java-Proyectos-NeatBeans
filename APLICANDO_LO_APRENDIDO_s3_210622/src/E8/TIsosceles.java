package E8;
import java.util.Scanner;
public class TIsosceles extends Triangulo{
    
    public TIsosceles(int lado1, int lado2) {
        super(lado1, lado2);
    }   
    
    private void leerTI(){
        Scanner leerTI=new Scanner (System.in);
        System.out.println("--------------------------------");
        System.out.println("*****Triangulo Isosceles*****");
        System.out.print("Ingresar lado 1(lado Repetido):  ");
        setLado1(leerTI.nextInt());
        System.out.print("Ingresar lado 2(Base):  ");
        setLado2(leerTI.nextInt());
    }

    private void calcularPerimetroI(){
        setPerimetro((2*getLado1())+getLado2());
        System.out.println("Perimetro del Triangulo Isosceles es: "+getPerimetro());
    }
    private void calcularAreaI(){
        setArea((getLado2()*Math.sqrt(Math.pow(getLado1(), 2)-(Math.pow(getLado2(), 2)/4)))/2);
        System.out.println("area del Triangulo Isosceles es: "+getArea());
    }
    private void calcularAlturaI(){
        setAltura(Math.sqrt(Math.pow(getLado1(), 2)-(Math.pow(getLado2(), 2)/4)));
        System.out.println("Altura del Triangulo Isosceles es: "+getAltura());
        System.out.println("-------------------------------------------------");
    }
}
