package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        IntegerListPrinter printer = new IntegerListPrinter(100, false);
        IntegerListPrinter reversedPrinter = new IntegerListPrinter(100, true);

        Thread thread = new Thread(printer, "PrinterThread");
        Thread reversedThread = new Thread(reversedPrinter, "ReversedPrinterThread");

        thread.start();
        reversedThread.start();
    }
}