package lt.vcs.threads.examples.implementing.Synchronized;

public class CounterRunnable implements Runnable {
    private Counter counter = null;

    CounterRunnable(Counter counter) {
        this.counter = counter;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.add(i);
            System.out.println(Thread.currentThread().getName() + " " +  counter.getCount());
        }
    }
}
