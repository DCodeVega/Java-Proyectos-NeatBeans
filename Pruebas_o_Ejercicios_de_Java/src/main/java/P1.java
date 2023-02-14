public class P1 {

    public static void main(String[] args) {
        
        // utilizando Tipos de datos 
        // Char:
        char ch1,ch2;
        ch1=92;
        ch2=62;
        System.out.println("el char 1 es: '"+ch1+"' y el char 2 es: '"+ch2+"'");
        
        // Boolean:
        
        boolean a=true,b=false;
        System.out.println("a es: "+a+" y b es: "+b);
        
        //Usando comillas en Java con /" :
        System.out.println("primera Linea\nSegunda Linea");
        System.out.println("\"esto esta entre comillas\"");
        
        // Las variables se conocen asi: 
        int x;
        x=10;
        if (x==10) {
            int y=20;
            System.out.println("'x' y 'y' : "+x+" "+y);
            x=x*y;
        }
     // y=100; (Aqui no se conoce a Y)
        System.out.println("x es : "+x);
        
    }
    
}
