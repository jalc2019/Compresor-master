package excepciones;

public class FueraDeRango extends Exception {

    /**
     *
     */

    private static final long serialVersionUID = 1l;

    public FueraDeRango(){
        System.out.println("Fuera de Rango. Verifique la posicion");
    }
}
