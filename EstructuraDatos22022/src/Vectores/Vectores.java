
package Vectores;

import javax.swing.JOptionPane;

public class Vectores {
    public int V[];
    public int tam;
   public Vectores(int n){// constructor
       tam=n;
       V= new int[tam];
   } 
   public void llenar(){
       for (int i = 0; i < tam; i++) {
          V[i]=Integer.parseInt(JOptionPane.showInputDialog("Valor:",""));
       }
   }
   
   public String mostrar(){
       String s="";
       for (int i = 0; i < tam; i++) {
          s= s + "  "+V[i]; 
       }
     return s;  
   }
}
