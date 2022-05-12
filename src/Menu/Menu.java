package Menu;

import Ejercicios.Listener;

import java.util.Scanner;

public class Menu {
    public void queEjercicio () {
        Scanner teclado = new Scanner(System.in);
        int seleccion = 0;
        boolean ejecutado;
        int nV = 0;
            while (seleccion != 1 && seleccion != 2 && seleccion != 3) {
                menu();
                seleccion = teclado.nextInt();
                switch (seleccion) {
                    case 1:
                        ejecutado = false;
                        while (!ejecutado) {
                            System.out.println("¿Cuantas ventanas quiere ejecutar? (1-6)");
                            nV = teclado.nextInt();
                            if (nV < 1 || nV > 6) {
                                System.out.println("Introduzca un número entre 1 y 6");
                            } else {
                                ejecutado = true;
                            }
                        }
                        Listener listener = new Listener();
                        listener.listenV1(nV);
                        break;
                    case 2:
                        ejecutado = false;
                        while (!ejecutado) {
                            System.out.println("¿Cuantas ventanas quiere ejecutar? (1-6)");
                            nV = teclado.nextInt();
                            if (nV < 1 || nV > 6) {
                                System.out.println("Introduzca un número entre 1 y 6");
                            } else {
                                ejecutado = true;
                            }
                        }
                        Listener listener2 = new Listener();
                        listener2.listenV2(nV);
                        break;
                    case 3:
                        System.out.println("Saliendo . . .");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;

                }
            }

    }

    private static void menu() {
        System.out.println("\nSeleccione un ejercico:");
        System.out.println("1 - Ventana con mouseListener ");
        System.out.println("2 - Ventana con MouseAdapter ");
        System.out.println("3 - Salir ");
    }
}
