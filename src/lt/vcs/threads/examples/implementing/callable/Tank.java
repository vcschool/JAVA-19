package lt.vcs.threads.examples.implementing.callable;

import java.util.concurrent.Callable;

class Tank implements Callable {
    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName();
    }
}
