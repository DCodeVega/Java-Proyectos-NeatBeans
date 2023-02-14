
package E6;

public class Main6 {

    public static void main(String[] args) {
        Empleado obj1=new Empleado();
        System.out.println("----1----");
        obj1.nombre="Juan";
        obj1.ci="1234LP";
        obj1.estado="soltero";
        obj1.sl=1200;
        System.out.println("Nombre: "+obj1.nombre);
        System.out.println("ci:"+obj1.ci);
        System.out.println("Estado Civil: "+obj1.estado);
        System.out.println("Sueldo Liquido: "+obj1.sl+" Bs");
        obj1.DescuentoJ();
        obj1.DescuentoAFP();
        obj1.DescuentoRC();
        obj1.DescuentoT();
        obj1.calcularSF();
        
        Empleado obj2=new Empleado();
        System.out.println("----2----");
        obj2.nombre="Carlos";
        obj2.ci="4321Cbba";
        obj2.estado="casado";
        obj2.sl=1600;
        System.out.println("Nombre: "+obj2.nombre);
        System.out.println("ci:"+obj2.ci);
        System.out.println("Estado Civil: "+obj2.estado);
        System.out.println("Sueldo Liquido: "+obj2.sl+" Bs");
        obj2.DescuentoJ();
        obj2.DescuentoAFP();
        obj2.DescuentoRC();
        obj2.DescuentoT();
        obj2.calcularSF();

    }
    
}
