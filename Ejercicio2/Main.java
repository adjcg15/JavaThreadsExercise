package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        StringPrinter helloPrinter = new StringPrinter("Hello");
        StringPrinter worldPrinter = new StringPrinter("World");

        Thread helloThread = new Thread(helloPrinter);
        Thread worldThread = new Thread(worldPrinter);

        helloThread.start();
        worldThread.start();
    }
}
