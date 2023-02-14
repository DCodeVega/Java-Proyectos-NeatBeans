
package E7;
    import java.util.Scanner;
public class Main7 {
    public static Scanner tiempo=new Scanner(System.in);
    public static void main(String[] args) {
        Tiempo usuario=new Tiempo();
        System.out.println("asignar una Hora ---> para mostrar Hora: ");
        usuario.h=tiempo.nextInt();  
        usuario.mostrarH();
        System.out.println("¿Desea asignar minutos? ---> para mostrar Hora y minutos: ");
        usuario.m=tiempo.nextInt();
        usuario.mostrarHM();
        System.out.println("¿Desea asignar segundos? ---> para mostrar Hora, minutos y segundos: ");
        usuario.s=tiempo.nextInt();
        usuario.mostrarHMS();

    }
    
}
