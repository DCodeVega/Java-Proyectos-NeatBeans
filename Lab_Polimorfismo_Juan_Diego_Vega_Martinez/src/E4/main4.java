package E4;
public class main4 {

    public static void main(String[] args) {
        Trabajador t1=new DescuentoAFP(0, 0);
        t1.setHt(250);
        t1.setAntg(6);
        t1.calcularLiquido();
        t1.BonoAntg();
        t1.descRiesgoC();
        t1.descAFP();
        t1.LiquidoPagable();
        System.out.println("*************************************************");
        
        Trabajador t2=new DeescuentoSolidario(0, 0, 0);
        t2.setDt(25);
        t2.setPd(60);
        t2.setAntg(16);
        t2.calcularLiquido();
        t2.BonoAntg();
        t2.descRiesgoC();
        t2.descAFP();
        t2.descSolidario();
        t2.LiquidoPagable();
        System.out.println("*************************************************");
        
        Trabajador t3=new DescuentoRetraso(0, 0, 0);
        t3.setDt(21);
        t3.setPd(65);
        t3.setDescxretraso(20);
        t3.calcularLiquido();
        t3.descRetraso();
        t3.LiquidoPagable();
        System.out.println("*************************************************");
    }
}
