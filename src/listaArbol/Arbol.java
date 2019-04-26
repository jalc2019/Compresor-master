package listaArbol;

public class Arbol {
    private Nodo raiz;

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public Arbol(){
        raiz=null;
    }

    public Arbol(String s,Integer suma){
        raiz=new Nodo(s,suma);
    }

    public void AgregarHojas(Nodo izq,Nodo der){
        raiz.setIzq(izq);
        raiz.setDer(der);
    }
}
