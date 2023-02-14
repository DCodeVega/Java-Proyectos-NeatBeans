package Ej10;
import java.util.Scanner;
public class Ingenieros {
    private String nombre,ci;   
    private double sl,dt,pd,cb,tr,dxm,td,sf,dExtras;
    private double dAFP,bAntg,bDextras,bTotal;

    public Ingenieros(String nombre, String ci, double dt, double pd, double tr) {
        this.nombre = nombre;
        this.ci = ci;
        this.dt = dt;
        this.pd = pd;
        this.tr = tr;
    }     

    public Ingenieros(String nombre, String ci, double dt, double pd, double tr, double dExtras) {
        this.nombre = nombre;
        this.ci = ci;
        this.dt = dt;
        this.pd = pd;
        this.tr = tr;
        this.dExtras = dExtras;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
    public double getSl() {
        return sl;
    }
    public void setSl(double sl) {
        this.sl = sl;
    }
    public double getDt() {
        return dt;
    }
    public void setDt(double dt) {
        this.dt = dt;
    }
    public double getPd() {
        return pd;
    }
    public void setPd(double pd) {
        this.pd = pd;
    }
    public double getCb() {
        return cb;
    }
    public void setCb(double cb) {
        this.cb = cb;
    }
    public double getTr() {
        return tr;
    }
    public void setTr(double tr) {
        this.tr = tr;
    }
    public double getDxm() {
        return dxm;
    }
    public void setDxm(double dxm) {
        this.dxm = dxm;
    }
    public double getTd() {
        return td;
    }
    public void setTd(double td) {
        this.td = td;
    }
    public double getSf() {
        return sf;
    }
    public void setSf(double sf) {
        this.sf = sf;
    }
    public double getdExtras() {
        return dExtras;
    }
    public void setdExtras(double dExtras) {
        this.dExtras = dExtras;
    }
    public double getdAFP() {
        return dAFP;
    }
    public void setdAFP(double dAFP) {
        this.dAFP = dAFP;
    }
    public double getbAntg() {
        return bAntg;
    }
    public void setbAntg(double bAntg) {
        this.bAntg = bAntg;
    }
    public double getbDextras() {
        return bDextras;
    }
    public void setbDextras(double bDextras) {
        this.bDextras = bDextras;
    }
    public double getbTotal() {
        return bTotal;
    }
    public void setbTotal(double bTotal) {
        this.bTotal = bTotal;
    }
    private void Leer(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar Nombre: ");
        nombre=leer.nextLine();
        System.out.println("Ingresar C.I. : ");
        ci=leer.nextLine();
        System.out.println("Ingresar Dias Trabajados: ");
        dt=leer.nextInt();
        System.out.println("Ingresar Pago Diario: ");
        pd=leer.nextInt();
        System.out.println("Ingresar Tiempo de Retraso: ");
        tr=leer.nextInt();
        System.out.println("Ingresar Dias Extras Trabajados: ");
        dExtras=leer.nextInt();
    }        
}
