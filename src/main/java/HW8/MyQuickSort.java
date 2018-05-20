package HW8;
/*
Написать метод пцзырьковой сортировки
 */
public class MyQuickSort {

    public static int[] quickSort(int[] mass, int startIndex, int endIndex){
        if(startIndex >= endIndex)return mass;
        int s = startIndex;
        int e = endIndex;
        int op = s - ((s - e)/2);
        while (s < e){
            while ((s < op) && mass[s] <= mass[op])s++;
            while ((e > op) && mass[e] >= mass[op])e--;

            if(s < e){
                int temp = mass[s];
                mass[s] = mass[e];
                mass[e] = temp;
                if(s == op)op = e;
                else if(e == op)op = s;
            }
        }
        quickSort(mass,startIndex , op);
        quickSort(mass,op +1 , endIndex);

        return mass;
    }

    public static void main(String[] args) {
        int [] mass = new int[15];
        for (int i = 0; i < mass.length-1; i++) {
            mass[i] = (int)(Math.random()*15);
            System.out.print(mass[i] + ", ");
        }
        System.out.println();
        mass = quickSort(mass,0,mass.length-1);
        for (int i = 0; i < mass.length-1; i++) System.out.print(mass[i] + ", ");

    }
}
