
import java.util.ArrayList;

public class MostrarTareas {

    public static void mostrar(ArrayList<String> tareas) {

        System.out.println("\n===== LISTA DE TAREAS =====");

        if (tareas.isEmpty()) {

            System.out.println("Todavia no hay tareas agregadas.");

        } else {

            for (int i = 0; i < tareas.size(); i++) {

                System.out.println((i + 1) + ". " + tareas.get(i));

            }

        }

        System.out.println("===========================");
    }
}
