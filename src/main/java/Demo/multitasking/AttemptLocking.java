package Demo.multitasking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

//Обьекты Lock из библиотеки concurrent делают возможным попытки установить блокировку
//в течении некоторого времени
public class AttemptLocking {
    private ReentrantLock lock = new ReentrantLock();
    public void untimed(){
        boolean captured = lock.tryLock();
        try {
            System.out.println("trylock " + captured);
        }finally {
            if (captured)lock.unlock();
        }
    }
    private void timed(){
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        try {
            System.out.println("tryLock(TimeUnit.SECONDS) " + captured);
        }finally {
            if(captured)lock.unlock();
        }
    }

    public static void main(String[] args) {
        final AttemptLocking al = new AttemptLocking();
        al.untimed();//True-- блокировка доступна
        al.timed();//True-- блокировка доступна
        //Теперь создаем отдельную задачу для управления блокировки
        new Thread(){
            {setDaemon(true);}
            public void run(){
                al.lock.lock();
                System.out.println("acquired");
            }
        }.start();
        Thread.yield();//Даем возможнность 2й задаче
        al.untimed(); //False-- Блокировка захвачена задачей
        al.timed(); //False-- Блокировка захвачена задачей
    }
}
