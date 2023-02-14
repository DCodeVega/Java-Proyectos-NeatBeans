
package Vectores;

public class DatosEstudiantes {
    public Estudiante ve[];
    public int MAX,i;
    public DatosEstudiantes(int ce){
        MAX=ce;
        ve= new Estudiante[MAX];
        i=0;
    }
    public void adicionar(Estudiante de){
        ve[i]=de;
        i++;
    }
    
}
