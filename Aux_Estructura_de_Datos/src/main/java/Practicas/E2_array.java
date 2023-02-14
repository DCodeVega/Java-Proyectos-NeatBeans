package Practicas;
/**
 *
 * @author Diego Vega
 */
public class E2_array {
    //sumas los elementos pares
    public void ejercicio_1(String vector[]){
        int sumaV=0;
        for(String elemento:vector){
            if(Integer.parseInt(elemento) %2==0){
                sumaV=sumaV+Integer.parseInt(elemento);
            }
        }
        System.out.println("La suma de los Vectores Pares es: "+sumaV);  
    }
    //eliminar los elementos negativos
    public void ejercicio_2(String vector[]){
        int cont=0;
        for(String elemento:vector){          
            if(Integer.parseInt(elemento)<1){
                vector[cont]="";
            }
            cont++;
        }
        System.out.println("Este es su nuevo vector sin elementos negativos:");
        for(String elemento:vector){
            System.out.print(elemento+" ");          
        }
    }
}
