
package E2;

public class Main2 {

    public static void main(String[] args) {
        Trabajador obj1=new Trabajador();
        System.out.println("----1----");
        obj1.nombre="Juan";
        obj1.dt=14;
        obj1.sh=100;
        System.out.println("Nombre:"+obj1.nombre);
        System.out.println("Dias Trabajados: "+obj1.dt+" dias");
        System.out.println("Salario por Hora: "+obj1.sh+" Bs");
        obj1.calcularSL();
        
        Trabajador obj2=new Trabajador();
        System.out.println("----2----");
        obj2.nombre="Carlos";
        obj2.dt=21;
        obj2.sh=120;
        System.out.println("Nombre:"+obj2.nombre);
        System.out.println("Dias Trabajados: "+obj2.dt+" dias");
        System.out.println("Salario por Hora: "+obj2.sh+" Bs");
        obj2.calcularSL();
        
        Trabajador obj3=new Trabajador();
        System.out.println("----3----");
        obj3.nombre="Gorge";
        obj3.dt=17;
        obj3.sh=80;
        System.out.println("Nombre:"+obj3.nombre);
        System.out.println("Dias Trabajados: "+obj3.dt+" dias");
        System.out.println("Salario por Hora: "+obj3.sh+" Bs");
        obj3.calcularSL();

    }
    
}
