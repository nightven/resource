package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Чтение строк с консоли с применением BufferedReader.
public class BRReadLines {
    public static void main(String args[]) throws IOException
    {
// Создать BufferedReader с использованием System.in
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String str;
        System.out.println("Вводите строки текста.");
        System.out.println("Введите 'стоп' для завершения.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("стоп"));
    }
}
