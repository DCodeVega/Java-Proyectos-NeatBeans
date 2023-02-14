
package E2;

public class Ingenieros {
    private int pd,dt;
    private double sl,descxmin,txretraso,descxretraso,sFinal,tdesc,sf;
        
    public Ingenieros(int pd, int dt, double descxmin, double txretraso) {
        this.pd = pd;
        this.dt = dt;
        
        this.descxmin = descxmin;
        this.txretraso = txretraso;
    }
    public void cSalarioLdeIng(){
        sl=pd*dt;
        System.out.println("El Salario Liquido es: "+sl+" Bs");
    }
    public void cDescuentoxR(){
        descxretraso=descxmin*txretraso;
        System.out.println("Descuento por Retraso de "+txretraso+" minutos en el Trabajo \n total a descontasr es: "+descxretraso);
    }
    
    public void sFinal(){
        sf=sl-descxretraso;
        System.out.println("Total el Salario Final del Ingeniero es: "+sf+" Bs");
    }

    public void setTdesc(double tdesc) {
        this.tdesc = tdesc;
    }
    
    public int getPd() {
        return pd;
    }

    public int getDt() {
        return dt;
    }

    public double getSf() {
        return sf;
    }

    public double getSl() {
        return sl;
    }

    

    public double getDescxmin() {
        return descxmin;
    }

    public double getTxretraso() {
        return txretraso;
    }

    public double getDescxretraso() {
        return descxretraso;
    }

    public double getsFinal() {
        return sFinal;
    }

    public double getTdesc() {
        return tdesc;
    }

    public void setPd(int pd) {
        this.pd = pd;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public void setSl(double sl) {
        this.sl = sl;
    }

    public void setDescxmin(double descxmin) {
        this.descxmin = descxmin;
    }

    public void setTxretraso(double txretraso) {
        this.txretraso = txretraso;
    }

    public void setDescxretraso(double descxretraso) {
        this.descxretraso = descxretraso;
    }

    public void setsFinal(double sFinal) {
        this.sFinal = sFinal;
    }

    public void setSf(double sf) {
        this.sf = sf;
    }
    
}
