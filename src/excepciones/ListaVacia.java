package excepciones;

public class ListaVacia extends  Exception{
    /**
     *
     */

    private static final long serialVersionUID = 1l;

    public ListaVacia(){
        System.out.println("Error, La lista esta vacia");
    }
}
