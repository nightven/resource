package Demo.multitasking;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOf()).start();
        }
        System.out.println("Waiting for LiftOF");
    }
}
