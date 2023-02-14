package E2;
public class AdministradorBD extends Ingenieros{
    private double DiasExtras,bonoAntgBD,tbono,bonoDiasExtras;

    public AdministradorBD(double DiasExtras, int pd, int dt, double descxmin, double descxretraso) {
        super(pd, dt, descxmin, descxretraso);
        this.DiasExtras = DiasExtras;
    }
    public void cBonoAntgBD(){
        bonoAntgBD=getSl()*0.15;
        System.out.println("bono de Antiguedad: "+bonoAntgBD+" Bs");
    }
    public void cBonoDE(){
        bonoDiasExtras=getSl()*DiasExtras*0.10;
        System.out.println("Bono de Dias Extras: "+bonoDiasExtras+" Bs");
    }
    public void cBonoTotal(){
        tbono=bonoAntgBD+bonoDiasExtras;
        System.out.println("Total Bonos: "+tbono+" Bs");
    }
    public void sFinaldeAdminBD(){
        setSf((getSl()+getTdesc())+tbono-getDescxretraso());
        System.out.println("El Salario Final del Administrador de Base de Datos es: "+getSf()+" Bs");
    }      
}
