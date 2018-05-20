package Demo;

public class NewThread3 implements Runnable {
    String name; // имя потока
    Thread t;
    NewThread3(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t .start(); // запустить поток
    }
    // Входная точка потока,
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен.");
    }
}
class MultiThreadDemo {
    public static void main(String args[]) {
        new NewThread3("Один"); // запуск потоков
        new NewThread3("Два");
        new NewThread3("Три");
        try {
// ожидание завершения других потоков
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен.");
    }
}
