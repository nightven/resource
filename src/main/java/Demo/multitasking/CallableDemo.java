package Demo.multitasking;

import java.util.ArrayList;
import java.util.concurrent.*;

class TaskWithResault implements Callable<String>{
    private int id;
    public TaskWithResault(int id){
        this.id = id;
    }
    public String call(){
        return "resault TaskWithResault" + id;
    }
}
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> resault = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++)
            resault.add(exec.submit(new TaskWithResault(i)));
            for (Future<String> fs: resault
                 ) {
                try {
                    //Вызв get  блокируеться до завершения
                    System.out.println(fs.get());
                }catch (InterruptedException e){
                    System.out.println(e);
                    return;
                }catch (ExecutionException e){
                    System.out.println(e);
                }finally {
                    exec.shutdown();
                }
            }
        }
    }

