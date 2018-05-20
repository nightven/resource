package Demo.multitasking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// кажущиеся безопасными операциии с появлением потоков перестают быть таковыми
//{Args,4}
class CircularSet{
    private int [] array;
    private int len;
    private int index = 0;
    public CircularSet(int size){
        array = new int[size];
        len = size;
        //инициалиируем значение которое не производиться классом SerialNumberGenerator
        for (int i = 0; i < size; i++) {
            array[i] = -1;

        }
    }
    public synchronized void add(int i){
        array[index] = i;
        //возврат индекса к началу с записью повер старых значений
        index = ++index % len;
    }
    public synchronized boolean contains(int val){
        for (int i = 0; i < len; i++)
            if(array[i]==val)return true;
            return false;


    }

}
public class SerialNumberChecker {
    private static final int SIZE = 10;
    private static CircularSet serials = new CircularSet(1000);
    private static ExecutorService exec = Executors.newCachedThreadPool();
    static class SerialChecker implements Runnable{
        @Override
        public void run() {
            while (true){
                int serial = SerialNumberGenerator.nextSerialNumber();
                if(serials.contains(serial)){
                    System.out.println("Duplicate: " + serial);
                    System.exit(0);
                }
                serials.add(serial);
            }
        }

    }
    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            exec.execute(new SerialChecker());
            //остановить чере n секунд при наличии аргумента:
            if(args.length > 0){
                try {
                    TimeUnit.SECONDS.sleep(new Integer(args[0]));
                    System.out.println("No duplicates detected");
                    System.exit(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
