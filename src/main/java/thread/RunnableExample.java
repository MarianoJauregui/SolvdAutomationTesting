package thread;

public class RunnableExample {
    public static void main(String[] args) {
        Thread threadExample = new Thread();
        threadExample.start();

        Runnable runnable = () -> System.out.println("Method run using lambda");

        Thread lambdaThread = new Thread(runnable);
        lambdaThread.start();
    }
}
