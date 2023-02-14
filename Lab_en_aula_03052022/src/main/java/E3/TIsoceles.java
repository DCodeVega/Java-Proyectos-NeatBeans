
package E3;

public class TIsoceles extends Triangulo{
    public TIsoceles(int ladoa,int ladob){
        this.ladoa=ladoa;
        this.ladob=ladob;
    }
    public void cAreaI(){
        area=(ladob*Math.sqrt(Math.pow(ladoa, 2)-(Math.pow(ladob, 2))))/2;
        System.out.println("areaI: "+area);
    }
    public void cAPerimetro(){
        perimetro=2*ladoa+ladob;
        System.out.println("perimetro: "+perimetro);
    }
    public void CAltura(){
        
    }
}
