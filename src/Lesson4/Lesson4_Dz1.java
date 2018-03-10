package Lesson4;
        /*
        ДЗ форматирование:
            Вывести на экран число пи 5 раз, в каждой строке разное количество знак после запятой.
            В первой строке - 1, в последней - 5.
         */

public class Lesson4_Dz1 {
    public static void main(String[] args) {
        System.out.printf("%.1f\n",Pi());   //здесь мы выводим
        System.out.printf("%.2f\n",Pi());   //значение пи через
        System.out.printf("%.3f\n",Pi());   //вызов метода Pi
        System.out.printf("%.4f\n",Pi());   //и редактируем вывод
        System.out.printf("%.5f\n",Pi());   // знаков после запятой

    }
    public static double Pi(){  // этим методом мы возвращаем значение пи
        return Math.PI;         // в принципе можно было обойтись и без этого метода,но
    }                           // мы проходили методы по этому сделал вызов через метод
}
