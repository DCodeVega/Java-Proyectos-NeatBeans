
package E1;

public class Contador extends Trabajador{
    private double td,tr,sf;
    private double dxm=1.50;
    
    // Getters y Setters
    public double getTd() {
        return td;
    }
    public void setTd(double td) {
        this.td = td;
    }
    public double getTr() {
        return tr;
    }
    public void setTr(double tr) {
        this.tr = tr;
    }
    public double getSf() {
        return sf;
    }
    public void setSf(double sf) {
        this.sf = sf;
    }
    public double getDxm() {
        return dxm;
    }
    public void setDxm(double dxm) {
        this.dxm = dxm;
    }
    
    // Contructor
    public Contador(double tr, int dt, int pd) {
        super(dt, pd);
        this.tr = tr;
    }
   
     // Metodos   
    private void cDescuentoTotal(){
        td=tr*dxm;
        System.out.println("total Descuento es: "+td);
    }
    private void cSalarioFinal(){
        sf=getSl()*td;
        System.out.println("Salario Final Total es: "+sf);
    }
}
