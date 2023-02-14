package E5;
import java.util.Scanner;
public class Numeros {
    private int cantNum,nmayor,nmenor,nsuma=0,n,a=0,b=0;
    private int opc;
    
    public void CantidadNumeros(){
        Scanner leer=new Scanner (System.in);      
        do{
            System.out.println("introducir Cantidad de Numeros a Ingresar: ");
            cantNum=leer.nextInt();
        }while(cantNum<=0);
        int[] v=new int[cantNum];       
    }
    public void leerNumeros(){
        for(int i=0;i<cantNum;i++){
            Scanner leern=new Scanner (System.in);
            do{
                System.out.println("Ingresar Numeros Mayor a Cero: ");
                n=leern.nextInt();               
            }while(n<=0);
            
            if(n>a){
                nmayor=n;
                a=n;
            }
            else{
                if(n>b){
                    b=n;
                    nmenor=n;
                }
                else{
                    b=n;
                    nmenor=n;
                }
            }
            nsuma=nsuma+n;            
        }
    }
    public void MenuOperaciones(){
        Scanner leero=new Scanner (System.in);
        System.out.println("Bienvenido al Menu de Operaciones UPEA");
        do{
            System.out.println("-------------------------------------");
            System.out.println("Presione 1: Hallar Numero Mayor y Menor");
            System.out.println("Presione 2: Hallar Numero Mayor y Suma Total");
            System.out.println("Presione 3: Hallar Numero Mayor, Numero Menor y"
                    + " Suma Total");
            System.out.println("Presione 4: Para Salir");
            System.out.println("-------------------------------------");
            opc=leero.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Su Numero Mayor es: "+nmayor);
                    System.out.println("Su Numero Menor es: "+nmenor);
                    break;
                case 2:
                    System.out.println("Su Numero Mayoe es: "+nmayor);
                    System.out.println("La Suma de sus Numeros es: "+nsuma);
                    break;
                case 3:
                    System.out.println("Su Numero Mayor es: "+nmayor);
                    System.out.println("Su Numero Menor es: "+nmenor);
                    System.out.println("La Suma de sus Numeros es: "+nsuma);
                    break;
                case 4:
                    System.out.println("---> Gracias por Usar Nuestro Programa <---");               
            }
        }while(opc !=4);
    }
}
