package lt.vcs.threads.examples.implementing.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@SuppressWarnings("ALL")
public class Example3 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future result = es.submit(new Tank());
        System.out.println(result);
    }
}
