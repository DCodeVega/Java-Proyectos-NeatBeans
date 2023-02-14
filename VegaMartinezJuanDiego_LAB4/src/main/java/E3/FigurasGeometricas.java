
package E3;

public class FigurasGeometricas {
    public int base,baseme,altura,lado,arista;
    public double area,perimetro;

    public FigurasGeometricas(int base, int baseme, int altura, int lado, int arista) {
        this.base = base;
        this.baseme = baseme;
        this.altura = altura;
        this.lado = lado;
        this.arista = arista;
    }

    public FigurasGeometricas(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public FigurasGeometricas(int base, int baseme, int altura, int lado) {
        this.base = base;
        this.baseme = baseme;
        this.altura = altura;
        this.lado = lado;
    }

    public FigurasGeometricas(int base, int altura, int lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public FigurasGeometricas(int arista) {
        this.arista = arista;
    }
    
    
    
}
