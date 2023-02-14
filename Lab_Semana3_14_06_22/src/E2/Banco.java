
package E2;
import java.util.Scanner;
public class Banco {
    public int saldoInicial,deposito,retirar;
    public int opc;
    
    public void leer(){
        Scanner leer=new Scanner (System.in);
        do{
            System.out.println("---------------------");
            System.out.println("Presione 1: Saldo");
            System.out.println("Presione 2: Deposito");
            System.out.println("Presione 3: Retiro");
            System.out.println("Presione 4: Salir");
            System.out.println("---------------------");
            opc=leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Saldo Actual: "+saldoInicial);
                    break;
                case 2:
                    System.out.println("*****Ingrese Monto a Depositar: ");
                    deposito=leer.nextInt();
                    if(deposito > 0){
                        saldoInicial=saldoInicial+deposito;
                        System.out.println("************************************");
                        System.out.println("=====Usted Deposito: "+deposito+" =====");
                        System.out.println("=====Su Saldo es de: "+saldoInicial);
                        System.out.println("************************************");
                    }
                    break;
                case 3:
                    System.out.println("*****Ingrese Monto a Retirar: ");
                    retirar=leer.nextInt();
                    if(retirar <= saldoInicial){
                        saldoInicial=saldoInicial-retirar;
                        System.out.println("************************************");
                        System.out.println("=====Usted Retiro: "+retirar+" =====");
                        System.out.println("=====Su Saldo es de: "+saldoInicial+" =====");
                        System.out.println("************************************");
                    }
                    else{
                        System.out.println("=====Saldo Insuficiente para Retirar=====");
                    }
                    break;
                case 4:
                    System.out.println("*****Gracias por Usar Banco UPEA*****");
                    break;
            }
        }while(opc !=4);
    }
}
