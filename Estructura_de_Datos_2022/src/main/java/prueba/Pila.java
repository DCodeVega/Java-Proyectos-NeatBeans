package Pilas;

import javax.swing.JOptionPane;

public class Pila {

    public int MAX;
    public int P[];
    public int tope;

    public Pila(int n) {
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
             JOptionPane.showMessageDialog(null,"pila lleno");
        }
    }

}
