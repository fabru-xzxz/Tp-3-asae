import java.util.ArrayList;
import java.util.Scanner;

public class BuscarTareas {

    public static void buscar(ArrayList<String> tareas, Scanner teclado) {

        System.out.print("Ingrese el nombre de la tarea que desea buscar: ");
        String nombreBuscado = teclado.nextLine();

        boolean encontrada = false;

        for (int i = 0; i < tareas.size(); i++) {

            if (tareas.get(i).equalsIgnoreCase(nombreBuscado)) {

                System.out.println("La tarea fue encontrada:");
                System.out.println(tareas.get(i));

                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontro la tarea.");
        }
    }
}
