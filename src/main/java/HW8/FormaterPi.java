package HW8;

import java.util.Formatter;

/*
Вывести на экран 5 строк числа Пи
в первой строке 1 знак после запятой, во второй два знака после запятой и так далее
java.util.Formatter

 */
public class FormaterPi {
    public static void main(String[] args) {
        double pi = Math.PI;
        Formatter f = new Formatter();
        Number[] n = {pi, pi, pi, pi, pi};
        f.format("%.1f\n%.2f\n%.3f\n%.4f\n%.5f\n",n[0],n[1],n[2],n[3],n[4]);
        System.out.println(f);
        // ОГО!!!! на сколько код сократился.
        // Но так же можно и через printf, ток раньше я этого и не знал
        //System.out.println("%.1f\n%.2f\n%.3f\n%.4f\n%.5f\n",n[0],n[1],n[2],n[3],n[4])


    }



}
