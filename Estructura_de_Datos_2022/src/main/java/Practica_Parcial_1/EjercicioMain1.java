package Practica_Parcial_1;
import java.util.Scanner;
/**
 *
 * @author Diego Vega
 */
public class EjercicioMain1 {
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
        System.out.println("•••Estos son los elementos de su Vector:");
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
        
        ejercicios_1y3 obj1=new ejercicios_1y3();
        //•1.dado un vector V, sumar todo los elementos primos
        System.out.println("••>> Nº Primos: Aquel que solo es dividido por si mismo y por uno");
        obj1.sumarPrimos(vector_x);
        System.out.println("");
        //•2.dado un vector V, sumar todos los elementos Perfectos
        System.out.println("••>> Nº Perfectos: Las suma de sus divisores, menos el mismo numero sea igual al dicho numero");
        obj1.sumarPerfectos(vector_x);
        System.out.println("");      
    }
}
