
package E3;

public class Cubo extends FigurasGeometricas{

    public Cubo(int arista) {
        super(arista);
    }
    
    public void AreaCubo(){
        area=6*Math.pow(arista,2);
        System.out.println("El Area del Cubo es de: "+area);
    }
}
