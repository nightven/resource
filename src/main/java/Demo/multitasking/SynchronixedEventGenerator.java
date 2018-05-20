package Demo.multitasking;
//Упрощение  работы с мьютексом с применением  ключевого слова synchronized
//{RunByHand}
public class SynchronixedEventGenerator extends IntGenerator{
    private int currentEventValue = 0;
    public synchronized int next(){
        ++currentEventValue;
        Thread.yield(); //ускоряем сбой
        ++currentEventValue;
        return currentEventValue;
    }

    public static void main(String[] args) {
        EventChecker.test(new SynchronixedEventGenerator());
    }

}
