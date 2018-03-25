package Demo;
// Крошечный редактор.
import java.io.*;
public class TinyEdit {
    public static void main(String args[]) throws IOException
    {
// Создать BufferedReader, используя System.in
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Вводите строки текста.");
        System.out.println("Введите 'стоп' для завершения.");
        for(int i=0; i<100; i++){
            str[i] = br.readLine();
            if(str[i].equals("стоп")) break;
        }
        System.out.println("\nВот ваш файл:");
// отобразить строки
        for(int i=0; i<100; i++) {
            if(str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }
    }
}
