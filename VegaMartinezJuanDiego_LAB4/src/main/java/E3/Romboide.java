
package E3;

public class Romboide extends FigurasGeometricas{

    public Romboide(int base, int altura) {
        super(base, altura);
    }   
    
    public void AreaR(){
        area=base*altura;
        System.out.println("El Area de Romboide es: "+area);
    }
    
}
