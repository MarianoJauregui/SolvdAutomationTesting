package thread;

public class ThreadExample implements Runnable{

    private int threadNumber;
    public ThreadExample(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i=1; i<= 5; i++){
            System.out.println(i + " from thread number: " + threadNumber);
            if(threadNumber == 3) { //This is to show that if one thread blows up, the other work just fine.
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

