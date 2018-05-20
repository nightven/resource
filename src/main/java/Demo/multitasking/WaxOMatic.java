package Demo.multitasking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Простейшее взаимодействие задач
class Car{
    private boolean waxOn = false;
    public  synchronized void waxed(){
        waxOn = true; //готово к обработке
        notifyAll();
    }
    public synchronized void buffed(){
        waxOn = false; //готово к нанесению очередного слоя
        notifyAll();
    }
    public synchronized void waitForWaxing() throws InterruptedException{
            while (waxOn == false) wait();
    }
    public synchronized void waitForBuffed()throws InterruptedException{
        while (waxOn == true) wait();
    }
}
class WaxOn implements Runnable {
    private Car car;

    public WaxOn(Car c) {
        car = c;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().interrupted()) {
                System.out.println("WaxOn! ");
                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
                car.waitForBuffed();
            }
        } catch (InterruptedException e) {
            System.out.println("Exiting via interrupt");
        }
        System.out.println("Ending wax on task");
    }
}
class WaxOff implements Runnable{
    private Car car;
    public WaxOff(Car c) {
        car = c;
    }
    public void run() {
        try {
            while (!Thread.currentThread().interrupted()) {
                car.waitForWaxing();
                System.out.println("WaxOff! ");
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffed();

                }
            } catch (InterruptedException e) {
            System.out.println("Exiting via interrupt");
        }
        System.out.println("Ending wax off task");
    }
}
public class WaxOMatic {
    public static void main(String[] args) {
        Car car = new Car();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new WaxOff(car));
        exec.execute(new WaxOn(car));
        try {
            TimeUnit.SECONDS.sleep(5); //небольшая задержка
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exec.shutdownNow(); //прерывание всех задач
    }
}
