package org.magadiflo.app;

import java.io.Serializable;

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
 *
 * T extends Serializable, podríamos pensar que como Serializable es una interfaz, "en vez de extends
 * deberíamos usar un implements", pero en este caso en particular de un genérico eso no aplica. Es decir,
 * aquí siempre se usa extends tanto para indicar que extiende de alguna clase concreta o para indicarle
 * que extiende de una interfaz.
 *
 * Cuando hacemos este tipo de cosas, por ejemplo: <T extends Animal> o <T implements Serializable>,
 * a este tipo de genéricos se les llama Genéricos Limitados, porque precisamente estamos limitando el
 * tipo de genérico, es decir, el tipo de genérico será aquel que herede de Animal o implemente la
 * interfaz Serializable.
 *
 * Se pueden tener múltiples límites, estos deben estar separados por un ampersand (&), como en el
 * siguiente ejemplo: <T extends Animal & Serializable>, decimos que el tipo T debe heredar de
 * Animal y además debe implementar la interfaz Serializable.
 * Importante, como java no soporta herencia múltiple, si vamos a agregar una clase, seguida de
 * interfaces, es importante que la clase vaya primero, luego las interfaces, caso contrario
 * arrojará un error.
 */
public class Printer<T extends Animal & Serializable> {

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        this.thingToPrint.eat(); // Como nuestro tipo T hereda de Animal, podemos usar el método eat() de esa clase padre
        System.out.println(this.thingToPrint);
    }
}
