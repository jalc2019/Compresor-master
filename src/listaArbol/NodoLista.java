package listaArbol;

public class NodoLista {
    private Arbol arbol;
    private NodoLista Siguiente;

    public Arbol getArbol() {
        return arbol;
    }
    public void setArbol(Arbol arbol) {
        this.arbol = arbol;
    }
    public NodoLista getSiguiente() {
        return Siguiente;
    }
    public void setSiguiente(NodoLista siguiente) {
        Siguiente = siguiente;
    }

    public NodoLista(Arbol valor){
        this.setArbol(valor);
        this.setSiguiente(null);
    }
}
