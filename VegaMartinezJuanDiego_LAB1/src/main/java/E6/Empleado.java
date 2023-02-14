
package E6;

public class Empleado {
    int ide,s,at;
    double p,t;
    
    public void salarioP(){
        if(at>2){
            if(at>5){
                p=100*1;
            }//verdad
            else{
               p=100*0.5; 
            }//falso
        }
        else{
            p=0;
        }
        System.out.println("Salario Plus: "+p+" Bs");
    }
    public void salarioT(){
        t=s+p;
        System.out.println("Salario Total: "+t+" Bs");
    }   
}
