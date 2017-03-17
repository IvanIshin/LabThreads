/**
 * Created by Ivan on 17.03.17.
 */
public class SecondThread implements Runnable {
    private String threadName;
    private Thread t;

    SecondThread(String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run () {
        System.out.println("Running " + threadName);
        try {
            for (int i = 1; i<10; i+=2) {
                System.out.println("Thread: " + threadName + ": " + i);
                Thread.sleep(50);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
