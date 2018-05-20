package HW2;
//Программа должна подсчитывать и выводить площадь треугольника. Стороны задаются пользователем с консоли.


import java.util.Scanner;

public class D_Z2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Чтобы высчитать площадь треугольника \n" +
                                    "Введите значение для стороны а :");
        int a = sc.nextInt();

        System.out.println("Введите значение для стороны b :");
        int b = sc.nextInt();

        System.out.println("Введите значение для стороны с :");
        int c = sc.nextInt();

        double resault = areaOfTheTriangle(a, b, c);

        System.out.println("Площадь треугльника равна : " + Math.sqrt(resault));
    }

    public static int areaOfTheTriangle (int a, int b, int c){
        int p =(a + b + c) /2;
        int s = (p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
