public class Demo {
    static int b = 8;
    static double d =6.5;
    static char ch = 'B';
    public static void main(String[] args) {
        System.out.println("Viva Java");
        System.out.println(b + (int)d);
        System.out.println(b + d);
        System.out.println(ch);
        ch +=5;
        System.out.println(ch);
        int i = (int)ch - b;
        System.out.println(i);
    }
}
