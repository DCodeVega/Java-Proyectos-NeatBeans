package ejercicios_de_clases;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Diego Vega
 */
public class mainE2_matriz {
    static Scanner leer=new Scanner(System.in);
    
    static void llenar_matriz(int matriz[][]){
        System.out.println("metodo de llenado de matriz");
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Ingresar elemento en la casilla: ["+i+"] ["+j+"]: ");
                matriz [i][j]=leer.nextInt();
            }
        }
    }
    
    static void mostrar_matriz(int matriz[][]){
        System.out.println("Mostrando Matriz");
        
        System.out.println("Primeroa forma");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(" "+matriz[i][j]);
                
            }
            
        }
        System.out.println("Segunda Forma:");
        for(int fila []:matriz){
            for(int elementos[]:matriz){
                System.out.print(" "+elementos);
            }
            System.out.println("");
        }
        System.out.println("Tercera Forma:");
        System.out.print(Arrays.deepToString(matriz));
        System.out.println("");
        
    }
    public static void main(String[] args) {
        
        System.out.println("Ingrese el tamaño de la matriz cuadrada: ");
        int tamaño=leer.nextInt();
        
        int matriz_x[][];
        matriz_x=new int[tamaño][tamaño];
        

    }
    
}
