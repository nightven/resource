package HW13;


import java.util.concurrent.TimeUnit;

/*
Создать класс с двумя отдельными счетчиками и объект этого класса. Создать несколько одинаковых потоков,
 каждый из которых повторяет следующее: сравнивает значение счетчиков и печатает результат сравнения,
 увеличивает первый счетчик, засыпает на 10 мсек, а затем увеличивает второй счетчик.
 Сравнить работу программы при условии, что упомянутый блок кода синхронизирован и не синхронизирован
 */
public class TwoCounter implements Runnable {
    private static int oneCount = 0;
    private  static int twoCount = 0;

    public static void main(String[] args) {
        TwoCounter twoCounter = new TwoCounter();
       new Thread(twoCounter).start();
       new Thread(twoCounter).start();

    }
    /*
    Даный блок кода не синхронизирован, по этому 2 потока могут работать одновременно, по этому при сравнение 2х счетсчиков
    может выскочить false потому как в один из моментов перезапись в счетчик моет произойти одноврмеменно
     */

//        @Override
//        public void run() {
//            System.out.println("oneCount = twoCount: " +(oneCount == twoCount) );
//            oneCount++;
//            try {
//                TimeUnit.MILLISECONDS.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            twoCount++;
//        }
   /*
   В синнхронизированном блоке поток блокирует блок, пока не выполнит его
   по этому при сравнении 2х счетчиков всегда будет true
    */
    @Override
    public synchronized void run() {
        System.out.println("oneCount = twoCount: " +(oneCount == twoCount) );
        oneCount++;
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupt");
        }
        twoCount++;
    }

}
