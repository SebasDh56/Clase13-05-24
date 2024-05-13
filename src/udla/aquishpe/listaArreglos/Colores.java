package udla.aquishpe.listaArreglos;

import java.util.List; // Se agrega la importación de la clase List
import java.util.Scanner;

public class Colores {

    public void leerColor(List<String> listaColores) {
        Scanner scanner = new Scanner(System.in);
        String color;
        do {
            System.out.print("Ingrese un color (0 para terminar): ");
            color = scanner.nextLine();

        } while (!color.equalsIgnoreCase("0"));
        scanner.close(); // Cerrar el scanner al finalizar la lectura
    }

}
