
package E1;

public class Main1 {

    public static void main(String[] args) {
        Televisor obj1=new Televisor();
        System.out.println("----1----");
        obj1.marca="LG";
        obj1.garantia="5 años";
        obj1.kilos="----";
        obj1.color="----";
        System.out.println("Televisor de marca: "+obj1.marca);
        System.out.println("Televisor con garantia de: "+obj1.garantia);
        obj1.encendido();
        obj1.apagado();
        obj1.cambio_de_canal();
        
        Televisor obj2=new Televisor();
        System.out.println("----2----");
        obj2.marca="Samsung";
        obj2.garantia="10 años";
        obj2.kilos="5 kg";
        obj2.color="Plomo";
        System.out.println("Televisor de marca: "+obj2.marca);
        System.out.println("Televisor con garantia de: "+obj2.garantia);
        System.out.println("Televisor de:"+obj2.kilos);
        System.out.println("Televisor de color: "+obj2.color);
        obj2.encendido();
        obj2.apagado();
        obj2.cambio_de_canal();

    }
    
}
