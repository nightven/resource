package Demo.multitasking;

public class BasicThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOf());
        thread.start();
        System.out.println("Waiting for LiftOf");
    }
}
