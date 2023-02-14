
package Pilas;

import javax.swing.JOptionPane;

public class Pilas {
    public int P[];
    public int MAX;
    public int tope;
    
    public pilas(int n){
        MAX=n;
        P=new int[MAX];
        tope=0;
        
    }
    
    public boolean vacio(){
        if(tope==0)
            return true;
        else
            return false;
    }
    
    void adiciona(int e){
        if(!vacio()){
            P[tope]=e;
            tope++;
        }
        else{
            JOptionPane.showMessageDialog(null,"pilavacion");
        }
    }
}
