
package E8;
public class Main8 {
    public static void main(String[] args) {
        Trabajador obj1=new Trabajador();
        obj1.setDt(28);
        obj1.setPd(60);
        System.out.println("Dias Trabajados: "+obj1.getDt());
        System.out.println("Pago Diario: "+obj1.getPd());
        obj1.calcularSL();
        obj1.calcularD();
        obj1.calcularBT();
        obj1.calcularSF();
        
        Trabajador obj2=new Trabajador();
        obj2.leer();
        obj2.calcularSL();
        obj2.calcularD();
        obj2.calcularBT();
        obj2.calcularSF();
    }   
}
