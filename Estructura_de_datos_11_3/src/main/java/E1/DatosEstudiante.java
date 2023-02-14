
package E1;

public class DatosEstudiante {
    public Estudiante ve[];
    public int MAX,i;{
    }

    public DatosEstudiante(int ce){  //constructor   inicializa con "ce" (Cantidad de Estudiantes) 
        MAX=ce;
        ve= new Estudiante[MAX];
        i=0;
    }
    public void adicionar(Estudiante de){   //  almacena "de" (Datos de Estudiante) en cada vector
        ve[i]=de;
        i++;
    }
    public String listar(){           // en "j<i "  poner asi porq mostrara sino todos los elementos aunque este vacio
        String s="";
        int j;
        for(j=0;j<i;j++){
            s = s +ve[j].getTodo();
        
        } 
        return s;
    } 
}


