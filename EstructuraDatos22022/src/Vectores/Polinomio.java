package Vectores;

import javax.swing.JOptionPane;

public class Polinomio {

    public Termino P[];
    public int nt;

    public Polinomio(int n) {
        nt = n;
        P = new Termino[nt];
    }

    public void llenar() {
        for (int i = 0; i < nt; i++) {
            int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Coeficiente", ""));
            int e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Exponente", ""));
            Termino t = new Termino(c, e);
            P[i] = t;
        }
    }

    public String mostrar() {
        String s = "";
        for (int i = 0; i < nt; i++) {
            s = s + P[i].getTodo();
        }
        return s;
    }

    public void ordena() {
        for (int i = 0; i < nt - 1; i++) {
            for (int j = i + 1; j < nt; j++) {
                if (P[i].getExpo() > P[j].getExpo()) {
                    Termino aux = new Termino();
                    aux = P[i];
                    P[i] = P[j];
                    P[j] = aux;
                }
            }

        }
    }

    public void simplifica() {
        int i, j, k;
        for (i = 0; i < nt - 1; i++) {
            for (j = i + 1; j < nt; j++) {
                if (P[i].getExpo() == P[j].getExpo()) {
                    P[i].coef = P[i].coef + P[j].coef;
                    for (k = j; k < nt - 1; k++) {
                        P[k] = P[k + 1];
                    }
                    nt--;
                    j--;
                }
            }
        }

    }
    public void suma(Polinomio pol1, Polinomio pol2, Polinomio pol3) {
        int i, k;
        k = 0;
        for (i = 0; i < pol1.nt; i++) {
            Termino t = new Termino(pol1.P[i].coef, pol1.P[i].expo);
            pol3.P[k] = t;
            k++;
        }
        for (i = 0; i < pol2.nt; i++) {
            Termino t = new Termino(pol2.P[i].coef, pol2.P[i].expo);
            pol3.P[k] = t;
            k++;
        }
        pol3.ordena();
        pol3.simplifica();
    }
}
