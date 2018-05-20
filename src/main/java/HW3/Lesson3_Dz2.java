package HW3;
    // Вывести только простые числа от 1 до 100

public class Lesson3_Dz2 {
    public static void main(String[] args) {
        int x, y;
        for (x = 2; x <101; x++) {
            y = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0)
                    y++;
            }
            if (y <= 2)
                System.out.println(x);

        }

    }
}
