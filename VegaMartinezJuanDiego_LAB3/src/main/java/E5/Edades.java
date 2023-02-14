
package E5;
import java.util.Scanner;
public class Edades {
    public int edad,cedad;   
    public int hp,hs=0;

    public Edades() {        
    }
    
    public void leer(){        
        Scanner leer=new Scanner (System.in);
        System.out.println("Introducir Cantidad de Edades: ");
        cedad=leer.nextInt(); 
        int v[]=new int [cedad];
        System.out.println("Introducir Edades solicitadas: ");               
        for(int i=0;i<cedad;i++){           
            edad=leer.nextInt();
            v[i]=edad;
            hs=hs+v[i];
        }
        hp=hs/cedad;
    }
    public void hSumatoria(){
        
        System.out.println("La Sumatoria de las Edades es: "+hs);
    }
    public void hPromedio(){
        
        System.out.println("El Promedio de las Edades es: "+hp);
    }

    
    
}
