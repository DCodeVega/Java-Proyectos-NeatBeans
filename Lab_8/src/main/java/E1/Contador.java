
package E1;

public class Contador extends Trabajadores{
    public int dm=3,tr,descretraso;
    public int salarioF;

    public Contador(int tr, int dt, int pd) {
        super(dt, pd);
        this.tr = tr;
    }
     public void salarioLiquido(){
        sl=dt*pd;
        System.out.println("Salario Liquido Total: "+sl+" Bs");
    }
     
    public void DescuentoRetraso(){
        descretraso=dm*tr;
        System.out.println("Descuento Total: "+descretraso+" Bs");
    }
           
    public void SalarioFinal(){
        salarioF=sl-descretraso;
        System.out.println("Salario Final: "+salarioF+" Bs");
    }
}
