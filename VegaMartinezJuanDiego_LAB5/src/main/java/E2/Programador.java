package E2;
public class Programador extends Ingenieros{
    private double descAFPrc;

    public Programador(int pd, int dt, double descxmin, double txretraso) {
        super(pd, dt, descxmin, txretraso);
    }   
    public void cDescuentoAFPrc(){
        descAFPrc=getSl()*0.1;
        System.out.println("Total descuento de la AFP-rc es : "+descAFPrc+" Bs");
    }
    public void cTotalDescuentoProg(){
        setTdesc(getDescxretraso()+descAFPrc);
        System.out.println("Total descuento del Programador es: "+getTdesc()+" Bs");
    }
    public void sFinalProg(){
        setSf(getSl()-getTdesc());
        System.out.println("El Salario Final del Programador es: "+getSf()+" Bs");
    }
}
