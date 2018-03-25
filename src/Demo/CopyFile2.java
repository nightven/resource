package Demo;
/* Версия программы CopyFile, использующая оператор try-с-ресурсами.
Она демонстрирует управление двумя ресурсами (в данном случае
файлами) в одном операторе try.
*/
import java.io.*;
public class CopyFile2 {
    public static void main(String args[]){
        int i;
// Сначала убедиться, что заданы оба файла,
        if (args.length != 2) {
            System.out.println("Использование: CopyFile из в");
            return;
        }
// Открыть и управлять двумя файлами в операторе try.
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка I/O: " + e);
        }
    }
}
