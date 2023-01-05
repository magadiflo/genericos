package org.magadiflo.app;

public class Main {
    public static void main(String[] args) {
        Printer<Cat> integerPrinter = new Printer<>(new Cat("Pelusa"));
        integerPrinter.print();

        Printer<Dog> doublePrinter = new Printer<>(new Dog());
        doublePrinter.print();
    }
}
