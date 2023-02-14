
package E7;

public class Tiempo {
    String usuario;
    int h;
    int m;
    int s;
            
    public void mostrarH(){
        if(h<=23){           
            if(h>12){
                System.out.println("Hora: "+h+" p.m.");
            }//verdad de H
            else{
                System.out.println("Hora: "+h+" a.m.");
            }//falso
                }//verdad
        else{
            System.out.println("por favor ingrese una hora apropiada del 0 al 23");
        }//falso
    }
    
    public void mostrarHM(){
        if(h<=23){
            if(h>12){
                if(m<60){
                    System.out.println("Hora: "+h+":"+m+" p.m.");
                }
                else{
                    System.out.println("por favor ingrese minutos apropiados del 0 al 59");
                }
            }//verdad de H m
            else{
                if(m<60){
                    System.out.println("Hora: "+h+":"+m+" a.m.");
                }
                else{
                    System.out.println("por favor ingrese minutos apropiados del 0 al 59");
                }
            }//falso de H m
        }//verdad
        else{
            System.out.println("por favor ingrese una hora apropiada del 0 al 23");
        }//falso
    }
    public void mostrarHMS(){
        if(h<24){
            if(h>12){
                if(m<60){
                    if(s<60){
                        System.out.println("Hora: "+h+":"+m+":"+s+" p.m.");
                    }//verdad segundos
                    else{
                        System.out.println("por favor ingrese los segundos apropiados del 0 al 59");
                    }//falso segundos
                }//verdad minutos
                else{
                    System.out.println("por favor ingrese minutos apropiados del 0 al 59");
                }//falso minutos                
            }//verdad
            else{
                if(m<60){
                    if(s<60){
                        System.out.println("Hora: "+h+":"+m+":"+s+" a.m.");
                    }//verdad segundos
                    else{
                        System.out.println("por favor ingrese los segundos apropiados del 0 al 59");
                    }//falso segundos
                }//verdad minutos
                else{
                    System.out.println("por favor ingrese minutos apropiados del 0 al 59");
                }//falso minutos
            }//falso
        }//verdad
        else{
            System.out.println("por favor ingrese una hora apropiada del 0 al 23");
        }//falso
    }
    
}
