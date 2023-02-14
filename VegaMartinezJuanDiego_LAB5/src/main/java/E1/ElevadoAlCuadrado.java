package E1;
public class ElevadoAlCuadrado extends Numeros{    
    public ElevadoAlCuadrado( int n) {
        super(n);      
    }  
    public void OperacionPotencia(){
        setExpo( Math.pow(getN(),2));
        System.out.println("El Numeros "+getN()+" elevado al cuadrado es: "+getExpo());
    }
}
