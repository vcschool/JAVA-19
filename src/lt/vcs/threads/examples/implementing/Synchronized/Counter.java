package lt.vcs.threads.examples.implementing.Synchronized;

class Counter {

    private long count = 0;

     synchronized void add(long value) {
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         this.count += value;
    }

    long getCount() {
        return count;
    }
}