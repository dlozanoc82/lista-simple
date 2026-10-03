package Nodos;

public class ListaSimple {
    private Nodo nodoInicial;

    public ListaSimple(){
        nodoInicial = null;
    }

    //INSERTAR AL INICIO
    public void insertarAlInicio(int valor){
        Nodo nodoNuevo = new Nodo(valor);
        nodoNuevo.setNodoSiguiente(nodoInicial);
        nodoInicial = nodoNuevo;
    }

    //INSERTAR AL FINAL
    public void insertarAlFinal(int valor){
        Nodo nodoNuevo = new Nodo(valor);

        if (nodoInicial == null){
            nodoInicial = nodoNuevo;
            return;
        }

        Nodo nodoActual = nodoInicial;

        while (nodoActual.getNodoSiguiente() != null) {
            nodoActual = nodoActual.getNodoSiguiente();
        }

        nodoActual.setNodoSiguiente(nodoNuevo);
    }

    public String mostrarLista(){
        if(nodoInicial == null){
            return "La lista esta vacia";
        }

        String lista = "";
        Nodo nodoActual = nodoInicial;

        while(nodoActual != null){
            lista += nodoActual.getValor() + " -> ";
            nodoActual = nodoActual.getNodoSiguiente();
        }

        return lista += "null";
    }

    public boolean buscarValor(int valor){
        Nodo nodoActual = nodoInicial;
        while (nodoActual != null){
            if (nodoActual.getValor() == valor){
                return true;
            }
            nodoActual = nodoActual.getNodoSiguiente();
        }
        return false;
    }

    public boolean eliminarValor(int valor){
        if(nodoInicial == null){
            return false;
        }

        if(nodoInicial.getValor() == valor){
            nodoInicial = nodoInicial.getNodoSiguiente();
            return true;
        }

        Nodo nodoActual = nodoInicial;

        while (nodoActual.getNodoSiguiente() != null){
            Nodo nodoSiguiente = nodoActual.getNodoSiguiente();
            if (nodoSiguiente.getValor() == valor){
                nodoActual.setNodoSiguiente(nodoSiguiente.getNodoSiguiente());
                return true;
            }
            nodoActual = nodoSiguiente;
        }
        return false;
    }

    public Nodo getNodoInicial() {
        return nodoInicial;
    }
}
