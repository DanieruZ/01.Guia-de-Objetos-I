package guia_01;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
 *    1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
 *    debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
 *    siguientes pruebas:
 *      a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
 *      b. Imprimir por pantalla el alto y ancho.
 *      c. Imprimir por pantalla el área y perímetro.
 *      d. Modificar el alto y el ancho de la instancia.
 *      e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
 *      f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
 *
 ***************************************************************/

public class Rectangulo {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    private double ancho = 1.0;
    private double alto = 1.0;

    public Rectangulo() { }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}
