package ejercicios_de_clases;

import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class mainE1 {
    static Scanner datoEntrada=new Scanner(System.in);
    
    static void llenar_vector(String vector[]){
        System.out.println("llenando el vector...");
        int tamaño=vector.length;
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese el vector Nº "+i+":");
                vector[i]=datoEntrada.next();
            } 
    }
    
    static void mostrar_vector(String vector[]){
        System.out.println("mostrar vector:");
        for (String elementos:vector) {
            System.out.print(elementos+" ");   
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño=datoEntrada.nextInt();
        String vector_x[];
        vector_x = new String[tamaño];
        llenar_vector(vector_x);
        mostrar_vector(vector_x);
        
        E1_vector obj=new E1_vector();
        obj.ejercicio_1(vector_x);
        System.out.println("");
        
        System.out.println("Ingrese Nombre a Buscar: ");
        String nombre_x_teclado = datoEntrada.next();
        obj.ejercicio_2(vector_x, nombre_x_teclado);
        obj.ejercicio_3(vector_x);
        obj.ejercicio_4(vector_x);
        /*
        E2_resolviendo_ej obj2=new E2_resolviendo_ej();
        
        obj2.ejercicio_5(nombre_x_teclado);
        obj2.ejercicio_6(nombre_x_teclado);
        */
    }
    
}
