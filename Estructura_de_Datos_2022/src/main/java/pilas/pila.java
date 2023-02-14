
package pilas;

/**
 *
 * @author USUARIO
 */
public class pila {
    private Nodo Cabeza;
    private int ContNodo=0;
    
    public int getContNodo(){
        return ContNodo;
    }
    
    public void Print(){
        Nodo L=Cabeza;
        
        while(L !=null){
            System.out.println(L.getPlato()+"");
            L=L.getAbajo();
        }
    }
}
