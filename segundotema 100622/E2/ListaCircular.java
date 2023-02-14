
package E2;

public class ListaCircular {
    NodoLD l;
    public ListaCircular(){
        l=null;
    }
    
    void AdicionaInicio(int e){
        NodoLD q=new NodoLD();
        q.dato=e;
        if(l==null){
            q.sigte=q;
            q.ant=q;
            l=q;
        }
        else{
            NodoLD r=l.ant;
            q.sigte=l;
            l.ant=q;
            l=q;
            r.sigte=l;
            l.ant=r;
        }
    }
    void AdicionaFinal(int e){
        NodoLD q=new NodoLD();
        q.dato=e;
        if(l==null){
            q.sigte=q;
            q.ant=q;
            l=q;
        }
        else{
            NodoLD r=l.ant;
            r.sigte=q;
            q.ant=r;
            q.sigte=l;
            l.ant=q;
        }
        
    }
}
