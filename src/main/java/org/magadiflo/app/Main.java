package org.magadiflo.app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Printer<Cat> integerPrinter = new Printer<>(new Cat("Pelusa"));
        integerPrinter.print();

        Printer<Dog> doublePrinter = new Printer<>(new Dog());
        doublePrinter.print();

        shout("Martín", 74);

        String nombre = shoutConRetorno("Gaspar", 74);
        System.out.println("Nombre retornado: " + nombre);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        printList(stringList);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        printList(cats);
    }

    /**
     * Método genérico
     * ****************
     * Antes de tipo de dato de retorno, en el caso de este método es un void,
     * le colocamos el <T>, con eso le decimos a Java que este método es un genérico, y
     * que como parámetro le estamos pasando ese tipo T.
     *
     * <T, V>, java soporta múltiples tipos de genéricos, ya sea para métodos o clases.
     * Aquí le decimos que tendremos dos tipos de genéricos, uno del tipo T y otro
     * del tipo V
     */
    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!");
        System.out.println(otherThingToShout + "!!!!!");
    }

    /**
     * Aquí le estamos diciendo que es un método genéricos que soporta 2
     * tipos: T y V, y que además ese método debe retornar un dato
     * del tipo T
     */
    private static <T, V> T shoutConRetorno(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!");
        System.out.println(otherThingToShout + "!!!!!");
        return thingToShout;
    }

    /**
     * Comodín (?)
     * ************
     * <?>, es usado para indicar que no sabemos exactamente cuál el tipo del genérico.
     * <?>, es decir puede ser cualquier tipo de objeto ejmp. Cliente, String, etc..
     * En el método se recibe una lista de <?>, es decir le decimos a java, que acepte tomar
     * una lista de CUALQUIER COSA, pero no sé lo que va en la lista.
     *
     * Recordar que es lo mismo que usamos en el ResponseEntity<?>, cuando trabajamos en
     * Spring Boot, para decirle que retornaremos cualquier tipo de Objeto: Un Map, un Cliente, etc.
     */
    private static void printList(List<?> myList) {
        System.out.println();
    }
}
