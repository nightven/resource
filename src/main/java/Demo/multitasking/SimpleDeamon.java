package Demo.multitasking;

import java.util.concurrent.TimeUnit;

//потоки демоны не препятствуют завершению программы
public class SimpleDeamon implements Runnable {
    public void run(){
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        }catch (InterruptedException e){
            System.out.println("Interapted");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread deamon = new Thread(new SimpleDeamon());
            deamon.setDaemon(true);//НЕОБХОДИМО ВЫЗВАТЬ ПЕРЕД start()
            deamon.start();
        }
        System.out.println("Все демоны запущены");
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
