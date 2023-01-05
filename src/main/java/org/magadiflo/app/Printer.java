package org.magadiflo.app;

/**
 * T, representa el tipo de dato, podría haber usado cualquier otra letra o palabra, pero
 * por convención se suele usar esa letra para representar el tipo de dato.
 *
 * NOTA: Los genéricos no funcionan con tipo de datos primitivos, solo con clases, es por
 * eso que cuando imprimimos enteros usamos las clases wrapper Integer, Double, String, etc..
 */
public class Printer<T> {

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(this.thingToPrint);
    }
}
