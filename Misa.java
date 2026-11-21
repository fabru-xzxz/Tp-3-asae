import java.util.ArrayList;
import java.util.Scanner;

public class Misa {

    public static void agregar(ArrayList<String> tareas, Scanner scanner) {
        System.out.println("===== AGREGAR TAREA =====");
        System.out.print("Ingrese la nueva tarea: ");
        String nuevaTarea = scanner.nextLine().trim();

        if (nuevaTarea.isEmpty()) {
            System.out.println("No se puede agregar una tarea vacía.");
            return;
        }

        tareas.add(nuevaTarea);
        System.out.println("Tarea agregada correctamente.");
    }
}
