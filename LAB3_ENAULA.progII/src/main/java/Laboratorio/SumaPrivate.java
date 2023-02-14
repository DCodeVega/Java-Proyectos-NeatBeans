
package Laboratorio;

public class SumaPrivate {
    private int n1,n2,s;
    private void sumar (){
        s=n1+n2;
        System.out.println("suma:"+s);
    }
    public void setN1(int n1){
        this.n1=n1;
    }
    public int getN1(){
        return n1;
    }
}
