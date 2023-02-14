package E2;
public class Triangulos {
    public int a,b,c;
    public double perimetro,area,altura;

    public Triangulos(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangulos(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Triangulos(int a) {
        this.a = a;
    }
    
    public void Perimetro(){
        System.out.println("Perimetro");
    }
    public void Area(){
        System.out.println("Area");
    }
    public void Altura(){
        System.out.println("Altura");
    } 
}
