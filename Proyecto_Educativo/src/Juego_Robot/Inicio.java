package Juego_Robot;
public class Inicio {
    
    private int numero,numadivino,respuesta;
    public int a,b,c,d,e;
    public String f,g,h,i,j;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumadivino() {
        return numadivino;
    }
    public void setNumadivino(int numadivino) {
        this.numadivino = numadivino;
    }
    public int getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
    
    protected void PruebaConElementos(){
        System.out.println("El a con el: "+f+" La b con la: "+g+
        "La c con la: "+h+" La d con la: "+i+" La e con la: "+j );
    }
}











