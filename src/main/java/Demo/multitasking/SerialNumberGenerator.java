package Demo.multitasking;

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public  static int nextSerialNumber(){
        return  serialNumber++; //операция не являеться потокобезопасной
    }
}
