package E7;
public class main7 {
    public static void main(String[] args) {
        Triangulo o1=new Triangulo(0,0,0);
        o1.Mensaje();
        
        TRectangulo t1=new TRectangulo(5, 4, 3);       
        t1.calcularPerimetroR();
        t1.calcularAreaR();
        t1.calcularAlturaR();
        
        TIsosceles t2=new TIsosceles(8, 3);
        t2.calcularPerimetroI();
        t2.calcularAreaI();
        t2.calcularAlturaI();
        
        TEquilatero t3=new TEquilatero(7);
        t3.calcularPerimetroE();
        t3.calcularAreaE();
        t3.calcularAlturaE();
        //Pruebas con el Java Scanner:     
        TRectangulo t4=new TRectangulo(0, 0, 0);
        t4.leerTR();
        t4.calcularPerimetroR();
        t4.calcularAreaR();
        t4.calcularAlturaR();
        
        TIsosceles t5=new TIsosceles(0, 0);
        t5.leerTI();
        t5.calcularPerimetroI();
        t5.calcularAreaI();
        t5.calcularAlturaI();
        
        TEquilatero t6=new TEquilatero(0);
        t6.leerTE();
        t6.calcularPerimetroE();
        t6.calcularAreaE();
        t6.calcularAlturaE();
    }  
}
