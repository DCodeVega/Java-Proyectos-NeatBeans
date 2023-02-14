package E2;

import java.util.Scanner;

public class Numeros {

    private int tamaño;
    private int v[];
    private int suma;
    private int promedio;
    

    //     Getters y Setters  //
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int[] getV() {
        return v;
    }

    public void setV(int[] v) {
        this.v = v;
    }

    private void iValores() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar Valores: ");
        v = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            v[i] = teclado.nextInt();
        }
        System.out.println("Valores Ingresados:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(v[i] + "  ");
        }
        System.out.println("");
    }
    private void leer(){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la cantidad de datos: ");
        tamaño=leer.nextInt();
    }
    
    private  void cSuma() {
        for(int i=0;i<tamaño;i++){
            suma=suma+v[i];
        }
        System.out.println("Suma de los Valores: "+suma);

    }

    private void cPromedio() {
        promedio= suma/tamaño;
        System.out.println("Promedio de los Valores: "+promedio);

    }
    


}
