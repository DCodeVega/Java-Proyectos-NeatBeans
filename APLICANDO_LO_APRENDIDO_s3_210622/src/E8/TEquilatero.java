package E8;
import java.util.Scanner;
public class TEquilatero extends Triangulo{
    public TEquilatero(int lado1) {
        super(lado1);
    }  
    private void leerTE(){
        Scanner leerTE=new Scanner (System.in);
        System.out.println("--------------------------------");
        System.out.println("*****Triangulo Equilatero*****");
        System.out.print("Ingresar lado1(Sus 3 lados tienen mismo valor):  ");
        setLado1(leerTE.nextInt());
    } 
    private void calcularPerimetroE(){
        setPerimetro(getLado1()*3);
        System.out.println("Perimetro del Triangulo Equilatero es:  "+getPerimetro());
    }
    private void calcularAreaE(){
        setArea(((Math.sqrt(3))/4)*Math.pow(getLado1(), 2));
        System.out.println("Area del Triangulo Equilatero es:  "+getArea());
    }
    private void calcularAlturaE(){
        setAltura((Math.sqrt(3)*getLado1())/2);
        System.out.println("Altura del Triangulo Equilatero es:  "+getAltura());
        System.out.println("-------------------------------------------------");
    }
}
