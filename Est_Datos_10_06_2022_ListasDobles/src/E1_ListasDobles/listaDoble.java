
package E1_ListasDobles;

public class listaDoble {
     public NodoLD l;

    public listaDoble() {
        l = null;
    }

    void AdicionaInicio(int e) {
        NodoLD q = new NodoLD();
        q.dato = e;
        if (l == null) {
            q.sigte = null;
            q.ant = null;
            l = q;
        } else {
            q.sigte = l;
            l.ant = q;
            q.ant = null;
            l = q;
        }
    }

    void adicionaFinal(int e) {
        NodoLD q = new NodoLD();
        q.dato = e;
        if (l == null) {
            q.sigte = null;
            q.ant = null;
        }//verdad
        else {
            NodoLD r = l;
            while (r.sigte != null) {
                r = r.sigte;
            }//while
            r.sigte = q;
            q.ant = r;
            q.sigte = null;
        }//falso
    }

    void adicionaAntes(int e, int x) {
        if (l != null) {
            NodoLD r = l;
            while (r != null && r.dato != x) {
                r = r.sigte;
            }
            if (r != null) {
                if (r == l) {
                    AdicionaInicio(e);
                } else {
                    NodoLD q = new NodoLD();
                    q.dato = e;
                    q.ant = r.ant;
                    r.ant.sigte = q;
                    q.sigte = r;
                    r.ant = q;
                }
            }

        } else {

        }
    }

    void adicionaDespues(int e, int x) {
        if (l != null) {
            NodoLD r = l;
            while (r != null && r.dato != x) {
                r = r.sigte;
            }
            if (r != null) {
                if (r.sigte == null) {
                    adicionaFinal(e);
                } else {
                    NodoLD q = new NodoLD();
                    q.dato = e;
                    q.sigte = r.sigte;
                    r.sigte.ant = q;
                    q.ant = r;
                    r.sigte = q;
                }
            }

        }
    }
    String Listar(){
        String s="";
        NodoLD r=l;
        while(r!=null){
            s=s+"  "+r.dato;
            r=r.sigte;
        }
        return (s);
    }
    void EliminaInicio(){       
        if(l!=null){
            if(l.sigte==null && l.ant==null){
                l=null;
            }
            else{
                NodoLD r=l;
                l=l.sigte;
                l.ant=null;
                r=null;
            }
        }
    }
    void EliminaFinal(){
        if (l!=null){
            if(l.sigte==null && l.ant==null){
                l=null;
            }
            else{
                NodoLD r=l;
                while (r.sigte!=null){
                r=r.sigte;
                r.ant.sigte=null;
                }
            }
        }
    }
    void EliminaX(int x){
        if(l!=null){
            if(l.ant==l.sigte && l.dato==x){
                l=null;
            }
            else{
                NodoLD r=l;
                while (r!=null && r.dato!=x){
                    r=r.sigte;
                    if(r!=null){
                        if(r==l){
                            EliminaInicio();
                        }
                        else{
                            if(r.sigte==null){
                                EliminaFinal();
                            }
                            else{
                                r.ant.sigte=r.sigte;
                                r.sigte.ant=r.ant;
                                r=null;
                            }
                        }
                    }
                }
            }
            
        }
    }
}
