package lesson3;

import java.util.Arrays;

public class Demo_Math_random {
    public static void main(String[] args) {
        int [] arc = new int[10];
        for (int i = 0; i < 10; i++) {
            arc[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(arc));
    }
}
