package guia_01;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
 *    y balance. Considere los getters, setters y constructores necesarios. Tenga en
 *    cuenta los siguientes métodos.
 *      a. El método crédito que representa un depósito de dinero en la cuenta. Este
 *         método debe devolver el balance luego de la operación.
 *      b. El método débito que representa una sustracción de dinero de la cuenta.
 *         Este método debe devolver el balance luego de la operación. Si el dinero en
 *         la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
 *         pantalla un aviso.
 *      c. Un método que imprima por pantalla las características del objeto.
 *
 *    Realice las siguientes operaciones:
 *      1. Inicialice una cuenta con un monto inicial de 15000.
 *      2. Realice una operación de crédito de 2500.
 *      3. Realice una operación de compra de 1500.
 *      4. Realice una operación de compra de 30000.
 *      5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
 *         correcto
 *
 ***************************************************************/

public class Cuenta {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    private int id;
    private String nombre;
    private double balance;

    public Cuenta() { }

    public Cuenta(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito(double dinero) {
        this.balance = this.balance + dinero;
        return this.balance;
    }

    public double debito(double dinero) {
        boolean estado = this.balance >= dinero;
        if(estado) this.balance = this.balance - dinero;
        if(!estado) show.println("\nFondo insuficiente para realizar la compra");
        return this.balance;
    }

    public String mostrarCuenta() {
        return  "\nCuenta." +
                "\nid:.........." + this.id +
                "\nNombre......." + this.nombre +
                "\nBalance:....." + this.balance;
    }
}
