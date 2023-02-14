package Pilas;

import javax.swing.JOptionPane;

public class Pila {

    public int MAX;
    public int P[];
    public int tope;//es la variable q sigue los elementos: añadir o eliminar

    public Pila(int n) {
        MAX = n;
        P = new int[MAX];
        tope = 0;
    }
    
    //             ¿esta Vacia?: Comprobar si una pila tiene elementos
    public boolean vacio() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    //             Cima / Peek : Comprobar si la pila esta llena
    public boolean lleno() {
        if (tope == MAX) {
            return true;
        } else {
            return false;
        }
    }
    
    //          Apilar / Push : adicionar un elemento a la cima de la Pila
    public void adiciona(int e) {
        if (!lleno()) {
            P[tope] = e;
            tope++;
        } else {
             JOptionPane.showMessageDialog(null,"Pila LLena");
        }
    }
    
    //         Desapilar / Pop : Quitar el Elemento que esta en la cima de la pila
    public int eliminar(){
        int elemento = -99;
        if (!vacio()) {
            tope--;
            elemento =P[tope];
        }else{
            JOptionPane.showMessageDialog(null, "Pila Vacia");
        }
        return elemento;
    }
    
    public void restaura(Pila aux){
        while(!aux.vacio()){
            this.adiciona(aux.eliminar());
        }
    }
    public int cuentaElementos(){
        int cuenta=0;
        Pila paux1= new Pila(MAX);
        while (!vacio()) {
            paux1.adiciona(this.eliminar());
            cuenta++;
        }
        this.restaura(paux1);
        return cuenta;
    }
    
    public String mostrar(){
        int elemento;
        String s="";
        Pila aux= new Pila(MAX);
        while (!vacio()){
            elemento = eliminar();
            aux.adiciona(elemento);
            s=s+" "+elemento;
        }
        restaura(aux);
        return s;
    }

}
