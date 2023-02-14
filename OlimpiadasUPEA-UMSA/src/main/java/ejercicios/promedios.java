package ejercicios;
import java.util.Scanner;
public class promedios {
    static Scanner leer=new Scanner(System.in);
    
    static int cant,num,x=0,y=0;
    static float proc;
    static int v[];
    
     static void entrada(){
        do{
        cant=leer.nextInt();
        }while(!(cant>2 && cant<1000));
        v= new int[cant];
        
        for (int i = 0; i < cant; i++) {
            do {
                num=leer.nextInt();
            } while (!(num>=1 && num<=1000));
            v[i]=num;
        }
    }
     static void proceso(){
        for (int i = 0; i < cant-1; i++) {
            proc=v[x]+v[x+1];
            proc=proc/2;
            System.out.println(proc);
            x++;
        }
        proc=v[0]+v[x];
        proc=proc/2;
        System.out.println(proc);
    }
    public static void main(String[] args) {
        entrada();
        proceso();
    } 
}
