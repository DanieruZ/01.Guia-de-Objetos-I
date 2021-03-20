package guia_01;

/****************************************************************
 *
 * 5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
 *    Tenga en cuenta el rango de valores aceptados para cada uno de estos.
 *      a. Hora: 0 … 23
 *      b. Minuto: 0 … 59
 *      c. Segundo: 0 … 59
 *    Considere el siguiente comportamiento:
 *      1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
 *         usando zero a la izquierda ejemplo 13:04:22 .
 *      2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
 *      3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
 *      4. Instanciar el objeto y probar los métodos creados.
 *
 ***************************************************************/

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    //public Hora() { }

    public Hora(int hora, int minuto, int segundo) {
        this.hora = (hora > (-1) && hora < 24) ? hora : 0;
        this.minuto = (minuto > (-1) && minuto < 60) ? minuto : 0;
        this.segundo = (segundo > (-1) && segundo < 60) ? segundo : 0;
    }

    public void avanzarHora() {
        if (this.hora == 23) {
            this.hora = 0;
        } else {
            this.hora++;
        }
    }

    public void avanzarMinuto() {
        if(this.minuto == 59) {
            this.minuto = 0;
            avanzarHora();
        }else {
            this.minuto++;
        }
    }

    public void avanzarSegundo() {
        if(this.segundo == 59) {
            this.segundo = 0;
            avanzarMinuto();
        }else {
            this.segundo++;
        }
    }

    public void retrocederHora() {
        if (this.hora == 0) {
            this.hora = 23;
        } else {
            this.hora--;
        }
    }

    public void retrocederMinuto() {
        if(this.minuto == 0) {
            this.minuto = 59;
            retrocederHora();
        }else {
            this.minuto--;
        }
    }

    public void retrocederSegundo() {
        if(this.segundo == 0) {
            this.segundo = 59;
            retrocederMinuto();
        }else {
            this.segundo--;
        }
    }

    public String horaActual() {
        String h = String.format("%02d", hora);
        String m = String.format("%02d", minuto);
        String s = String.format("%02d", segundo);
        return h + ":" + m + ":" + s;
    }
}
