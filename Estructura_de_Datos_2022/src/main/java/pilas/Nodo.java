
package pilas;

/**
 *
 * @author Diego Vega
 */
public class Nodo {
    private String Plato;
    
    private Nodo arriba;
    private Nodo abajo;

    public String getPlato() {
        return Plato;
    }

    public void setPlato(String Plato) {
        this.Plato = Plato;
    }

    public Nodo getArriba() {
        return arriba;
    }

    public void setArriba(Nodo arriba) {
        this.arriba = arriba;
    }

    public Nodo getAbajo() {
        return abajo;
    }

    public void setAbajo(Nodo abajo) {
        this.abajo = abajo;
    }
    
    
}
