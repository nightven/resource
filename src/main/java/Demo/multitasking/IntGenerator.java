package Demo.multitasking;

public abstract class IntGenerator {
    public  volatile  boolean canceled = false;
    public abstract int next();
    //для отмены
    public void cencel(){
        canceled = true;
    }
    public boolean isCanceled(){
        return canceled;
    }
}
