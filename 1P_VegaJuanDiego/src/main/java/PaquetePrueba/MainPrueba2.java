
package PaquetePrueba;

import E2.Trabajador;

public class MainPrueba2 {

    public static void main(String[] args) {
        Trabajador t4=new Trabajador();
        t4.setNombre("Pedro");
        t4.setAnt(23);
        t4.mostrar();
        t4.cSalarioF();
        System.out.println("");
        System.out.println("--------------------");
        Trabajador t5=new Trabajador();
        t5.setNombre("Luis");
        t5.setAnt(26);
        t5.mostrar();
        t5.cSalarioF();
    }
    
}
