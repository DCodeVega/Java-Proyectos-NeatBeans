
package E2;

public class Trapecio {
//Atributo    
    int altura,bMayor,bMenor,lado;
    int area,perimetro;
//Metodos    
    public void calcularA(){
        area=(altura*bMayor*bMenor)/2;
        System.out.println("Área: "+area);
    }
    public void calcularP(){
        perimetro=bMenor+bMayor+lado+lado;
        System.out.println("Perimetro: "+perimetro);
    }
}
