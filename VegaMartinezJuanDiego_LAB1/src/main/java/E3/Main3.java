
package E3;

public class Main3 {
    public static void main(String[] args) {
        Trabajador obj1=new Trabajador();
        System.out.println("----1----");
        obj1.ht=60;
        obj1.sh=10;
        obj1.dt=7;
        obj1.pd=80;
        System.out.println("Horas Trabajadas: "+obj1.ht+" horas");
        System.out.println("Salario por Hora: "+obj1.sh+" Bs");
        System.out.println("Dias Trabajados : "+obj1.dt+" días");
        System.out.println("Pago Diario: "+obj1.pd+" Bs");
        obj1.calcularSS();
        obj1.calcularSL();
        obj1.calcularTD();
        obj1.calcularSF(); 
        
        Trabajador obj2=new Trabajador();
        System.out.println("----2----");
        obj2.ht=80;
        obj2.sh=12;
        obj2.dt=10;
        obj2.pd=120;
        System.out.println("Horas Trabajadas: "+obj2.ht+" horas");
        System.out.println("Salario por Hora: "+obj2.sh+" Bs");
        System.out.println("Dias Trabajados : "+obj2.dt+" días");
        System.out.println("Pago Diario: "+obj2.pd+" Bs");
        obj2.calcularSS();
        obj2.calcularSL();
        obj2.calcularTD();
        obj2.calcularSF(); 
    }
    
}
