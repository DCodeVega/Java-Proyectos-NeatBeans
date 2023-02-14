
package E2;

public class Trabajador {
    private String nombre;
    private int ant;
    private double sm=2122.00,sf,ba;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAnt() {
        return ant;
    }
    public void setAnt(int ant) {
        this.ant = ant;
    }      
    public void mostrar(){
        System.out.println("Nombre de Trabajador/a: "+nombre);
        System.out.println("Salario Minimo: "+sm);
        System.out.println("Antiguedad: "+ant);
    }
    public void cSalarioF(){
        if(ant>1){
            if(ant>4){
                if(ant>7){
                    if(ant>10){
                        if(ant>14){
                            if(ant>19){
                                if(ant>25){
                                    ba=2122.00*0.50;
                                    sf=ba+sm;
                                    System.out.println("Bono de Antiguedad: 3,183 Bs");
                                    System.out.println("Salario Final: "+sf+" Bs");
                                }
                                else{
                                    ba=2122.00*0.42;
                                    sf=ba+sm;
                                    System.out.println("Bono de Antiguedad: 2,673.72 Bs");
                                System.out.println("Salario Final: "+sf+" Bs");
                                }                                                           
                            }                                
                            else{
                                ba=2122.00*0.34;
                                sf=ba+sm;
                                System.out.println("Bono de Antiguedad: 2,164.44 Bs");
                            System.out.println("Salario Final: "+sf+" Bs");
                            }                          
                        }else{
                            ba=2122.00*0.26;
                            sf=ba+sm;
                            System.out.println("Bono de Antiguedad: 1,655.16 Bs");
                            System.out.println("Salario Final: "+sf+" Bs");
                        }                                                
                    }
                    else{
                        ba=2122.00*0.18;
                        sf=ba+sm;
                        System.out.println("Bono de Antiguedad: 1,145.88 Bs");
                        System.out.println("Salario Final: "+sf+" Bs");                          
                    }
                }    
                else{
                    ba=2122.00*0.11;
                    sf=ba+sm;
                    System.out.println("Bono de Antiguedad: 700.26 Bs");
                    System.out.println("Salario Final: "+sf+" Bs");
                }               
            }
            else{
                ba=2122.00*0.05;
                sf=ba+sm;
                System.out.println("Bono de Antiguedad: 318.30 Bs");
                System.out.println("Salario Final: "+sf+" Bs");
            }//falso ant = menor a 5 años
        }
        else{
            ba=0;
            sf=ba+sm;
            System.out.println("Bono de Antiguedad: 0.00 Bs");
            System.out.println("Salario Final: "+sf+" Bs");
        }
    } 
    
}
        
