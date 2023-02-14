package E7;
import java.util.Scanner;
public class TEquilatero extends Triangulo{
    public TEquilatero(int lado1) {
        super(lado1);
    }    
    
    public void leerTE(){
        Scanner leerTE=new Scanner (System.in);
        System.out.println("--------------------------------");
        System.out.println("*****Triangulo Equilatero*****");
        System.out.print("Ingresar lado1(Sus 3 lados tienen mismo valor):  ");
        lado1=leerTE.nextInt();
        System.out.print("<<<<<");
    }
    public void calcularPerimetroE(){
        perimetro=lado1*3;
        System.out.println("Perimetro del Triangulo Equilatero es:  "+perimetro);
    }
    public void calcularAreaE(){
        area=((Math.sqrt(3))/4)*Math.pow(lado1, 2);
        System.out.println("Area del Triangulo Equilatero es:  "+area);
    }
    public void calcularAlturaE(){
        altura=(Math.sqrt(3)*lado1)/2;
        System.out.println("Altura del Triangulo Equilatero es:  "+altura);
        System.out.println("-------------------------------------------------");
    }
}
