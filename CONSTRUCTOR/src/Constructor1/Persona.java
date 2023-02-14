
package Constructor1;

public class Persona {
    public String nombre,ci;
    public int edad;
    //metodo constructor
    //public mismo nombredeClase new Mismo nombre de Clase
    public Persona (String nombre){
        this.nombre=nombre;
    }
    public Persona(String ci,int edad){
        this.ci=ci;
        this.edad=edad;
    }
    public Persona(){
        
    }
    public Persona(String nombre,String ci,int edad){
        this.nombre=nombre;
        this.ci=ci;
        this.edad=edad;
    }
    public void mostrar(){
        System.out.println("nombre: "+nombre);
        System.out.println("ci: "+ci);
        System.out.println("edad: "+edad);
    }
}
