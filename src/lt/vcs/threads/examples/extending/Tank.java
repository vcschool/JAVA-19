package lt.vcs.threads.examples.extending;

class Tank extends Thread {
    @Override
    public void run() {
        System.out.println("Tank thread name: " + Thread.currentThread().getName());
    }
}
