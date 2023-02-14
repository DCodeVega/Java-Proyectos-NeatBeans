package Practicas;
import java.util.Scanner;
public class Numeros_Primos {
    
    static void sumar(){
        
    }
    
    public static void main(String[] args) {
        int canPrimos,num=2,cdiv=0,div;
        boolean entrada = true;
        
        Scanner leer=new Scanner(System.in);     
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
                while (entrada==true) {                    
                System.out.println("Estos son los Primeros "+canPrimos+" numeros Primos: ");
                entrada=false;
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
