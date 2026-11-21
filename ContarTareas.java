
import java.util.ArrayList;

public class ContarTareas {

    public static void contar(ArrayList<String> tareas) {

        int cantidad = tareas.size();

        System.out.println("===== CANTIDAD DE TAREAS =====");
        System.out.println("Actualmente hay " + cantidad + " tarea(s) guardada(s).");
    }
}
