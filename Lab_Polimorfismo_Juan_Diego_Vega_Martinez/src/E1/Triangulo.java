package E1;
public class Triangulo {
    public double n1,n2,area;

    public Triangulo(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }        
    public void calcularArea(){
        area=(n2*n1)/2;
        System.out.println("El Area 1 es: "+area);
    }   
    public void calcularArea(int n1,int n2){
        area=(n2*(Math.sqrt(Math.pow(n1, 2)-(n2/4))))/2;
        System.out.println("El Area 2 es: "+area);
    }
    public void calcularArea(int n1){
        area=(Math.sqrt(3)/4)*Math.pow(n1, 2);
        System.out.println("El Area 3 es: "+area);
    }
}

