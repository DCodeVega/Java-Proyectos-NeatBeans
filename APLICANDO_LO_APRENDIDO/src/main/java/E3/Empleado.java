
package E3;
import java.util.Scanner;
public class Empleado {
    private int ide;
    private int s;
    private int ant;
    private int plus;
    
    public void leer(){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingresar ID de Empleado: ");
        ide=leer.nextInt();
        
        System.out.println("Ingresar Años de Antiguedad: ");
        ant=leer.nextInt();
        
        System.out.println("ingresar salario: ");
        s=leer.nextInt();
    }
    
    public void cPlus(){
        if(ant>2){
            if(ant>5){
                plus=s+100;
                System.out.println("Salario + el Plus de Antiguedad: "+plus);
            }
            else{
                plus=s+50;
                System.out.println("Salario + el Plus de Antiguedad:  "+plus);
            }//falso ant = menor a 5 años
        }
        else{
            plus=s+0;
            System.out.println("Salario + el Plus de Antiguedad: "+plus);
        }//falso
        System.out.println("·······························");
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getAnt() {
        return ant;
    }

    public void setAnt(int ant) {
        this.ant = ant;
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }
    
}
