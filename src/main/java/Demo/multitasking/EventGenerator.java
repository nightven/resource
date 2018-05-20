package Demo.multitasking;
//Конфликт потоков
public class EventGenerator extends IntGenerator{
    private int currentEvenValue = 0;
    public int next(){
        ++currentEvenValue; //опасная точка
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EventChecker.test(new EventGenerator());
    }
}
