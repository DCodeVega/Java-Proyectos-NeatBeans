
package E3;

public class Trabajador {
    private String nombre;
    private int sl;
    private double acp,arc,aafp,as,sf;
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario Liquido: "+sl+" Bs");
        System.out.println("Aportes Labortales: ");
    }
    public void dACP(){
        acp=sl*0.1;       
        System.out.println("ACP: "+acp+" Bs");
    }
    public void dARC(){
        arc=sl*0.0171;
        System.out.println("ARC: "+arc+" Bs");
    }
    public void dAAFP(){
        aafp=sl*0.005;
        System.out.println("AAFP: "+aafp+" Bs");
    }
    public void dAS(){
        as=sl*0.005;
        System.out.println("AS: "+as+" Bs");
    }
    public void cSF(){
        sf=sl-(sl*0.1)-(sl*0.0171)-(sl*0.005)-(sl*0.005);
        System.out.println("Salario Final: "+sf+" Bs");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
}
