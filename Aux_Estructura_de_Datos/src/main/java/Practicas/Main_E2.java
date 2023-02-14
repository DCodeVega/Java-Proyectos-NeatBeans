package Practicas;
import java.util.*;
/**
 *
 * @author Diego Vega
 */
public class Main_E2 {
    static Scanner leer=new Scanner(System.in);
    
    static void llenarVector(String vector[]){
        System.out.println("llene el Vector por Favor: ");
        int tamaño=vector.length;
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese elemento en la casilla Nº "+i+": ");
            vector[i]=leer.next();
        }      
    }
    
    static void mostrarVector(String vector[]){
        System.out.println("Este es su Vector:");
        for(String elemento:vector){
            System.out.print(elemento+" ");
        }
        System.out.println("");                 
    }
    
    public static void main(String[] args) {
        System.out.println("Ingrese Tamaño del Vector");
        int tamaño=leer.nextInt();
        String vector_x[];
        vector_x=new String[tamaño];
        llenarVector(vector_x);
        mostrarVector(vector_x);
        //ejecutando los ejercicios
        E2_array obj=new E2_array();
        obj.ejercicio_1(vector_x);
        obj.ejercicio_2(vector_x);     
    }
}
