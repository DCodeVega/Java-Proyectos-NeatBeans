
package E3;

public class Main3 {

    public static void main(String[] args) {
        Romboide fg1=new Romboide(6, 10);
        fg1.AreaR();
        
        Trapecio fg2=new Trapecio(10, 8, 6, 8);
        fg2.AreaTrapecio();
        fg2.PerimetroTrapecio();
        
        Triangulo fg3=new Triangulo(5, 10, 7);
        fg3.AreaTriangulo();
        fg3.PerimetroTriangulo();
        
        Cubo fg4=new Cubo(5);
        fg4.AreaCubo();

    }
    
}
