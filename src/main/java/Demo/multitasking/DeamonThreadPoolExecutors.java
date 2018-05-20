package Demo.multitasking;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DeamonThreadPoolExecutors extends ThreadPoolExecutor {
    public DeamonThreadPoolExecutors(){
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new
                DemonsThreadFactory());

    }

}
