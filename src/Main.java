import Nodos.ListaSimple;

public class Main {
    public static void main(String[] args) {

        ListaSimple lista = new ListaSimple();
        int opcion;

        do{
           opcion = Operaciones.mostrarMenu();

           switch (opcion){
               case 1:
                   Operaciones.insertarAlInicio(lista);
                   break;
               case 2:
                   Operaciones.insertarAlFinal(lista);
                   break;
               case 3:
                   Operaciones.mostrarLista(lista);
                   break;
               case 4:
                   Operaciones.buscarElemento(lista);
                   break;
               case 5:
                   Operaciones.eliminarElemento(lista);
                   break;
               case 6:
                   Operaciones.salir();
                   break;
               default:
                   Operaciones.mostrarMensaje("Opcion no Valida");
           }


        }while (opcion != 6);

    }
}