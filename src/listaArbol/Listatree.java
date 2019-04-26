package listaArbol;

import excepciones.FueraDeRango;
import excepciones.ListaVacia;
import ListaChar.Lista;
import tabla.ListaTabla;

public class Listatree {
    private NodoLista inicio;
    public NodoLista getInicio() {
        return inicio;
    }
    public void setInicio(NodoLista inicio) {
        this.inicio = inicio;
    }

    public Listatree(){
        inicio=null;
    }
    public void agregarOrdenados(Arbol arbol){
        NodoLista nuevo=new NodoLista(arbol);
        if(inicio == null)
            inicio=nuevo;
        else{
            NodoLista aux=inicio;
            NodoLista aux2=null;
            while(aux != null && (aux.getArbol().getRaiz().getFrecuencia()<nuevo.getArbol().getRaiz().getFrecuencia())){
                aux2=aux;
                aux=aux.getSiguiente();
            }
            if(aux2==null){
                nuevo.setSiguiente(inicio);
                inicio=nuevo;
            }
            else
            if(aux==null)
                aux2.setSiguiente(nuevo);
            else{
                aux2.setSiguiente(nuevo);
                nuevo.setSiguiente(aux);
            }
        }
    }

    public void toLista(Lista l) throws ListaVacia, FueraDeRango{
        if(l.getInicio()==null)
            throw new ListaVacia();
        else{
            String caracter="";
            Integer frecuencia=0;
            while(l.getInicio()!=null){
                caracter=l.getInicio().getDato()+"";
                frecuencia=l.contarIguales(l.getInicio().getDato());
                this.agregarOrdenados(new Arbol(caracter,frecuencia));
                frecuencia=0;
                caracter="";
            }
        }
    }

    public void imprimir(){
        if(inicio==null)
            System.out.println("Null");
        else{
            NodoLista aux=inicio;
            System.out.print("Inicio --> ");
            while(aux!=null){
                System.out.print(aux.getArbol().getRaiz().getDato()+" : "+aux.getArbol().getRaiz().getFrecuencia()+"  -> ");
                aux=aux.getSiguiente();
            }
            System.out.print(" Null\n");
        }
    }

    public Nodo sacarInicio() throws ListaVacia{
        if(this.inicio==null)
            throw new ListaVacia();
        NodoLista aux=inicio;
        inicio=aux.getSiguiente();
        aux.setSiguiente(null);
        return aux.getArbol().getRaiz();
    }

    public void obtenerArbol() throws ListaVacia{
        Nodo uno=null;
        Nodo dos=null;
        while(this.inicio.getSiguiente()!=null){
            uno=this.sacarInicio();
            dos=this.sacarInicio();
            Arbol nuevo=new Arbol(null,uno.getFrecuencia()+dos.getFrecuencia());
            nuevo.AgregarHojas(uno, dos);
            this.agregarOrdenados(nuevo);
        }
        System.out.println("Arbol creado.");
    }

    public ListaTabla obtenerHojas(String ubicacion,ListaTabla tabla,Nodo raiz){
        if(raiz.getDato()==null){
            tabla=obtenerHojas(ubicacion+"0",tabla,raiz.getIzq());
            tabla=obtenerHojas(ubicacion+"1",tabla,raiz.getDer());
        }
        else
            tabla.agregar(raiz.getDato(), ubicacion);
        return tabla;
    }
}
