
package vector;

public class Termino {
  public int coef,expo;

    public Termino() {
    }

    public Termino(int coef, int expo) {
        this.coef = coef;
        this.expo = expo;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public int getExpo() {
        return expo;
    }

    public void setExpo(int expo) {
        this.expo = expo;
    }

    public String getTodo(){
        String s;
        s=coef + " X¨ "+expo+"  ";
        return s;
    }
  
}
