package Demo.multitasking;

import java.util.concurrent.TimeUnit;

//Создание потоков с использованием  внутренних классов
public class InnerThread1 {
    private int countDown = 5;
    private Inner inner;
    private class Inner extends Thread{
        Inner(String name){
            super(name);
            start();
        }
        public void run(){
            try{
                while (true){
                    System.out.println(this);
                    if(--countDown == 0)return;
                    sleep(10);
                }
            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }
        public String toString(){
            return getName() + ": " + countDown;
        }

    }
    public InnerThread1(String name){
        inner = new Inner(name);
    }
}
//используем безымяннный внутренний класс
class InnerTread2{
    private int countDown = 5;
    private Thread t;
    public InnerTread2(String name){
        t = new Thread(name){
            public void run(){
                try {
                    while (true){
                        System.out.println(this);
                        if(--countDown == 0)return;
                        sleep(10);
                    }
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
            public String toString(){
                return getName() + ": " + countDown;
            }
        };
        t.start();
    }
}
//Используем  именнованую реализацию Runnable
class InnerRunnable1{
    private int countDown = 5;
    private Inner inner;
    private class Inner implements Runnable{
        Thread t;
        Inner(String name){
            t = new Thread(name);
            t.start();
        }
        public void run() {

            try {
                while (true) {
                    while (true) {
                        System.out.println(this);
                        if (--countDown == 0) return;
                        TimeUnit.MILLISECONDS.sleep(10);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("sleep() Interrupted");
            }
        }
        public String toString(){
            return t.getName() + ". " + countDown;
        }
    }
    public InnerRunnable1(String name){
            inner = new Inner(name);
    }
}
//Используем анонимную реализацию Runnable
class InnerRunnuble2{
    private int countDown = 5;
    private Thread t;
    public InnerRunnuble2(String name){
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                        while (true) {
                            System.out.println(this);
                            if (--countDown == 0) return;
                            TimeUnit.MILLISECONDS.sleep(10);
                    }
                }catch (InterruptedException e){
                    System.out.println("sleep() Interrupted");
                }
            }
            public String toString(){
                return Thread.currentThread().getName()+ ": " + countDown;
            }
        },name);
                t.start();
    }
}
//Отдельный  метод для выполнения кода в потоке
class ThreadMethod{
    private  int countDown = 5;
    private Thread t;
    private String name;
    public ThreadMethod(String nsme){
        this.name = nsme;
    }
    public void runTask(){
        if(t == null){
            t = new Thread(name){
                public void run(){
                try {
                    while (true){
                        System.out.println(this);
                        if(--countDown == 0) return;
                            sleep(10);
                    }
                }catch (InterruptedException e){
                    System.out.println("sleep() Interrupted");
                }
                }
                public String toString(){
                    return getName() + ": " + countDown;
                }
            };
            t.start();
        }
    }
}
class ThreadVariations{
    public static void main(String[] args) {
        new InnerThread1("InnerThread1");
        new InnerTread2("InnertTread2");
        new InnerRunnable1("InnerRunnable1");
        new InnerRunnuble2("InnerRunnable2");
        new ThreadMethod("ThreadMethod").runTask();
    }

}