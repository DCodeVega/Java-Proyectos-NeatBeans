
package Vectores_d2;

import javax.swing.JOptionPane;

public class Vectores {
    int MAX;
    int V[];
    
    public Vectores(int n){
        MAX=n;
        V=new int[MAX];
    }
    void leer(){
        int i;
        for(i=0;i<MAX;i++){
            V[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese Dato"));            
        }       
    }
    String mostrar(){
        String s="";
        int i;
        for(i=0;i<MAX;i++){
            s=s+" "+V[i];
        }
        return s;
    }
            
}
