package HW4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
ДЗ методы:
       1)написать метод, который принимает массив целых чисел и возвращает максимальное
       2)написать метод, который рисует прямоугольник из плюсиков. Входными параметрами будут два числа - ширина и высота
       3)релизовать метод, который вернет количество слов в строке текста


 */
public class Lesson4_Dz2 {
    public static void main(String[] args) {
         int[]arr = {1, 9, 5, 6, 2, 4, 3};
        System.out.println("Задан масив из чисел {1, 9, 5, 6, 2, 4, 3}. Выводим его максимальное значение.");
        System.out.println("Максимальное значение: " + getMax(arr) + "\n - - - - - -");

        System.out.println("Рисуем прямоугольник.\n Введите значение для высоты: ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        System.out.println("Введите значение для ширины:");
        int width = sc.nextInt();
        sc.close();
        Pryamougol(height, width);

        System.out.println("\nЗадана строка \"Учить джава с SourceIt просто!\"");
        System.out.println("Пусть программа подсчитает сколько тут слов.");
        String str = "Учить джава с SourceIt просто!";
        System.out.println("В даной строке " + KolSlov(str)+ " слов.");
        System.out.println("Какая умная программа =))");

    }

    public static int getMax(int[] arr){
        Arrays.sort(arr);                   //Сортируем входящий массив
         int max = (arr[arr.length -1]);    //Узнаем его последнее значение, так как это будет максимальное
         return max;                        //И возвращаем даное значение
    }

    public static void Pryamougol(int a, int b){  //Тут все просто, принимаем 2 значения
        for (int i = 0; i < a; i++) {             //высоты и ширины, и через 2 массива выводим знак +
            for (int j = 0; j < b; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static int KolSlov(String s){            //Даный метод подсчитает нам сколько слов в строке
        Pattern pattern = Pattern.compile(" ");     //Задаем регулярное выражение вокруг которого и будут слова
        String[] slova = pattern.split(s);          //заносим слова в массив, ну чтобы ручкаами не считать потом
        return slova.length;                        //и возвращаем количество слов
    }
}
