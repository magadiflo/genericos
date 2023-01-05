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


        /*
         * Anteriormente esto funcionaba, pero como ahora el método printList tiene
         * en la lista el comodín ? que extiende de Animal, solo aquellas listas
         * cuyo dato herede de animal los aceptará, como es el caso del Cat, mientras que el
         * Integer o String no. Esto significa que el comodín ha sido limitado a todas
         * aquellos tipos que hereden de Animal.
         */
        /*
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        printList(stringList);
        */

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
     * <p>
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
     * Comodín (?) (wildcard en inglés)
     * ********************************
     * <?>, es usado para indicar que no sabemos exactamente cuál es el tipo del genérico.
     * <?>, es decir puede ser cualquier tipo de objeto ejmp. Cliente, String, etc..
     * En el método se recibe una lista de <?>, es decir le decimos a java, que acepte tomar
     * una lista de CUALQUIER COSA, pero no sé lo que va en la lista.
     * <p>
     * Ampliando la explicación y tomando a la interfaz List<E> como ejemplo, vemos que esta
     * interfaz ha sido construida esperando un tipo de dato E, es decir un tipo de dato genérico
     * que definirá el tipo de dato que aceptará esta lista. Si previamente sabemos qué tipo de dato
     * aceptará la lista, lo podemos colocar, por ejemplo: List<String>, List<Cat>, List<Client>,
     * List<Integer>, etc.. es decir, le estamos diciendo que el genérico E será del tipo
     * que le estamos colocando. Ahora, puede suceder que de antemano no sepamos qué tipo de dato
     * será el que tome ese genérico E, pero sí vamos a usar la interfaz List (o cualquier otra
     * interfaz o clase que requiera que se le defina un tipo de dato a su genérico) el único detalle
     * es que de antemano desconocemos el tipo de dato que tomará el genérico. Entonces, como solución
     * es que se usa el comodín ?, para indicarle que el genérico que está esperando que se le
     * defina un tipo de dato, será del cualquier tipo.
     * <p>
     * Recordar que es lo mismo que usamos en el ResponseEntity<?>, cuando trabajamos en
     * Spring Boot, para decirle que retornaremos cualquier tipo de Objeto: Un Map, un Cliente, etc.
     * <p>
     * <p>
     * <? extends Animal>, con esto estamos limitando el comodín, diciendo que
     * será cualquier tipo de objeto, pero que herede de Animal, similar a cómo lo
     * hacíamos en nuestras clases genéricas.
     */
    private static void printList(List<? extends Animal> myList) {
        System.out.println();
    }
}
