package Clase_Pilas;

import javax.swing.JOptionPane;

public class Pilas {

    public int MAX;
    public int P[];
    public int tope;

    public Pilas(int n) {
        MAX = n;
        P = new int[MAX];
        tope = 0;
    }

    public boolean vacio() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lleno() {
        if (tope == MAX) {
            return true;
        } else {
            return false;
        }
    }

    public void adiciona(int e) {
        if (!lleno()) {
            P[tope] = e;
            tope++;
        } else {
            JOptionPane.showMessageDialog(null, "Pila llena");
        }
    }

    public int elimina() {
        int e = -99999;
        if (!vacio()) {
            tope--;
            e = P[tope];
        } else {
            JOptionPane.showMessageDialog(null, "Pila vacia");
        }
        return e;
    }

    public String mostrar() {
        int e;
        String s = "";
        Pilas PA = new Pilas(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            s = s + "  " + e;
        }
        restaura(PA);
        return s;
    }

    public void restaura(Pilas PA) {
        int e;
        while (!PA.vacio()) {
            e = PA.elimina();
            adiciona(e);
        }
    }

    // elimina los elementos Pares de la Pila dada
    public void eliminaPares() {
        int e;
        Pilas PA = new Pilas(MAX);
        while (!vacio()) {
            e = elimina();
            if (e % 2 != 0) {
                PA.adiciona(e);
            }
        }
        restaura(PA);
    }

    //2. Mostrar los elementos centrales de la Pila :
    public String centrales() {
        String elemCentral = "";
        int e, centro, mid1, mid2;
        centro = tope;
        Pilas PA = new Pilas(MAX);
        if (!vacio()) {
            if (centro % 2 == 0) {//pila par, mostrar 2 elem
                mid1 = centro / 2;
                mid2 = (centro / 2) + 1;
                while (!vacio()) {
                    e = elimina();
                    PA.adiciona(e);
                    if (centro == mid1) {
                        elemCentral = elemCentral + " " + e;
                    }
                    if (centro == mid2) {
                        elemCentral = elemCentral + " " + e;
                    }
                    centro--;
                }
            } else {//pila impar, mostrar 1 elem
                mid1 = (centro / 2) + 1;
                while (!vacio()) {
                    e = elimina();
                    PA.adiciona(e);
                    if (centro == mid1) {
                        elemCentral = elemCentral + " " + e;
                    }
                    centro--;
                }
            }
        }
        restaura(PA);
        return elemCentral;
    }

    // 4. Invertir Pila
    public void invertir() {
        int e;
        Pilas PA1 = new Pilas(MAX);
        Pilas PA2 = new Pilas(MAX);
        //
        while (!vacio()) {
            e = elimina();
            PA1.adiciona(e);
        }
        PA2.restaura(PA1);
        restaura(PA2);  
    }
    // 6. elimina los elementos sean mayor o menor
    
    // para el mayor
    public int mayor() {
        int em, e;
        Pilas PA = new Pilas(MAX);
        em = elimina();
        PA.adiciona(em);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            if (e > em) {
                em = e;
            }
        }
        restaura(PA);
        return em;
    }

    // para el menor
    public int menor() {
        int em, e;
        Pilas PA = new Pilas(MAX);
        em = elimina();
        PA.adiciona(em);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            if (e < em) {
                em = e;
            }
        }
        restaura(PA);
        return em;
    }
    // 10. Eliminar elementos repetidos 
    public void eliminaRep() {
        int e1, e2;
        Pilas PA = new Pilas(MAX);
        while (!vacio()) {
            e1 = elimina();
            boolean sw = true;
            while (!vacio() && sw == true) {
                e2 = elimina();
                if (e1 != e2) {
                    sw = false;
                    adiciona(e2);
                }
            }
            PA.adiciona(e1);
        }
        restaura(PA);
    }
    
    // 12. Modificar la Pila: sus elementos con sus Adyasentes
    public void intercambiaAdy() {
        int e1, e2;
        Pilas PA = new Pilas(MAX);
        while (!vacio()) {
            e1 = elimina();
            e2 = elimina();
            PA.adiciona(e2);
            PA.adiciona(e1);
        }
        restaura(PA);
    }

}
