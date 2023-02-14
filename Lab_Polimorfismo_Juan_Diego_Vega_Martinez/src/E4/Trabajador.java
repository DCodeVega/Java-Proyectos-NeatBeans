package E4;
public class Trabajador {
    private double sl,bonoAntg,descRComun,descAFP,descSol,sf;
    private double descxmin=2,descxretraso,descRT;
    private int ht,dt,pd,antg;

    public double getSl() {
        return sl;
    }
    public void setSl(double sl) {
        this.sl = sl;
    }
    public double getBonoAntg() {
        return bonoAntg;
    }
    public void setBonoAntg(double bonoAntg) {
        this.bonoAntg = bonoAntg;
    }
    public double getDescRComun() {
        return descRComun;
    }
    public void setDescRComun(double descRComun) {
        this.descRComun = descRComun;
    }
    public double getDescAFP() {
        return descAFP;
    }
    public void setDescAFP(double descAFP) {
        this.descAFP = descAFP;
    }
    public double getDescSol() {
        return descSol;
    }
    public void setDescSol(double descSol) {
        this.descSol = descSol;
    }
    public double getSf() {
        return sf;
    }
    public void setSf(double sf) {
        this.sf = sf;
    }
    public double getDescxmin() {
        return descxmin;
    }
    public void setDescxmin(double descxmin) {
        this.descxmin = descxmin;
    }
    public double getDescxretraso() {
        return descxretraso;
    }
    public void setDescxretraso(double descxretraso) {
        this.descxretraso = descxretraso;
    }
    public double getDescRT() {
        return descRT;
    }
    public void setDescRT(double descRT) {
        this.descRT = descRT;
    }
    public int getHt() {
        return ht;
    }
    public void setHt(int ht) {
        this.ht = ht;
    }
    public int getDt() {
        return dt;
    }
    public void setDt(int dt) {
        this.dt = dt;
    }
    public int getPd() {
        return pd;
    }
    public void setPd(int pd) {
        this.pd = pd;
    }
    public int getAntg() {
        return antg;
    }
    public void setAntg(int antg) {
        this.antg = antg;
    }      
    public Trabajador(int ht, int antg) {
        this.ht = ht;
        this.antg = antg;
    }

    public Trabajador(int dt, int pd, int antg) {
        this.dt = dt;
        this.pd = pd;
        this.antg = antg;
    }

    public Trabajador(double descxretraso, int dt, int pd) {
        this.descxretraso = descxretraso;
        this.dt = dt;
        this.pd = pd;
    }   
    
    public void calcularLiquido(){
        System.out.println("Ley 065"); 
    }
    public void BonoAntg(){
        System.out.println("Bono Antiguedad");
    }
    public void descRiesgoC(){
        System.out.println("Descuento Al Riesgo Comun");
    }
    public void descAFP(){
        System.out.println("Descuento a la AFP");
    }
    public void LiquidoPagable(){
        System.out.println("Liquido pagable");
    }
    public void descSolidario(){
        System.out.println("Descuento Solidario");
    }
    public void descRetraso(){
        System.out.println("Descuento de Retraso");
    }
}
