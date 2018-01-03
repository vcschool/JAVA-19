package lt.vcs.threads.examples.implementing.runnable;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        new Thread(new Tank()).start();
    }
}
