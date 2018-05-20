package HW13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
Создать класс Spam, который получает массив интервалов времени в миллисекундах и согласованный с ним массив сообщений,
и выводит соответствующие сообщения на экран через заданные интервалы времени. По нажатию на клавишу Enter приложение
должно завершать свою работу (данную функциональность поместить в метод Spam.main). При демонстрации работы смоделировать
ввод Enter через 5 сек (данную функциональность поместить в метод Part2.main).

 */
public class Spam {
    private static int []interval = new int[]{500, 700, 300, 800, 300};
    private static String[] spamMass= new String[]{"Spam", "Спам", "Spam", "Спам", "Spam"};
    private static  String stop;
    private static boolean b;

    public static void main(String[] args) {
        MyThreads myThreads = new MyThreads();
        b = true;
        myThreads.start();
        Part2();
        //условие выхода из цикла
        if(stop == "\n") b = false;
        //тут правда не сразу обрыв происходит, а сначала второй поток завершает цикл while
        //System.out.println("стоп");


    }
    /*
    Даный класс содержит переропределенный метод run(), который выводит сообщения через заданые промежутки
     */
   public static class MyThreads extends Thread{

       @Override
       public void run() {
           while (b) {
                   for (int i = 0; i < interval.length; i++) {
                       try {
                           Thread.sleep(interval[i]);
                           System.out.println(spamMass[i]);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }

                   }
               }



       }
   }
   /*
   В даном методее главный поток main спит 5сек и имитирует ввод клавиши Enter(\n)
    */
    public static String Part2(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        return stop = "\n";
    }
}
