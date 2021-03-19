package guia_01;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int selected;

        do {
            selected = menu();
            switch(selected) {
                case 1:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 01.   |");
                    show.println("  -------------------");
                    show.println("\n");

                    Rectangulo rectangulo = new Rectangulo(30,15);

                    show.println("La base del rectangulo es: " + rectangulo.getAncho());
                    show.println("La altura del rectangulo es: " + rectangulo.getAlto());

                    show.println("\nEl area del rectangulo es: " + rectangulo.calcularArea());
                    show.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());

                    rectangulo.setAncho(40);
                    rectangulo.setAlto(25);

                    show.println("\nLa base del rectangulo es: " + rectangulo.getAncho());
                    show.println("La altura del rectangulo es: " + rectangulo.getAlto());

                    show.println("\nEl area del rectangulo es: " + rectangulo.calcularArea());
                    show.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());

                    Rectangulo rectanguloDefault = new Rectangulo();

                    show.println("\nEl valor predeterminado de la base es: " + rectanguloDefault.getAncho());
                    show.println("El valor predeterminado de la altura es: " + rectanguloDefault.getAlto());

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 2:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 02.   |");
                    show.println("  -------------------");
                    show.println("\n");

                    Empleado empleado1 = new Empleado();
                    empleado1.setNombre("Carlos");
                    empleado1.setApellido("Gutierrez");
                    empleado1.setDni(23456345);
                    empleado1.setSalario(25000);

                    Empleado empleado2 = new Empleado();
                    empleado2.setNombre("Ana");
                    empleado2.setApellido("Sanchez");
                    empleado2.setDni(3423412);
                    empleado2.setSalario(27500);

                    show.println("Empleado 1: " + empleado1.mostrarEmpleado());
                    show.println("\nEmpleado 2: " + empleado2.mostrarEmpleado());

                    empleado1.aumentarSalario(15);
                    show.println("\nEmpleado: " + empleado1.getNombre() + " " + empleado1.getApellido());
                    show.println("Salario Anual: " + empleado1.calcularSalarioAnual());

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 3:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 03.   |");
                    show.println("  -------------------");
                    show.println("\n");

                    ItemVenta itemVenta = new ItemVenta(1, "Remeras talle XL", 87, 120.50);
                    show.println(itemVenta.mostrarItemVenta());

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 4:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 04.   |");
                    show.println("  -------------------");
                    show.println("\n");

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 5:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 05.   |");
                    show.println("  -------------------");
                    show.println("\n");

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 0:
                    show.println("Programa finalizado.");
                    break;
                default:
                    limpiarPantalla();
                    limpiarPantalla();
                    limpiarPantalla();
                    show.println("¡¡¡Ejercicio incorrecto.!!!");
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
            }
        }while(selected !=0);
    }


    public static int menu() {
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t    GUIA 01: OBJETOS I.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t    MENU");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t   [1].Ejercicio 01.");
        show.println("\t   [2].Ejercicio 02.");
        show.println("\t   [3].Ejercicio 03.");
        show.println("\t   [4].Ejercicio 04.");
        show.println("\t   [5].Ejercicio 05.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t   [0].Salir del programa.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n\n\t  Elija una opcion: ");
        show.println("\n");
        int input = scan.nextInt();
        return input;
    }

    public static void limpiarPantalla() {
        for(int i=0;i<10;i++) {
            show.println("\n");
        }
    }

    public static class Pausa {
        public static void pausar() {
            show.println("\n");
            show.println(" ----------------------------------------");
            show.println("|Presionar la tecla ENTER para continuar.|");
            show.println(" ----------------------------------------");
            Scanner aceptar = new Scanner(System.in);
            show.println("\n");
            aceptar.nextLine();
        }
    }
}

