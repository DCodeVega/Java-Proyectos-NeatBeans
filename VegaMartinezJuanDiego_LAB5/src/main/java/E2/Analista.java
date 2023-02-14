package E2;
public class Analista extends Ingenieros{
    private double bonote,bonoAntgA,tbono,descAFP;

    public Analista(int pd, int dt, double descxmin, double txretraso) {
        super(pd, dt, descxmin, txretraso);
    }
    public void cBonoTe(){
        bonote=10*getDt();
        System.out.println("Bono Té: "+bonote+" Bs");
    }
    public void cbonoAntiguedad(){
        bonoAntgA=0.05*getSl();
        System.out.println("Bono de Antiguedad: "+bonoAntgA+" Bs");
    }
    public void TotalBono(){
        tbono=bonote+bonoAntgA;
        System.out.println("total Bonos: "+tbono+" Bs");
    }
    public void DescAFP(){
        descAFP=getSl()*0.16;
        System.out.println("Descuento por AFP: "+descAFP+" Bs");
    }
    public void cTotalDescuentodeAnlta(){
        setTdesc(getDescxretraso()+descAFP);
        System.out.println("Total descuento del Analista: "+getTdesc()+" Bs");
    }
    public void SFinaldelAnlta(){
        setSf(getSl()-getTdesc()+tbono);
        System.out.println("El Salario Final del Analista es: "+getSf()+" Bs");
    }
}
