
package E1;
import java.util.Scanner;
public class Trabajador {
    private int dt,pd,sl;
    private String nombre;
    
    //Getters y Setters
    public int getDt() {
        return dt;
    }
    public void setDt(int dt) {
        this.dt = dt;
    }
    public int getPd() {
        return pd;
    }
    public void setPd(int pd) {
        this.pd = pd;
    }
    public int getSl() {
        return sl;
    }
    public void setSl(int sl) {
        this.sl = sl;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    // Constructor
    public Trabajador(int dt, int pd) {
        this.dt = dt;
        this.pd = pd;
    }
    
    
    //metodos
    private void calcularSL(){
        sl=pd*dt;
        System.out.println("El Salario Liquido es: "+sl);
    }
    public void leer(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Introducir Nombre: ");
        nombre=leer.nextLine();
    }
}
