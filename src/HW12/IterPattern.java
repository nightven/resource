package HW12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IterPattern  {
    public static void main(String[] args) {
        /*
        Создадим контейнер с легковыми и грузовыми авто добаваим туда несколько елементов
         */
        ArrayList<String> auto = new ArrayList<>();
        auto.add("car Audi");
        auto.add("car Nissan");
        auto.add("truck Volvo");
        auto.add("truck Renault");
        /*
        Делее создаем итератор для даного контейнера
         */
        Iterator<String> iterator = auto.iterator();
        /*
        В  цикле while перебираем елементы колекции и на каждом елементе проверяем совпадает ли текст в елементе
        регулярному выражению. Выводим елемент которы совпадает
         */
        while (iterator.hasNext()){
            String s = iterator.next();
            if(Pattern.matches("^car\\s.*$",s)) System.out.println(s);
        }
    }



}
