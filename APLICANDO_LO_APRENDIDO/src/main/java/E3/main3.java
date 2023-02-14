
package E3;

public class main3 {

    public static void main(String[] args) {
        Empleado obj1=new Empleado();
        obj1.setIde(123);
        System.out.println("ID de Empleado: "+obj1.getIde());
        obj1.setAnt(1);
        System.out.println("años de Antiguedad: "+obj1.getAnt());
        obj1.setS(1200);
        System.out.println("Salario: "+obj1.getS());
        obj1.cPlus();
        
        Empleado obj2=new Empleado();
        obj2.setIde(321);
        System.out.println("ID de Empleado: "+obj2.getIde());
        obj2.setAnt(4);
        System.out.println("Años de Antiguedad: "+obj2.getAnt());
        obj2.setS(1400);
        System.out.println("Salario: "+obj2.getS());
        obj2.cPlus();
        
        Empleado obj3=new Empleado();
        obj3.leer();
        obj3.cPlus();
    
    }
    
}
