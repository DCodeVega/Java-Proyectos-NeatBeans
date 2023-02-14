package E7;
public class Triangulo {
    public int lado1,lado2,lado3;
    public double perimetro,area,altura;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public Triangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Triangulo(int lado1) {
        this.lado1 = lado1;
    }
       
    public void Mensaje(){
        System.out.println("*****Ingresar datos para los siguientes Triangulos*****");
    }      
}


