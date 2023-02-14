package E2;
public class TEquilatero extends Triangulos{

    public TEquilatero(int a) {
        super(a);
    }       
    @Override
    public void Area(){
        area=(Math.sqrt(3)/4)*Math.pow(a, 2);
        System.out.println("Area del Triangulo Equilatero es: "+area);
    }
    @Override
    public void Altura(){
        altura=(Math.sqrt(3*a))/2;
        System.out.println("Altura del Triangulo Equilatero es: "+altura);
        System.out.println("**************************************************");
    }
}
