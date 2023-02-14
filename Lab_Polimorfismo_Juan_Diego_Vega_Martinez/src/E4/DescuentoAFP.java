package E4;
public class DescuentoAFP extends Trabajador{

    public DescuentoAFP(int ht, int antg) {
        super(ht, antg);
    }      
    @Override
    public void calcularLiquido(){
        setSl(getHt()*10);
        System.out.println("Salario de 10 Bs x hora. Horas Trabajadas: "+getHt()+" Total es: "+getSl());
    }
    @Override
    public void BonoAntg(){
        if(getAntg()>1 && getAntg()<5){
            setBonoAntg(getAntg()*(getSl()*0.05));
            System.out.println("Bono de Antiguedad Total es: "+getBonoAntg());          
        }
        else{
            if(getAntg()>4 && getAntg() <8){
                setBonoAntg(getAntg()*(getSl()*0.011));
                System.out.println("Bono de Antiguedad Total es: "+getBonoAntg()); 
            }
            else{
                if(getAntg()>7 && getAntg()<11){                     
                    setBonoAntg(getAntg()*(getSl()*0.018));
                    System.out.println("Bono de Antiguedad Total es: "+getBonoAntg()); 
                }
                else{
                    if(getAntg()>10 && getAntg() <15){
                     setBonoAntg(getAntg()*(getSl()*0.026));
                     System.out.println("Bono de Antiguedad Total es: "+getBonoAntg()); 
                    }
                    else{
                        if(getAntg()>14 && getAntg() <20){
                        setBonoAntg(getAntg()*(getSl()*0.034));
                        System.out.println("Bono de Antiguedad Total es: "+getBonoAntg());    
                        }
                        else{
                            if(getAntg()>19 && getAntg() <25){
                            setBonoAntg(getAntg()*(getSl()*0.042));
                            System.out.println("Bono de Antiguedad Total es: "+getBonoAntg()); 
                            }
                            else{
                                setBonoAntg(getAntg()*(getSl()*0.050));
                                System.out.println("Bono de Antiguedad Total es: "+getBonoAntg()); 
                            }
                        }
                    }
                }
            }
        }
        
    }
    @Override
    public void descRiesgoC(){
        setDescRComun(getSl()*0.0171);
        System.out.println("Descuento al Riesgo Comun es: "+getDescRComun());
    }
    @Override
    public void descAFP(){
        setDescAFP(getSl()*0.005);
        System.out.println("Descuento a la Comision de la AFP: "+getDescAFP());
    }
    @Override
    public void LiquidoPagable(){
        setSf((getSl()+getBonoAntg())-(getDescAFP()+getDescRComun()));
        System.out.println("Liquido Pagable: "+getSf());
    }
    
}
