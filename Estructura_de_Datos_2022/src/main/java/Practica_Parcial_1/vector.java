package Practica_Parcial_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego Vega E1: Dado un vector V,sumar todos los elementos primos
 */
public class vector {

    public int V[];
    public int tam;
    public String nPrimos="";

    public vector(int n) {
        tam = n;
        V = new int[tam];
    }
    

    public void llenar() {
        for (int i = 0; i < tam; i++) {
            V[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para el vector Nº " + i));
        }
    }

    public String mostrar() {
        String s = "";
        for (int i = 0; i < tam; i++) {
            s = s + "," + V[i];
        }
        return s;
    }
    
    // 1. Dado un vector V,sumar todos los elementos primos

    public int sumaPrimos() {
        int suma=0;
        int aux = 0, ele=0;
        for (int i = 0; i < tam; i++) {
            for (int j = 1; j <= V[i]; j++) {
                ele=V[i];
                if (V[i] % j == 0) {
                    aux = aux + 1;
                }
            }
            if(aux==2){
                suma = suma +ele;
            }
            aux=0;
        }
        return (suma);
    }
    
    // 3. Dado un vector V, sumar todos los elementos Perfectos
    
    public int sumaPerfectos(){
        //int elemPerf=0;
        int sumaPe=0;
        int aux=0,ele=0;
        for (int i = 0; i < tam; i++) {
            for (int j = 1; j < V[i]; j++) {
               ele=V[i];
               if(V[i]%j==0){
                   aux=aux+j;
               }
            }
            if(aux==V[i]){
                sumaPe=sumaPe+ele;
            }
            aux=0;
        }
        return sumaPe;
    }
    
    public void numPrimos(){
        //String nPrimos="";
        int cantP,numAuxP=1,contador=0;
        cantP=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad "));
        for (int i = 0; i < cantP; i++) {
            for (int j = 1; j <= numAuxP; j++) {
                if (numAuxP%j==0) {
                    contador=contador+1;
                }
            }
            if (contador==2) {
                nPrimos=nPrimos+","+numAuxP;
            }else{
                i=i-1;
            }
            numAuxP=numAuxP+1;
            contador=0;
        }
        
    }
    
    public String mostrar2(){
        if (!(nPrimos==null)) {
            return nPrimos;
        }else{
            return nPrimos;
        }
    }
        

}
