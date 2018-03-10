package lesson3;
    /*Нарисовать обои
        +++***+++***+++***
        +++***+++***+++***
        +++***+++***+++***
        +++***+++***+++***

        1)Пользователь может ввести количество полос. В примере выше 6 полос
        2)Ширина рисунка  задается пользователем. В данном примере 3
        3)Опционально: задать высоту */


import java.util.Scanner;

public class Lesson3_Dz3 {
    public static void main(String[] args) {

        char ch = '*';
        char ch2 = '+';

        System.out.println("Введите количество полос: ");
        Scanner sc1 = new Scanner(System.in);
        int pol = sc1.nextInt();

        System.out.println("Введите значение для ширины полос: ");
        Scanner sc2 = new Scanner(System.in);
        int width = sc2.nextInt();

        System.out.println("Задайте высоту: ");
        Scanner sc3 = new Scanner(System.in);
        int height = sc3.nextInt();

        String str1 = new String();
        String str2 = new String();
        for (int i = 0; i < width; i++) {
            str1 += ch;
            str2 += ch2;
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (pol / 2); j++) {

                System.out.print(str1 + str2);
            }
            if (pol / 2 != 0) System.out.print(str1);
            System.out.println();
        }
    }


}
