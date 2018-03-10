package lesson3;
/*C помощью циклов нарисовать такую фигуру:
        *
        **
        ***
        ****
        ***
        **
        *
        Максимальная высота вводится с клавиатуры (в данном примере высота 4)*/

import java.util.Scanner;

public class Lesson3_Dz1 {
    public static void main(String[] args) {

        char ch = '*';
        String str = "*";

        System.out.println("Введите высоту фигуры: ");

        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int it = height - 1;

        for (int i = 0; i < height; i++) {

            System.out.println(str);
            str += ch;
        }

        for (int j = 0; j < height; j++) {
            for (int k = 0; k < it; k++) {
                System.out.print(ch);
            }
            it -= 1;
            System.out.print("\n");
        }
    }

}
