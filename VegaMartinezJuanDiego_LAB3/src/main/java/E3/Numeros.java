
package E3;

public class Numeros {
    public int n1,n2,n3,n4,n5;
    public int cant=5;
    public int hma=0,hme=0,hsu=0;  
    public int v[]=new int [cant];
            
    public Numeros(int n1, int n2, int n3, int n4, int n5) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;               
    }
    public void vNum(){        
        v[0]=n1;
        v[1]=n2;
        v[2]=n3;
        v[3]=n4;
        v[4]=n5;
        hme=n1;
        for(int i=0;i<cant;i++){
            if(hma<v[i]){
                hma=v[i];
            }//verdad                     
        }//for
        for(int i=0;i<cant;i++){
            if(hme>v[i]){
                hme=v[i];
            }
        }
        for(int i=0;i<cant;i++){
            hsu=hsu+v[i];
        }
    }
    
    public void mostrar(){             
        System.out.println("Numeros Introducidos: ");
        for(int i=0;i<cant;i++){
            System.out.print(+v[i]+"\t");
        }
        System.out.println("");
    }
    public void hallarMayor(){
        
        System.out.println("Numero Mayor: "+hma);
    }
    public void hallarMenor(){               
        System.out.println("Numero Menor: "+hme);
    }
    public void hallarSuma(){
        System.out.println("Suma de Numeros: "+hsu);
    }
}

