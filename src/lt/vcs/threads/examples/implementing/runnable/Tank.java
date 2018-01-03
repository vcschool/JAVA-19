package lt.vcs.threads.examples.implementing.runnable;

class Tank implements Runnable {
    @Override
    public void run() {
        System.out.println("Tank thread name: " + Thread.currentThread().getName());
    }
}
