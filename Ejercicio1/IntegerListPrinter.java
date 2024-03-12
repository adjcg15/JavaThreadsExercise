package Ejercicio1;

public class IntegerListPrinter implements Runnable {
    private int iterator;
    private boolean isReverse;

    public IntegerListPrinter(int iterator, boolean isReverse) {
        this.iterator = iterator;
        this.isReverse = isReverse;
    }

    @Override
    public void run() {
        if (isReverse) {
            for (int i = iterator; 1 <= i; i--) {
                System.out.println(Thread.currentThread().getName() + ": " + i);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getStackTrace());
                }
            }
        } else {
            for (int i = 1; i <= iterator; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getStackTrace());
                }
            }
        }
    }
}
