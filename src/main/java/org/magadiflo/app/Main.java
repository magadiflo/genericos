package org.magadiflo.app;

public class Main {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(50);
        integerPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(3.141516);
        doublePrinter.print();

        Printer<String> stringPrinter = new Printer<>("Hello World!");
        stringPrinter.print();
    }
}
