package Demo;//Демонстрация применения replace()

public class replaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a test.");
        sb.replace(5, 7, "was");
        System.out.println("После замены: " + sb) ;
    }
}
