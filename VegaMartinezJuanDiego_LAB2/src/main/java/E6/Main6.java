
package E6;
public class Main6 {
    public static void main(String[] args) {
        Rectangulo obj1=new Rectangulo();
        obj1.setBase(7);
        obj1.setAltura(4);
        System.out.println("Base del Rectangulo:   "+obj1.getBase());
        System.out.println("Altura del Rectangulo: "+obj1.getAltura());
        obj1.calcularP();
        obj1.calcularA();        
    }   
}
