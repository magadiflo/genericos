package org.magadiflo.app;

public class Main {
    public static void main(String[] args) {
        Printer<Cat> integerPrinter = new Printer<>(new Cat("Pelusa"));
        integerPrinter.print();

        Printer<Dog> doublePrinter = new Printer<>(new Dog());
        doublePrinter.print();

        shout("Martín");
        shout(57);
        shout(new Cat());
    }

    /**
     * Método genérico
     * ****************
     * Antes de tipo de dato de retorno, en el caso de este método es un void,
     * le colocamos el <T>, con eso le decimos a Java que este método es un genérico, y
     * que como parámetro le estamos pasando ese tipo T
     */
    private static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + "!!!!!");
    }
}
