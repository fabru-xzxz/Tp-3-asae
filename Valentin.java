import java.util.Scanner;

public class Valentin {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        System.out.println("================================");
        System.out.println(" SISTEMA DE CONTROL DE KIOSCO");
        System.out.println("================================");

        System.out.println("Proyecto desarrollado en Java");
        System.out.println("Integrante: Valentin");
        System.out.println("Objetivo: Controlar el stock de un kiosco");

        do {

            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Registrar productos");
            System.out.println("2. Consultar productos");
            System.out.println("3. Buscar productos");
            System.out.println("4. Modificar precios");
            System.out.println("5. Consultar stock");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Funcion para registrar productos.");
                    break;

                case 2:
                    System.out.println("Funcion para consultar productos.");
                    break;

                case 3:
                    System.out.println("Funcion para buscar productos.");
                    break;

                case 4:
                    System.out.println("Funcion para modificar precios.");
                    break;

                case 5:
                    System.out.println("Funcion para consultar stock.");
                    break;

                case 6:
                    System.out.println("Gracias por utilizar el sistema.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 6);

        teclado.close();
    }
}
