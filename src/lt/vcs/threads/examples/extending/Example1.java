package lt.vcs.threads.examples.extending;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        new Tank().start();
    }
}
