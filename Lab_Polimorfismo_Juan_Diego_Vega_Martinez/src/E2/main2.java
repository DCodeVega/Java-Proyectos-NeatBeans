package E2;
public class main2 {
    public static void main(String[] args) {
        Triangulos t1=new TRectangulo(10,5,12);  
        t1.Perimetro();
        t1.Area();
        t1.Altura();
        
        Triangulos t2=new TIsosceles(8,3);     
        t2.Perimetro();
        t2.Area();
        t2.Altura();
        
        Triangulos t3=new TEquilatero(5);    
        t3.Area();
        t3.Altura();
    }  
}
