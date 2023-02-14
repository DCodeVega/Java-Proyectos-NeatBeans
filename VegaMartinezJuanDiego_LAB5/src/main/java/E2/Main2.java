package E2;
public class Main2 {
    public static void main(String[] args) {
        Ingenieros t1=new Ingenieros(120, 30, 10, 5);
        t1.cSalarioLdeIng();
        t1.cDescuentoxR();
        t1.sFinal();
        System.out.println("");
     
        Programador t2=new Programador(80, 30, 7, 3);
        t2.cSalarioLdeIng();
        t2.cDescuentoxR();
        t2.cDescuentoAFPrc();
        t2.cTotalDescuentoProg();
        t2.sFinalProg();
        System.out.println("");
        
        Analista t3=new Analista(90, 30, 8, 10);
        t3.cSalarioLdeIng();
        t3.cDescuentoxR();
        t3.DescAFP();
        t3.cTotalDescuentodeAnlta();
        t3.cBonoTe();
        t3.cbonoAntiguedad();
        t3.TotalBono();
        t3.SFinaldelAnlta();
        System.out.println("");
        
        AdministradorBD t4=new AdministradorBD(5, 110, 30, 15, 10);
        t4.cSalarioLdeIng();
        t4.cDescuentoxR();
        t4.cBonoAntgBD();
        t4.cBonoDE();
        t4.cBonoTotal();
        t4.sFinaldeAdminBD();
    } 
}
