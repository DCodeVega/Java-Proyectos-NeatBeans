package E1;
public class SerVivo2 {
    public String nombre;
    public int edad;
    
    public void comer(String nombre){
        System.out.println("Comiendo desde la Clase Ser Vivo 2, me llamo: "+nombre);
    }
    public void comer(int edad){
        System.out.println("comiendo desde otro metodo, con edad de: "+edad);
    }
    public void comer(String nombre, int edad){
        System.out.println("comiendo desde la clase Ser Vivo, Mi nombre es: "+nombre+" y mi edad es: "+edad);
    }
    public void comer(){
        System.out.println("Comiendo...mmm, mmm");
    }
}
