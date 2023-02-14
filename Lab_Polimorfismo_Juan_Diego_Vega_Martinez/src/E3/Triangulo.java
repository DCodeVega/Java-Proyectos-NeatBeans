package E3;
public class Triangulo {
    public double n1,n2,n3,altura;

    public Triangulo(int n1, int n2,int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
        
    public void calcularAltura(int n1,int n2,int n3){
        altura=(n1*n2)/n3;
        System.out.println("La Altura 1 es: "+altura);
    }   
    public void calcularAltura(int n1,int n2){
        altura=Math.sqrt(Math.pow(n1, 2)-(Math.pow(n2, 2)/4));
        System.out.println("La Altura 2 es: "+altura);
    }
    public void calcularAltura(int n1){
        altura=(Math.sqrt(3*n1))/2;
        System.out.println("La Altura 3 es: "+altura);
    }
}
