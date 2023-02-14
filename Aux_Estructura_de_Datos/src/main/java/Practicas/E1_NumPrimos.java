package Practicas;
import java.util.Scanner;
public class E1_NumPrimos {
    //public class Numeros_Primos {
    Scanner leer=new Scanner(System.in);
    int canPrimos=0,numPrimo=0,num=2,cdiv=0,div=0;
    boolean dos = true;
    public void pedirN(){
        System.out.println("Ingrese cantidad de Numeros Primos: ");
        canPrimos=leer.nextInt();
        for(int i=0;i<canPrimos;i++){
            div=num;
            for(int j=0;j<num;j++){
                //num=num/div;
                if(num%div==0){
                    cdiv=cdiv+1;
                }
                div=div-1;
                
            }
            if(cdiv==2){
                while (dos==true) {                    
                System.out.println("Estos son los Primeros "+canPrimos+" numeros Primos: ");
                dos=false;
                }
                System.out.print(num+"   ");
            }
            else{
                i=i-1;
            }
            num=num+1;
            cdiv=0;
        }
        
    }
    
}




    


