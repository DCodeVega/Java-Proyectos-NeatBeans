
package E3;

public class Trapecio extends FigurasGeometricas{

    public Trapecio(int base, int baseme, int altura, int lado) {
        super(base, baseme, altura, lado);
    }

    
    
    public void AreaTrapecio(){
        area=(base+baseme)/2+altura;
        System.out.println("El Area del Trapecio es: "+area);
    }
    public void PerimetroTrapecio(){
        perimetro=base+baseme+(lado*2);
        System.out.println("El Perimetro del Trapecio es: "+perimetro);
    }
}
