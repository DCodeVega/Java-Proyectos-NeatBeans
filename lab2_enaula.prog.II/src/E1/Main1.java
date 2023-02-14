
package E1;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("primer objeto---");
        Lavadora obj1=new Lavadora();
        obj1.marca="LG";
        obj1.kilos=10;
        obj1.garantia=1;
        System.out.println("marca:"+obj1.marca);
        System.out.println("kilos:"+obj1.kilos);
        System.out.println("garantia:"+obj1.garantia);
        obj1.lavar();
        obj1.enjuagar();
        obj1.centrifugar();
        
        System.out.println("segundo objeto---");
        Lavadora obj2=new Lavadora();
        obj2.color="plomo";
        obj2.kilos=6;
        obj2.garantia=5;
        System.out.println("color:"+obj2.color);
        System.out.println("kilos:"+obj2.kilos);
        System.out.println("garantia:"+obj2.garantia);
        obj2.lavar();
        obj2.enjuagar();
        obj2.centrifugar();

    }
    
}
