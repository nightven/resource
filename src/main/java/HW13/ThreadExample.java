package HW13;
/*

 */

public class ThreadExample {
    public static void main(String[] args) {
        test1();
//        test2();
    }
    private static void test2() {

        Runnable runnable = () -> {
            try {
                int i = 0;
                while (i !=10) {
                    System.out.println("Foo " + Thread.currentThread().getName());
                    Thread.sleep(500);
                    i++;
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void test1(){
        new DemoThread().start();
    }
    static class DemoThread extends Thread{
        @Override
        public void run() {
            try {
                int i = 0;
                while (i !=10) {
                    System.out.println("Foo " + Thread.currentThread().getName());
                    Thread.sleep(500);
                    i++;
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
