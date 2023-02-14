package E4;

public class Numeros {

    public int n1, n2, n3, n4, n5, n6, n7, n8;
    public int sp=0, si=0, cp=0, ci=0;
    public int cant = 8;
    public int nu[]=new int [cant];
    
    public Numeros(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
        this.n7 = n7;
        this.n8 = n8;
    }
    
    public void vNum(){                
        nu[0]=n1;
        nu[1]=n2;
        nu[2]=n3;
        nu[3]=n4;
        nu[4]=n5;
        nu[5]=n6;
        nu[6]=n7;
        nu[7]=n8;
        for(int i=0;i<cant;i++){
            if(nu[i]%2==0){
                cp=cp+1;
                sp=nu[i]+sp;
            }//verdad
            else{
                ci=ci+1; 
                si=nu[i]+si; 
            }//falso
        }
    }

    public void mostrarNum(){              
        System.out.println("numeros introducidos: ");
        for(int i=0;i<cant;i++){
            System.out.print("\t"+nu[i]);
        }
        System.out.println("");
    }
            
    public void sPares() {
        
        System.out.println("Suma de Pares: "+sp);
    }
    public void sImpares(){
        
        System.out.println("Suma de Impares: "+si);
    }
    public void cPares(){
        
        System.out.println("Cantidad de Pares: "+cp);
    }
    
    public void cImpares(){
        
        System.out.println("cantidad de Impares: "+ci);
    }
}
