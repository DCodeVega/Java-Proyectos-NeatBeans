
package E6;

public class main6 {

    public static void main(String[] args) {
        Empleado obj1=new Empleado();
        System.out.println("----1----");
        obj1.ide=1234;
        obj1.s=1200;
        obj1.at=1;
        System.out.println("ID del Empleado: "+obj1.ide);
        System.out.println("Salario: "+obj1.s+" Bs");
        System.out.println("Antiguedad del Empleado: "+obj1.at+" año/s");
        obj1.salarioP();
        obj1.salarioT();
        
        Empleado obj2=new Empleado();
        System.out.println("----2----");
        obj2.ide=1122;
        obj2.s=1450;
        obj2.at=4;
        System.out.println("ID del Empleado: "+obj2.ide);
        System.out.println("Salario: "+obj2.s+" Bs");
        System.out.println("Antiguedad del Empleado: "+obj2.at+" año/s");
        obj2.salarioP();
        obj2.salarioT();
        
        Empleado obj3=new Empleado();
        System.out.println("----3----");
        obj3.ide=3344;
        obj3.s=1600;
        obj3.at=7;
        System.out.println("ID del Empleado: "+obj3.ide);
        System.out.println("Salario: "+obj3.s+" Bs");
        System.out.println("Antiguedad del Empleado: "+obj3.at+" año/s");
        obj3.salarioP();
        obj3.salarioT();

    }
    
}
