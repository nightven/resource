package Lesson2;
 // Программа должна считать с консоли число, которое введет пользователь и вывести каждую цифру с новой строки.

import java.util.Scanner;

public class D_Z1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        int i = sc.nextInt();
        int i2[]= new int[6];
        for (int j = 5; j >= 0; j--) {
            i2[j] = i%10;
            i/=10;
        }
        for (int i3:i2) {
            System.out.println(i3);

        }



    }
}
