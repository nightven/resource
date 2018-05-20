package Demo.multitasking;

public class LiftOf implements Runnable {
    protected int coutDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOf(){};
    public LiftOf(int countDown){
        this.coutDown = countDown;
    }
    public String status(){
        return "#" + id + "(" + (coutDown > 0? coutDown: "LiftOf") + ")  ";
    }
    public void run(){
        while (coutDown-- > 0){
            System.out.print(status());
            Thread.yield();
        }
    }
}
