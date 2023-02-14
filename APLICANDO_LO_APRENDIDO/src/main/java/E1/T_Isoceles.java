
package E1;

public class T_Isoceles {
    
    // Atributos
    private int a,b;
    private double perimetro,area;
    
    // Operaciones/Metodo
    private void cPerimetro(){
        perimetro=(2*a)+b;
        System.out.println("Perimetro Calculado: "+perimetro);
    }
        
    private void cArea(){
        area=(b*Math.sqrt(Math.pow(a,2)-(Math.pow(b,2)/4)))/2;
        System.out.println("Area Calculado: "+area);
    }
    
    // LOS GETTERS Y SETTERS:

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
        
}
