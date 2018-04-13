package HW12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {


    public static void main(String[] args) {
        /*
        Создадим новую колекцию CopyOnWriteArrayList на основе интерфейса List
        и занесемт туда несколько значений типа Integer
         */
        List<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1, 5, 8, 9});
        /*
        При создании итератора для даной коллекции у нас создаеться копия даной колекции
        с которой и будет работать итератор
         */
        Iterator<Integer> iterator = list.iterator();
        /*
        Поэтому внесение нового елемента в эту колекцию никак не отобразится, так как итератор раотает с копией не
        модифицированой колекции
         */
        list.add(10); // етот елемент не будет выведен

        while (iterator.hasNext()) {      //проверим, что колекция не изменилась
            System.out.println(iterator.next());
        }
        System.out.println();
        /*
        Для того чтобы вывести модифицированую коллекцию нам нужен новый итератор
         */
        Iterator<Integer> iterator2 = list.iterator();

        while (iterator2.hasNext()) {  //теперь выведем модифицированую коллекцию
            System.out.println(iterator2.next());
        }

    }

}
