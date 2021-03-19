package guia_01;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
 *    descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
 *    total teniendo en cuenta el precio unitario y cantidad. Un método que permita
 *    imprimir por pantalla los atributos del objeto de la siguiente forma:
 *       ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
 *       a. Inicialice el objeto con los atributos necesarios
 *       b. Imprima por pantalla el objeto inicializado.
 *
 ***************************************************************/

public class ItemVenta {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    private int id;
    private  String descripcion;
    private int cantidad;
    private double precioUnitario;
    private  double precioTotal;

    public ItemVenta() { }

    public ItemVenta(int id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioUnitario * cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    /*public double calcularPrecioTotal() {
        return precioUnitario * cantidad;
    }*/

    public String mostrarItemVenta() {
        return  "ItemVenta. " +
                "\nid:..............." + this.id +
                "\ndescripcion:......" + this.descripcion +
                "\ncantidad.........." + this.cantidad +
                "\nprecioUnitario:..." + this.precioUnitario +
                "\nprecioTotal:......" + this.precioTotal;
    }
}
