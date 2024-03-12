package Ejercicio2;

public class StringPrinter implements Runnable {
    private String message;

    public StringPrinter(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while(true) {
            System.out.print(message + " ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getStackTrace());
            }
        }
    }
}
