package udla.aquishpe.listaArreglos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {
    public static void main(String[] args) {

        // Creación del ArrayList
        List<String> listaColores = new ArrayList<>();

        // Creación de un array
        String[] nombres = {"Pedro", "Pablo", "Juan", "Bartolo", "Jacinto"}; //Array

        // Pasando un array a una lista
        List<String> listaNombres = Arrays.asList(nombres);  // lista

        // Instanciación de la clase Colores
        Colores colores = new Colores();

        // Llamada al método leerColor para ingresar colores
        colores.leerColor(listaColores);

        // Construir lista a partir de otra lista
        List<String> elementos = new ArrayList<>(listaColores);  // elemtos del array hecho lista

        // Adición de elementos de otra colección
        elementos.addAll(listaNombres);                  // Lista de nombres y elementos en una sola lista

        // Impresión de las listas
        System.out.println("Lista de nombres ");
        listaNombres.forEach(System.out::println);  // For each va iterando todos los elementos de el arreglo
        System.out.println("---------------------------");

        System.out.println("Lista de Colores ");
        listaColores.forEach(System.out::println);
        System.out.println("--------------------------- ");

        System.out.println("Lista de Elementos ");
        elementos.forEach(System.out::println);

        System.out.println("****************************************** ");

        System.out.println("Recorrido Iterador");
        //Iteracion de arrayList
        ListIterator<String> iterator = listaColores.listIterator();
        System.out.println("\n\n");
        while (iterator.hasNext()) {
            System.out.println("Color: " + iterator.next());
        }

        System.out.println("****************************************** ");
        System.out.println("Recorrido Iterador  alrevez");
        System.out.println("\n\n");
        while (iterator.hasPrevious()) {
            System.out.println("Color: " + iterator.previous());
        }

    }
}
