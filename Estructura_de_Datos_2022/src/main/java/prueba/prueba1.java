
package prueba;

import javax.swing.JOptionPane;

public class prueba1 {
/*
    public void numPrimos(){
        String nPrimos="";
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
        }
        
    }*/
    
    public static void main(String[] args) {
        String nPrimos="";
        int cantP,numAuxP=1,contador=0;
        cantP=2;
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
    
}
