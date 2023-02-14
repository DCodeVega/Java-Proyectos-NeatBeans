
package E4;
public class Main4 {
    public static void main(String[] args) {
        Trabajador obj1=new Trabajador();
        obj1.setDt(30);
        obj1.setPd(40);
        System.out.println("Dias Trabajados: "+obj1.getDt());
        System.out.println("Pago Diario: "+obj1.getPd());
        obj1.calcularSL();
    }   
}
