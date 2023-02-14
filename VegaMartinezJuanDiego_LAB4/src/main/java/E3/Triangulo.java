
package E3;

public class Triangulo extends FigurasGeometricas{

    public Triangulo(int base, int altura, int lado) {
        super(base, altura, lado);
    }

    
    public void AreaTriangulo(){
        area=(base*altura)/2;
        System.out.println("El Area del Trinagulo es de: "+area);
    }
    
    public void PerimetroTriangulo(){
        perimetro=3*lado;
        System.out.println("El Perimetro del triangulo es de: "+perimetro);
    }
    
}
