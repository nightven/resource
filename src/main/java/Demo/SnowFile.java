package Demo;
/* Отображение текстового файла.
Чтобы использовать эту программу, укажите
имя файла, который хотите просмотреть.
Например, чтобы просмотреть файл TEST.TXT,
используйте следующую командную строку:
java ShowFile TEST.TXT
*/
import java.io.*;
public class SnowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin = null;
// Следующий код открывает файл, читает символы, пока не
// встретится EOF, а затем закрывает файл в блоке finally,
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("Ошибка I/O: " + e);
        } finally {
// Закрыть файл в любом случае,
            try {
                if (fin != null) fin.close();
            } catch(IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}