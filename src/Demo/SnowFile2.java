package Demo;
/* Эта версия программы ShowFile использует оператор try-с-ресурсами,
чтобы автоматически закрыть файл.
Примечание: Этот код требует JDK 7.
*/
import java.io.*;
public class SnowFile2 {
    public static void main(String args[])
    {
        int i;
// Сначала убедиться, что имя файла указано,
        if(args.length != 1) {
            System.out.println("Использование: ShowFile filename");
            return;
        }
// Следующий код использует оператор try-с-ресурсами, чтобы
// открыть файл, а затем автоматически закрыть его, когда блок
// try завершится.
        try(FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1) ;
        } catch(FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch(IOException e) {
            System.out.println("Произошла ошибка I/O");
        }
    }
}
