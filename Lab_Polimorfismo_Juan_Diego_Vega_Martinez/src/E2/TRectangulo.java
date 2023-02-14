package E2;
public class TRectangulo extends Triangulos{
    
    public TRectangulo(int a, int b, int c) {
        super(a, b, c);
    }
    
    @Override
    public void Perimetro(){
        perimetro=a+b+c;
        System.out.println("Perimetro del Trinagulo Resctangulo es: "+perimetro);
    } 
    @Override
    public void Area(){
        area=(b*a)/2;
        System.out.println("Area del Triangulo Resctangulo es: "+area);
    }   
    @Override
    public void Altura(){
        altura=(a*b)/c;
        System.out.println("Altura del Triangulo Rectangulo es: "+altura);
        System.out.println("**************************************************");
    }
}
