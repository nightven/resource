package HW8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;


/*
Написать программу Text editor
Программа позволяет пользователю, взаимодействуя с консолью записывать в файл.
Программа завершается, если наберу слово “exit”
По завершению программы, вывести статистику файла:
Содержимое файла в консоль.
Общее количество символов
Номер строки с самым большим количеством гласных
количество слов (регулярное выражение для всех пробелов)
В программе использовать:
Files.write()
StandardOpenOption
Files.lines

 */
public class TextEditor {
    public static void main(String[] args) throws IOException {
        String pathS = "E:\\java_lessons\\Text.txt";
        Path path = Paths.get("Text.txt");
        File file = new File(pathS);
        System.out.println("Водите текст на русском языке. Для окончания ввода введите слово \"стоп\"");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = reader.readLine();
            if (str.equalsIgnoreCase("стоп")) {
                break;
            } else writeToFile(str);


        }
        System.out.println("Вот что записано в файле: ");
        readFileAndOutput(path);

        System.out.println("В даном файле: " + getSumChar(pathS)+ " символов"+"\n");


        System.out.println("Строка с найбольшим количеством гласных: ");
        getStringVowels(pathS);

        getCountWords(file);
    }

    // метод записывает введенные с консоли данные в файл
    private static void writeToFile(String str) throws IOException {
        Files.write(Paths.get("Text.txt"), (str + System.lineSeparator()).getBytes(),
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    // метод ввыводит содержимое файла
    public static void readFileAndOutput(Path path) throws IOException {

        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }
    }

   // метод подсчитывает с файла данные и выводит количество символов в файле
    public static int getSumChar(String paths) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(paths))){
            String buffer;
            while ((buffer = br.readLine()) != null){
                sb.append(buffer);
            }
        }
        char []ch = new char[sb.length()];
        sb.getChars(0, sb.length(), ch, 0);
        return ch.length;
    }

    //медод подсчитает строку в которой больше всего гласных
    public static void getStringVowels(String pathS) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(pathS))) {
            String maxVwels = null;
            int counnt = 0;
            int stoka = 0;
            String str;
            Pattern p = Pattern.compile("[аеёиоуыэюяіїє]");
            while ((str = br.readLine())!=null){
                Matcher m = p.matcher(str);
                    while (m.find()){
                        counnt++;                       //работает вродь верно, но вот чет количество гласных не верное выдает
                    }                                   // не подскажешь где ошибка?
                    if(counnt > stoka){
                        maxVwels = str.toLowerCase();
                        stoka = counnt;
                    }
            }
            System.out.println(maxVwels);
          //  System.out.println(stoka);
        }
    }
  //        метод подсчитывает количество слов в файле
    public static void getCountWords(File file) throws IOException {
        long l = Files.lines(Paths.get(String.valueOf(file)))
                .flatMap(str->Stream.of(str.split("[ ,.!?\\r\\n]")))
                .filter(s->s.length()>0).count();
            System.out.println("В файле " + l + " слов"); //не пойму, почему выдает на 1 больше????
    }

}
