//демонстрация приведения типов

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПереобрзование типа int в byte");
        b = (byte) i;
        System.out.println("i и b " + i + " " + b);

        System.out.println("\nПереобразовани double в int");
        i = (int) d;
        System.out.println("i и d " + i + " " + d);

        System.out.println("\nПеребразование double в byte");
        b = (byte) d;
        System.out.println("b и d " + b + " " + d);

    }
}
