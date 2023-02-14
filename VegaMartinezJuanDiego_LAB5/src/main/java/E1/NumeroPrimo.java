package E1;
public class NumeroPrimo extends Numeros{      
    public NumeroPrimo (int n){
        super (n);        
    }
    public void Analizar(){
        for(int i=0;i<getN();i++){
            if(getN()%getP()==0)
            {
                setMod(getMod()+1);
                setP(getP()+1);
            }//verdad 
            else{
            setP(getP()+1);
            }//falso            
        }
    }
    public void mostrarPrimo(){
        if(getMod()==2)
        {
            System.out.println("El Numero "+getN()+" es Numero Primo");
        }//verdad
        else{
            System.out.println("El Numero "+getN()+" No es Numero Primo");
        }//falso
    }
}
