package HW9;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo extends DefaultMyList {
    private static Object[] c;

    private int age;
   private String name;

    public Demo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Demo demo = new Demo(22, "Sergey");
        Demo demo2 = new Demo(26, "Roman");
        DefaultMyList defMy = new DefaultMyList();
        Integer kesh = 150_000;
        Integer kesh2 = 50_000;
        String job = "programmist";

        defMy.addList(demo);
        defMy.addList(demo2);
        defMy.addList(kesh);
        defMy.addList(kesh2);
        defMy.addList(job);
        List<Object> MyList = new ArrayList<>();// это
        MyList.addAll(defMy.myList);           //для проследней проверки

        System.out.println("Вот наша колекция \n" + defMy.myList);


        System.out.println("\nУдалим елемнт колекции kesh2");
        defMy.removeList(kesh2);
        System.out.println(defMy.myList);

        System.out.println("\nЗанесем обьекты списка в массив");
        c = defMy.listToArray();
        for (Object o : c
                ) {
            System.out.println(o);
        }

        System.out.println("\nРазмер колекции сейчас " + defMy.sizeList());

        System.out.println("\nПроверим, есть ли в списке обьект kash2: " + defMy.containsList(kesh2));

//        System.out.println("\nПроверим, все ли элементы с созданой колекции имеються в текущей");

        // System.out.println(defMy.containsAllList();  не могу понять как тут вызввать??

//        System.out.println("\nСотрем всю коллекцию. ");
//        defMy.clearList();
//        System.out.println("проверим пустая ли колекция "+ defMy.myList.isEmpty());

        System.out.println("\nИспользование итератора.\n");
        Iterator<Object> iterator = defMy.myList.iterator();

        System.out.println("Вызовем 1й елемент через итератор");
        System.out.println(iterator.next());

        System.out.println("\nТеперь применим метод ремув. Если не был до этого вызван оператор next() вылетит ошибка");
        iterator.remove();

        System.out.println("Посмотрим, изменилась ли колекция. Вывод через while");
        while (iterator.hasNext()) System.out.println(iterator.next());
        // iterator= defMy.myList.iterator();

        System.out.println("\nПеребор оставшихся елементов через цикл foreath");

        for (Object o: defMy.myList
             ) {
            System.out.println(o);
        }

    }

        public String toString(){
        return "Object Demo: имя "+getName()+", возраст "+getAge()+""; //как сюда интежеры со стрингом запихнуть?
        }



}
