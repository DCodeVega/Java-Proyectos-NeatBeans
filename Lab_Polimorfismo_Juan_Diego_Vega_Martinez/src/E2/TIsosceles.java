package E2;
public class TIsosceles extends Triangulos{

    public TIsosceles(int a, int b) {
        super(a, b);
    }        
    @Override
    public void Perimetro(){
        perimetro=(2*a)+b;
        System.out.println("Perimetro del Trinagulo Isosceles es: "+perimetro);
    }   
    @Override
    public void Area(){
        area=(b*(Math.sqrt(Math.pow(a, 2)-(b/4))))/2;
        System.out.println("Area del Triangulo Isosceles es: "+area);
    }   
    @Override
    public void Altura(){
        altura=Math.sqrt(Math.pow(a, 2)-(Math.pow(b, 2)/4));
        System.out.println("Altura del Triangulo Isosceles es: "+altura);
        System.out.println("**************************************************");
    }
}
