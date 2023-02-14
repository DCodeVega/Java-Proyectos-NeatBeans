package E4;
public class DeescuentoSolidario extends Trabajador{

    public DeescuentoSolidario(int dt, int pd, int antg) {
        super(dt, pd, antg);
    }       
    @Override
    public void calcularLiquido(){
        setSl(getDt()*getPd());
        System.out.println("Salario Inicial es: "+getSl());
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
    public void descSolidario(){
        setDescSol(getSl()*0.005);
        System.out.println("Descuento al Aparte Solidario: "+getDescSol());
    }  
    @Override
    public void LiquidoPagable(){
        setSf((getSl()+getBonoAntg())-(getDescAFP()+getDescRComun()));
        System.out.println("Liquido Pagable: "+getSf());
    }
}
