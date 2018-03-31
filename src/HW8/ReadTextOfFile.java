package HW8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
считать текст из файла.
Вывести информацию в консоль по частоте использования букв в таком формате:
буква: количество раз в файле
При чем вверху должны выводиться буквы самые редкие, внизу самые частые

 */
public class ReadTextOfFile {
    public static void main(String[] args) {
        try {
            LettersCount(readBufferedReader());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //медод считывает данные из файла
    private static String readBufferedReader() throws FileNotFoundException, IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\java_lessons\\Text.txt"))) {
            String buffer;
            while ( (buffer = br.readLine()) != null) {
                sb.append(buffer.toLowerCase()).append(System.lineSeparator());
            }
        }
//        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void LettersCount(String s){
         Stream.of(s.replaceAll("[\\s\\.,!-\\?]", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((letter, count)-> System.out.println(letter + " " + count));
    }
}
