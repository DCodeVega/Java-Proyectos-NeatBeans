package E1;

public class main1 {

    public static void main(String[] args) {
        Persona o1=new Persona();
        o1.nombre="Juan";
        System.out.println("Nombre: "+o1.nombre);
        o1.comer();
        
        SerVivo o2=new SerVivo();
        o2.comer();
        
        Animal o3=new Animal();
        o3.nombre="Tigre";
        o3.comer();
        
        System.out.println("**** OVERLOAD ****");
        SerVivo2 o4=new SerVivo2();
        o4.nombre="Jhon";
        o4.edad=24;
        o4.comer("Saul");
        o4.comer(25);
        o4.comer("Jhonny", 34);
        o4.comer();
        
        System.out.println("**** Abstract ****"); 
        Persona o5=new Persona();
        o5.comer();
        
        Animal o6=new Animal();
        o6.comer();
    }
    
}
