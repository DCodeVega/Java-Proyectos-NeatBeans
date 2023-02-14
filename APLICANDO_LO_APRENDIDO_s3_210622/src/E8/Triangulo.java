package E8;
public class Triangulo {
    private int lado1,lado2,lado3;
    private double perimetro,area,altura;
    //Constructores
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
    //Getters y Setters
    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    public int getLado3() {
        return lado3;
    }
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }      
    //Metodos
    private void Mensaje(){
        System.out.println("*****Ingresar datos para los siguientes Triangulos*****");
    }     
}
