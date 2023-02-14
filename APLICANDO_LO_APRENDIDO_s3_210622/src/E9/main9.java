package E9;
public class main9 {
    public static void main(String[] args) {
        Programador t1=new Programador("Alberto", "456321 LP", 30, 50, 20);
    
        System.out.println("----------------------------");
        t1.IdentificacionProg();
        t1.calcularSLProg();
        t1.calcularDescuentoProg();
        t1.calcularSFProg();
        
        Analista t2=new Analista("Sebastian", "123654 CBBA", 25, 65, 15);
        
        System.out.println("----------------------------");
        t2.IdentificacionAnl();
        t2.calcularSLAnl();
        t2.calcularDescuentoAnl();
        t2.calcularBonoAnl();
        t2.calcularSFAnl();
        
        Adminnistrador_de_datos t3=new Adminnistrador_de_datos("Jose ", "789123 SC", 30, 70, 10, 4);
        
        System.out.println("----------------------------");
        t3.IdentificacionDBA();
        t3.calcularSLDBA();
        t3.calcularDescuentoDBA();
        t3.calcularBonoDBA();
        t3.calcularSFDBA();
        
        Adminnistrador_de_datos t4=new Adminnistrador_de_datos("", "", 0, 0, 0, 0);
        
        System.out.println("----------------------------");
        t4.leer();
        t4.IdentificacionDBA();
        t4.calcularSLDBA();
        t4.calcularDescuentoDBA();
        t4.calcularBonoDBA();
        t4.calcularSFDBA();
    }
}
