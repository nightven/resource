package Demo.multitasking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Предотвращение потоковых конфликтов с испольованием мьютексов.
public class MutexEventGenerator  extends IntGenerator{
    private int currentEvenValue = 0;
    private Lock lock = new ReentrantLock();
    public int next(){
        lock.lock();
        try{
            ++currentEvenValue;
            Thread.yield(); //Ускоряем сбой
            ++currentEvenValue;
            return currentEvenValue;
        }finally {
            lock.unlock();

        }
    }

    public static void main(String[] args) {
        EventChecker.test(new MutexEventGenerator());
    }
}
