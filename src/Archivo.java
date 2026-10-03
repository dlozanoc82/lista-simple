import Nodos.ListaSimple;
import Nodos.Nodo;

import javax.swing.*;
import java.io.*;

public class Archivo {
    private static final String NOMBRE_ARCHIVO = "datos.txt";

    public static void guardarLista(ListaSimple lista){
        try {
            FileWriter escritor = new FileWriter(NOMBRE_ARCHIVO);
            Nodo nodoActual = lista.getNodoInicial();
            while (nodoActual != null){
                escritor.write(nodoActual.getValor() + "\n");
                nodoActual = nodoActual.getNodoSiguiente();
            }
            escritor.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al Guardar los Datos");
        }
    }
    public static void cargarLista(ListaSimple lista){
        File archivo = new File(NOMBRE_ARCHIVO);
        if(!archivo.exists()){
            return;
        }
        try {
            FileReader lector = new FileReader(NOMBRE_ARCHIVO);
            BufferedReader lectorLineas = new BufferedReader(lector);
            String linea;
            while ((linea = lectorLineas.readLine()) != null){
                int valor = Integer.parseInt(linea);
                lista.insertarAlFinal(valor);
            }
            lectorLineas.close();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error al cargar datos");
        }
    }
}
