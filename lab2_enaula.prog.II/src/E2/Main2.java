
package E2;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("---1---");
        Trapecio obj1=new Trapecio();
        obj1.altura=10;
        obj1.bMayor=8;
        obj1.bMenor=5;
        obj1.lado=4;
        System.out.println("altura: "+obj1.altura);
        System.out.println("bMayor: "+obj1.bMayor);
        System.out.println("bMenor: "+obj1.bMenor);
        System.out.println("lado: "+obj1.lado);
        obj1.calcularA();
        obj1.calcularP();
        
        System.out.println("---2---");
        Trapecio obj2=new Trapecio();
        obj2.altura=20;
        obj2.bMayor=16;
        obj2.bMenor=10;
        obj2.lado=8;
        System.out.println("altura: "+obj2.altura);
        System.out.println("bMayor: "+obj2.bMayor);
        System.out.println("bMenor: "+obj2.bMenor);
        System.out.println("lado: "+obj2.lado);
        obj2.calcularA();
        obj2.calcularP();
        

    }
    
}
