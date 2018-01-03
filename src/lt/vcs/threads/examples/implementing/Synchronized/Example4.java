package lt.vcs.threads.examples.implementing.Synchronized;

public class Example4 {
    public static void main(String[] args){
        Counter counter = new Counter();
        new Thread(new CounterRunnable(counter), "a").start();
        new Thread(new CounterRunnable(counter), "b").start();
    }
}
