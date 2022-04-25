package thread;

public class RunnableExample {
    public static void main(String[] args) {

        for (int i=0; i<=3; i++){
            ThreadExample myUselessThread = new ThreadExample(i);
            Thread myRealThread = new Thread(myUselessThread);
            myRealThread.start();
        }

        Runnable runnable = () -> System.out.println("Method run using lambda");

        Thread lambdaThread = new Thread(runnable);
        lambdaThread.start();
    }
}
