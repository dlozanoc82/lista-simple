import Nodos.ListaSimple;

import javax.swing.*;

public class Operaciones {

    //MOSTRAR MENU
    public static int mostrarMenu() {
        String menu =
                "1. Insertar al Inicio\n" +
                "2. Insertar al Final\n" +
                "3. Mostrar Lista\n" +
                "4. Buscar Elemento\n" +
                "5. Eliminar Elemento\n" +
                "6. Salir";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    //PEDIR DATOS
    public static int pedirValor(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    //MOSTRAR MENSAJE
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    //SALIR
    public static void salir(){
        mostrarMensaje("Saliendo de la App...");
    }

    //INSERTAR AL INICIO
    public static void insertarAlInicio(ListaSimple lista){
        int valor = pedirValor("Valor a insertar al Inicio");
        lista.insertarAlInicio(valor);
        mostrarMensaje("Valor insertado correctamente!!!");
    }

    //INSERTAR AL FINAL
    public static void insertarAlFinal(ListaSimple lista){
        int valor = pedirValor("Valor a insertar al Final: ");
        lista.insertarAlFinal(valor);
        mostrarMensaje("Valor insertado al final !");
    }

    //MOSTRAR LISTA
    public static void mostrarLista(ListaSimple lista){
        mostrarMensaje(lista.mostrarLista());
    }

    //BUSCAR UN ELEMENTO
    public static void buscarElemento(ListaSimple lista){
        int valor = pedirValor("Ingrese el valor a Buscar: ");
        boolean encontrado = lista.buscarValor(valor);

        if (encontrado){
            mostrarMensaje("Valor encontrado: " + valor);
        }else{
            mostrarMensaje("Valor NO encontrado");
        }
    }

    //ELIMINAR UN ELEMENTO
    public static void eliminarElemento(ListaSimple lista){
        int valor = pedirValor("Ingrese el valor a Buscar: ");
        boolean eliminado = lista.eliminarValor(valor);

        if (eliminado){
            mostrarMensaje("Valor eliminado correctamente");
        }else{
            mostrarMensaje("Valor NO encontrado");
        }
    }








}
