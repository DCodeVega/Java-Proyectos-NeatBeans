package vector;

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
            int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese coef", ""));
            int e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese expo", ""));
            Termino t= new Termino(c,e);
            P[i]=t;
        }

    }
 public String mostrar(){
   String s="";
     for (int i = 0; i < nt; i++) {
         s=s+P[i].getTodo() ;
     }
  return s;   
 }
}
