package HW8;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/*
 Дан текст. Напечатать текст, поставив первый символ каждого слова в верхний регистр.
When I was younger
I never needed

и результат

When I Was Younger
I Never Needed

 */
public class ToUpOneChar {
    public static void main(String[] args) {
        String line1 = "When I was younger";
        String line2 =  "I never needed";
        toUpOneCharText(line1);
        toUpOneCharText(line2);
    }

//    public static String[] getTextToMass(String s) {
//        Pattern pattern = Pattern.compile(" ");
//        String[] slova = pattern.split(s);
//        return slova;
//    }
        // не ну как же крут этот стрим.....
    //даный метод берет строку, с нее отбирает слова и в каждом слове меняет 1ю букву на заглавную
    public static void toUpOneCharText(String text){
        Stream<String> str = Stream.of(text.split(" ")).map(s ->s.substring(0,1)
                .toUpperCase()+s.substring(1,s.length()));
        str.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
}
