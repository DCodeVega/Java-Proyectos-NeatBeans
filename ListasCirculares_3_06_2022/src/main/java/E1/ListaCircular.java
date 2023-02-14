
package E1;

public class ListaCircular {
    public Nodo l;
    //Constructor
    public ListaCircular(){
        l=null;
    }
    
    public void adicionaInicio(int e){
        Nodo q= new Nodo();
        q.dato=e;
        if(l==null){
            q.sigte=q;
            l=q;
        }
        else
        {
            Nodo r=l;
            while(r.sigte!=l){
                r=r.sigte;
            }
            q.sigte=l;
            r.sigte=q;
            l=q;
        }            
    }
    public void adicionaFinal(int e){
        Nodo q=new Nodo();
        q.dato =e;
        if(l==null){
            q.sigte=q;
            l=q;
        }
        else{
            Nodo r=l;
            while(r.sigte!=l){
                r=r.sigte;
                r.sigte=q;
                q.sigte=l;
            }
        }       
    }
    public void adicionaAntes(int e, int x){
        if(l!=null){
            Nodo r=l;
            Nodo w=l;
            while(r.dato!=x && r.sigte!=l){
                w=r;
                r=r.sigte;
            }
            if(l==r){
                adicionaInicio(e);
            }
            else{
                Nodo q=new Nodo();
                q.dato=e;
                w.sigte=q;
                q.sigte=r;
            }
                
        }
    }
    public void adicionaDespues(int e, int x){
        if(l!=null){
            Nodo r=l;
            
            while(r.dato!=x && r.sigte!=l){
                
                r=r.sigte;
            }
            if(r.sigte==l){
                adicionaFinal(e);
            }
            else{
                Nodo q=new Nodo();
                q.dato=e;
                q.sigte=r.sigte;
                r.sigte=q;
            }
                
        }
    }
    String listar(){
        Nodo r=l;
        String s="";
        while(r.sigte!=l){
            s=s+""+r.sigte;
            r=r.sigte;
            
        }
        s=s+""+r.dato;
        return (s);
    }
    void elementoInicio(){
        if(l!=null){
            if(l.sigte==l){
                l=null;
            }
        }
        else{
            Nodo r=l;
            Nodo w=l;
            while(w.sigte!=l){
                w=w.sigte;
                l=l.sigte;
                w.sigte=l;
                r=null;
            }
        }
    }
}
