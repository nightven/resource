package Demo;

public class NewThreed4 implements Runnable {
    String name; // имя потока
    Thread t;
    NewThreed4(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); // Запуск потока
    }
    // Входная точка потока,
    public void run() {
        try {
            for(int i = 5; i >0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }

}
class DemoJoin {
    public static void main(String args[]) {
        NewThreed4 ob1 = new NewThreed4("Одни");
        NewThreed4 ob2 = new NewThreed4("Два");
        NewThreed4 ob3 = new NewThreed4("Три");
        System.out.println("Поток Один запущен: "
                + ob1.t .isAlive());
        System.out.println("Поток Два запущен: "
                + ob2.t .isAlive());
        System.out.println("Поток Три запущен: "
                + ob3.t .isAlive());
// ожидать завершения потоков
        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t .join();
            ob2.t .join();
            ob3.t .join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Поток Один запущен: "
                + ob1.t .isAlive());
        System.out.println("Поток Два запущен: "
                + ob2.t .isAlive());
        System.out.println("Поток Три запущен: "
                + ob3.t .isAlive());
        System.out.println("Главный поток завершен.");
    }
}

