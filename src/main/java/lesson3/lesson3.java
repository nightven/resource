package lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;;

public class lesson3 {
    public static void main(String[] args) {
//    switch (DemoEnum.A)  {
//        case A:
//            System.out.println("1");
//            break;
//        case B:
//            System.out.println("2");
//            break;
//            default:
//                System.out.println("Default");
//
//                int[] arr = {1, 2, 3};
//
//                while (true){
//                    System.out.println("1");
//                    break;
//                }
//                for (int i = 0; i < 5 ; i++) {
//                    if(i == 3)continue;
//                    System.out.println(i);
//                }
//
//         byte b = 0;
//                while (b>=0){
//                    System.out.println(b);
//                    b++;
//                }
//        int[] arr = new int[10];
//        int[] arr2 = {4, 5, 1};
//
////
//
//        System.arraycopy(arr2,0, arr, 3,arr2.length);
//        System.out.println(Arrays.toString(arr));

//        for (int i:arr2) {
//            System.out.println(i);
//        }
//        System.out.println(2.0 / 0);
//        System.out.println(Math.sqrt(-1));
//
//        if(Double.isNaN(Math.sqrt(-1)));

        Integer[] arr = {3, 9 ,6 ,7};
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr, Collections.reverseOrder());// обратная сортировка
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,( a,  b) -> b - a);             //ЭТОМУ

        Arrays.sort(arr, new Comparator<Integer>() {    //ДАНЫЙ БЛОК ИДЕНТИЧЕН БЛОКУ ВЫШЕ
            @Override                                   //
            public int compare(Integer a, Integer b) {  //
                return b - a;
            }

            });


                System.out.println(Arrays.toString(arr));

                int[][]matrix ={
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9, 10}
                };

                int[][]matrix2 = new int[2][];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();

        }
    }
        static int customSort(Integer a, Integer b){
        return b - a;
        }
    }


//enum DemoEnum{
//    A,
//    B,
//    C;
//}