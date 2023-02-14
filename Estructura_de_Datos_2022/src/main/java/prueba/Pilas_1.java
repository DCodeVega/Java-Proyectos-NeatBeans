package Pila;

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
            JOptionPane.showMessageDialog(null, "pila llena");
        }
    }

    public int elimina() {
        int e = -99;
        if (!vacio()) {
            tope--;
            e = P[tope];
        } else {
            JOptionPane.showMessageDialog(null, "Pila Vacia");
        }
        return e;
    }

    public String mostrar() {
        String s = "";
        int e;
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

    public void eliminaPar() {
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

    public void eliminaXdiv(int x) {
        int e;
        Pilas PA = new Pilas(MAX);
        while (!vacio()) {
            e = elimina();
            if (e % x != 0) {
                PA.adiciona(e);
            }
        }
        restaura(PA);
    }

    public void intercala(Pilas A, Pilas B, Pilas C) {
        int e1, e2;
        Pilas PA1 = new Pilas(MAX);
        Pilas PA2 = new Pilas(MAX);
        while (!A.vacio() && !B.vacio()) {
            e1 = A.elimina();
            e2 = B.elimina();
            C.adiciona(e1);
            C.adiciona(e2);
            PA1.adiciona(e1);
            PA2.adiciona(e2);
        }
        while (!A.vacio()) {
            e1 = A.elimina();
            C.adiciona(e1);
            PA1.adiciona(e1);
        }
        while (!B.vacio()) {
            e2 = B.elimina();
            C.adiciona(e2);
            PA2.adiciona(e2);
        }
        A.restaura(PA1);
        B.restaura(PA2);
    }

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
  void insertaX(int x)
  {
     int e;
     Pilas PA=new Pilas(MAX+1);
     boolean sw=true;
     while(!vacio() && sw==true){
        e=elimina();
        if(e<=x){
            PA.adiciona(x);
            PA.adiciona(e);
            sw=false;
        }
        else
            PA.adiciona(e);
     }
     if(vacio())
         PA.adiciona(x);
     
     while(!vacio()){
         e=elimina();
         PA.adiciona(e);
     }
     MAX=MAX+1;
     P=new int[MAX];
     tope=0;
     restaura(PA);
  }
  
  public void invierte(){
      int e;
  Pilas PA1 = new Pilas (MAX);
  Pilas PA2 = new Pilas (MAX);
  while(!vacio()){
      e=elimina();
      PA1.adiciona(e);
  }
  PA2.restaura(PA1);
  restaura(PA2);
  
  
  }
  
  
  
  
  
}





