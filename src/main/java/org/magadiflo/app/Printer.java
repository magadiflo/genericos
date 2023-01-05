package org.magadiflo.app;

/**
 * T, representa el tipo de dato, podría haber usado cualquier otra letra o palabra, pero
 * por convención se suele usar esa letra para representar el tipo de dato.
 *
 * NOTA: Los genéricos no funcionan con tipo de datos primitivos, solo con clases, es por
 * eso que cuando imprimimos enteros utilizamos las clases wrapper Integer, lo mismo para
 * las otros tipos.
 *
 * T extends Animal, con eso decimos que T representa un tipo de dato, pero que ese tipo de dato
 * debe extender de Animal. Es decir, ahora nuestra clase genérica Printer, no acepta cualquier
 * tipo de dato T, sino a aquellos tipos T que hereden de Animal, tal como es el caso de Cat y Dog.
 */
public class Printer<T extends Animal> {

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        this.thingToPrint.eat(); // Como nuestro tipo T hereda de Animal, podemos usar el método eat() de esa clase padre
        System.out.println(this.thingToPrint);
    }
}
