package lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

/*
    Реализовать переворот матрицы на 90, 180, 270 градусов по часовой стрелке
    Размер массива задается пользователем.
    1, 1, 1
    2, 2, 2
    3, 3, 3

    3, 2, 1
    3, 2, 1
    3, 2, 1
*/
public class Lesson3_Dz5 {


    static void MarixFool(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int i2 = 0; i2 < arr[i].length; i2++) {
                arr[i][i2] = (int) Math.round((Math.random() * 10));
            }
        }
    }

    static void MatrixPrint(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int i2 = 0; i2 < arr[i].length; i2++) {
                System.out.print(arr[i][i2] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] MatrixRotate90(int arr[][]) {
        int arr2[][] = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int i2 = 0; i2 < arr.length; i2++) {
                arr2[i][i2] = arr[i2][arr.length - i - 1];
            }
        }
        arr = arr2;
        return arr;
    }

    static int PovorotNaSkolkoGradusov() {
        int grad = (int) Math.round((Math.random() * 2 + 1));
        System.out.println("Принято решение повернуть на " + grad * 90 + " градусов против часовой стрелки");
        return grad;
    }


    public static void main(String[] args) {
        System.out.println("Введите размер матрици(от 2 до 7" );
        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int arr[][] = new int[high][high];
        MarixFool(arr);
        MatrixPrint(arr);
        int ChisloPovorotov = PovorotNaSkolkoGradusov();
        for (int i = 1; i <= ChisloPovorotov; i++)
            arr = MatrixRotate90(arr);
        MatrixPrint(arr);


    }
}

