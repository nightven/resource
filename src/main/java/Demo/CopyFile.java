package Demo;
/* Копирование файла.
Для использования этой программы укажите
имена исходного и целевого файлов.
Например, чтобы скопировать файл FIRST.TXT в файл
SECOND.TXT, используйте следующую командную строку:
java CopyFile FIRST.TXT SECOND.TXT
*/
import java.io.*;
public class CopyFile {
    public static void main(String args[]) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
// Сначала убедиться, что указаны имена обоих файлов,
        if (args.length != 2) {
            System.out.println("Использование: CopyFile из в");
            return;
        }
// Копирование файла,
        try {
// Попытка открыть файлы.
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка I/O: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла ввода");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }
}
