package java8.Task01.LambdaExpressions;

public class PrintNumbers {
    public static void main(String[] args) {
        Runnable printNumbers = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread thread = new Thread(printNumbers);
        thread.start();
    }
}
