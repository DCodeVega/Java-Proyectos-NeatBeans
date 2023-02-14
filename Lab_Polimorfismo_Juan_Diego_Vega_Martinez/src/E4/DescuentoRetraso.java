package E4;
public class DescuentoRetraso extends Trabajador{

    public DescuentoRetraso(double descxretraso, int dt, int pd) {
        super(descxretraso, dt, pd);
    }   
    
    @Override
    public void calcularLiquido(){
        setSl(getDt()*getPd());
        System.out.println("Salario Inicial es: "+getSl());
    }
    @Override
    public void descRetraso(){
        setDescRT(getDescxmin()*getDescxretraso());
        System.out.println("Descuento por Retraso: "+getDescRT());
    }
    @Override
    public void LiquidoPagable(){
        setSf(getSl()-getDescRT());
        System.out.println("Liquido Pagable: "+getSf());
    }
}
