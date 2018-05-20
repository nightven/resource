package HW2;
//Программа должна вывести длину окружности. Радиус задается пользователем с консоли.

import java.util.Scanner;

public class D_Z3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Для того чтобы узнать длину окружности\n" +
                                            "Введите значение радиуса :");

        double r = sc.nextDouble();
        double pi = Math.PI;

        System.out.println("Длина окружности равна : " + circumference(pi, r));
    }
    public static double circumference(double pi,double r){
        return  (pi * 2 * r);
    }
}
