
package E3;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("***1***");
        Trabajador obj1=new Trabajador();
        obj1.nombre="Juan";
        obj1.ht=15;
        obj1.sh=120;
        System.out.println("Trabajador/a: "+obj1.nombre);
        System.out.println("Horas Trabajadas: "+obj1.ht);
        System.out.println("Salario por Hora: "+obj1.sh);
        obj1.SalarioS();
        
        System.out.println("***2***");    
        Trabajador obj2=new Trabajador();
        obj2.nombre="Luis";
        obj2.ht=18;
        obj2.sh=120;
        System.out.println("Trabajador/a: "+obj2.nombre);
        System.out.println("Horas Trabajadas: "+obj2.ht);
        System.out.println("Salario por Hora: "+obj2.sh);
        obj2.SalarioS();
        
        System.out.println("***3***");      
        Trabajador obj3=new Trabajador();
        obj3.nombre="Maria";
        obj3.ht=10;
        obj3.sh=100;
        System.out.println("Trabajador/a: "+obj3.nombre);
        System.out.println("Horas Trabajadas: "+obj3.ht);
        System.out.println("Salario por Hora: "+obj3.sh);
        obj3.SalarioS();

    }
    
}
