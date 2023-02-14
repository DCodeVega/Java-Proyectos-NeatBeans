package E2_Estructura_de_Datos;
/**
 *
 * @author Diego Vega
 */
public class ejercicios_1y3 {
    //•1.dado un vector V, sumar todo los elementos primos
    public void sumarPrimos(String vector[]){
        String elemPrimos="";
        int sumaPr=0;
        int aux = 0, ele=0;
        for (String elemento:vector) {
            for (int j = 1; j <= Integer.parseInt(elemento); j++) {
                ele=Integer.parseInt(elemento);
                if (Integer.parseInt(elemento) % j == 0) {
                    aux = aux + 1;
                }
            }
            if(aux==2){
                sumaPr = sumaPr +ele;
                elemPrimos=elemPrimos+" "+ele; 
            }
            aux=0;
        }
        System.out.println("•••Elementos Primos Encontrados:("+elemPrimos+" )");
        System.out.println("•••la suma de los Nros primos encontrados son: "+sumaPr);
    }
    //•2.dado un vector V, sumar todos los elementos Perfectos
    public void sumarPerfectos(String vector[]){
        String elemPerfectos="";
        int sumaPe=0;
        int aux=0, ele=0;
        for(String elemento:vector){
            for(int j=1; j< Integer.parseInt(elemento); j++){
                ele=Integer.parseInt(elemento);
                if(Integer.parseInt(elemento)%j==0){
                    aux=aux+j;
                }
                
            }
            if(aux==Integer.parseInt(elemento)){
                    sumaPe=sumaPe+ele;
                    elemPerfectos=elemPerfectos+" "+ele;
            }
            aux=0;
        }
        System.out.println("•••Elementos Perfectos Encontrados:("+elemPerfectos+" )");
        System.out.println("•••La suma de los Nros Perfectos encontrados son: "+sumaPe);
    }
    
}
