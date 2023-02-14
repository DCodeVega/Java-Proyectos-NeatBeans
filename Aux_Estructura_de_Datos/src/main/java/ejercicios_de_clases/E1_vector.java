package ejercicios_de_clases;
/**
 *
 * @author Diego Vega
 */
public class E1_vector {
    //vector = 5 8 0 9 1 0
    public void ejercicio_1(String vector[]){
        int tamaño_vector=vector.length-1;
        String primero=vector[0];
        String ultimo=vector[tamaño_vector];
        
        System.out.println("");
        System.out.println("primer elemento= "+primero);
        System.out.println("ultimo elemento= "+ultimo);
        
        vector[0]=ultimo;
        vector[tamaño_vector]=primero;
        
        System.out.println(" nuevo vector ");
        for(String elemento:vector){
            System.out.println(elemento+"");
        }
    }
    
    public void ejercicio_2(String vector[], String encontrarNombre){
        int posicion=0;
        for(String elementos:vector){
            if(elementos.equals(encontrarNombre)){
                System.out.println(encontrarNombre+" se encuentra en la casilla: "+posicion);
            }
            posicion++;
        }
    }
    
    public void ejercicio_3(String vector[]){
        int contador=0;
        for(String elemento:vector){
            if(elemento.equals("0")){
                contador++;
            }                
        }
        System.out.println("Existen: "+contador+" ceros");
    }
    
    public void ejercicio_4(String vector[]){
        int cont_pos=0, cont_neg=0, cont_cero=0;
        for(String elemento:vector){
            int numero= Integer.parseInt(elemento);
            if(numero<0){
                cont_neg++;
            }else{
                if(numero>0){
                    cont_pos++;
                }else{
                    cont_cero++;
                }
            }
            
        }
        System.out.println("Cantidad de Positivos: "+cont_pos+", Cantidad de Negativos: "+cont_neg+" y Cantidad de Neutros: "+cont_cero);
    }
}
