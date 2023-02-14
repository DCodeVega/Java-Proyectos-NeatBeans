package pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Pilas {
 public int MAX;
    public int P[];
    public int tope;
    
    public Pilas (int n){
        MAX =n;
        P= new int [MAX];
        tope=0;
    }
    public boolean vacio(){
        if (tope ==0) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean lleno(){
        if (tope==MAX) {
            return true;
        }else{
            return false;
        }
    }
    
    public void adiciona (int e){
        if (!lleno()) {
            P[tope]=e;
            tope++;
        }else{
            JOptionPane.showMessageDialog(null, "Pila llena");
        }
    }
    
    public int elimina(){
        int e=Integer.MAX_VALUE;// MAX_VALUE = es el valor mas grande que el entero tiene
      //int e=-99999;
        if(!vacio()){
            tope--;
            e=P[tope];
        }else{
            JOptionPane.showMessageDialog(null, "Pila Vacia");
        }
        return e;
    }
    
    public String mostrarD(){
        String s="";
        for(int i=tope;i>0;i--){
            s=s+" "+P[i];
        }
        return s;
    }
    
    public String mostrar(){
        int e;
        String s="";
        Pilas PA=new Pilas(MAX);
        while(!vacio()){
            e=elimina();
            PA.adiciona(e);
            s=s+" "+e;
        }
        while(!PA.vacio()){
            e=PA.elimina();
            adiciona(e);
        }
        return s;
    }
    
    public void restaura(Pilas PA){
        int e;
        while(!PA.vacio()){
            e=PA.elimina();
            adiciona(e);
            
        }
    }
    // eliminar los elementos Pares de la PIla Dada:
    public void eliminaPares(){
        int e;
        Pilas PA=new Pilas(MAX);
        while(!vacio()){
            e=elimina();
            if(e%2!=0){
                PA.adiciona(e);
            }
        }
        restaura(PA);
    }
    // 6. Mostrar el elemento mayor y menor de la pila:
    // para el mayor
    public int mayor(){
        int em,e;
        Pilas PA=new Pilas(MAX);
        em=elimina();
        PA.adiciona(em);
        while(!vacio()){
            e=elimina();
            PA.adiciona(e);
            if(e>em){
                em=e;
            }
        }
        restaura(PA);
        return em;
    }
    // para el menor
    public int menor(){
        int em,e;
        Pilas PA=new Pilas(MAX);
        em=elimina();
        PA.adiciona(em);
        while(!vacio()){
            e=elimina();
            PA.adiciona(e);
            if(e<em){
                em=e;
            }
        }
        restaura(PA);
        return em;
    }
        
}
