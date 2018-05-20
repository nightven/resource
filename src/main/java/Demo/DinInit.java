package Demo;//этот пример демонстрирует динамическую инициализацию

public class DinInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        //динамическая инициализация переменной с
        double c = Math.sqrt(a * a + b * b);
        System.out.println("гипотеруза равна " + c);
    }
}
