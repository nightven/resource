package HW13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.TimeUnit;

/*
Писатель пишет в буфер, после этого буфер последовательно считывают читатели (вначале один, потом другой и т.д.) .
 После того, как все читатели прочитают буфер, процесс повторяется.

-Каждый читатель - отдельный поток (ограничить задачу тремя потоками).
-Ограничится 3 читателями
-Ограничить число тактов записи/чтения_всеми_читателями тремя тактами.
-Полное выполнение демонстрирующей программы - не более 5 с

 */
public class BufferedReaderWriter {
    static List<String> strings = Collections.synchronizedList(new ArrayList<String>());

    public static void main(String[] args) {
        new MyReader().start();
        new MyWriter().start();
    }
    static class MyReader extends Thread{
        @Override
        public void run() {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                synchronized (strings) {
                    try {
                        strings.add(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    strings.notifyAll();
                }
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class MyWriter extends Thread{
        @Override
        public void run() {
            int index = 0;
            while (strings.isEmpty()){
                synchronized (strings){
                    try{
                        strings.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(strings.get(index));
                    index++;
                }
            }
        }
    }

}
