package Demo;
// Использование BufferedReader для чтения символов с консоли,
import java.io.*;
public class BRReder {
    public static void main(String args[]) throws IOException
    {
        char ch ;
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Вводите символы, 'q' — для выхода.");
// читать символы
        do {
            ch = (char) br.read();
            System.out.println(ch);
        } while(ch != 'q') ;
    }
}
