package Demo;

import java.io.*;

public class UseTrim {
    //Использование trim() для обработки команд,
    public static void main(String[] args) throws IOException{
            // Создается BufferedReader с использованием System.in

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            System.out.println("Введите 'стоп' для завершения.");
            System.out.println("Введите штат: ");
            do {
                str = br.readLine();
                str = str.trim(); // удалить пробелы
                if(str.equals("Иллинойс"))
                    System.out.println("Столица - Спрингфилд.");
                else if(str.equals("Миссури"))
                    System.out.println("Столица — Джефферсон-сити.");
                else if(str.equals("Калифорния"))
                    System.out.println("Столица- Сакраменто.");
                else if(str.equals("Вашингтон"))
                    System.out.println("Столица - Олимпия.");

            } while(!str.equals("стоп"));
        }
    }

