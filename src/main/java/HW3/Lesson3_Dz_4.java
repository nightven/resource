package HW3;

import java.util.Arrays;
import java.util.Random;

public class Lesson3_Dz_4 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[20];
        Random random = new Random();
        for (int index = 0; index < arr.length; index++) {
            arr[index] = random.nextInt(10);
        }
        System.out.println("1й массив");
        for (int a : arr) {
            System.out.print(a + ", ");

        }
        int[] arr3 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr3[i] = arr[i] * 2;
        }
        System.out.println();
        System.out.println(Arrays.toString(arr3));
        System.out.println();
        arr2 = concatArray(arr, arr3);
        System.out.println("2 массив");
        System.out.println(Arrays.toString(arr2));

    }

    private static int[] concatArray(int[] b, int[] c) {
        if (b == null)
            return c;
        if (c == null)
            return b;
        int[] r = new int[b.length + c.length];
        System.arraycopy(b, 0, r, 0, c.length);
        System.arraycopy(c, 0, r, b.length, c.length);
        return r;
    }

}