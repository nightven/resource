package HW6.podarok;

import HW6.sladosti.Chocolade;
import HW6.sladosti.Karamel;
import HW6.sladosti.Sladosti;
import HW6.sladosti.Wafell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Podarok implements IPodarok {

    public static void createPodarok(){
        Podarok podarok = new Podarok();

        //Создаем коллекцию(подарок) из выбранных конфет на основании списка конфет
        ArrayList<Sladosti> PodarokNewYear = podarok.setCandyAsPodarok(createListCandy());

        System.out.println("Общий вес подарка: " + getFinalWeight(PodarokNewYear, 0)+ " грамм"); //выводим вес подарка

        //сортируем по количеству сахара в конфетах и выводим отсортированый список
        System.out.println("\nДавай отсортируем подарок по количеству сахара в конфетах\n");
        Collections.sort(PodarokNewYear, new SortBySugar());
        for (int i = 0; i < PodarokNewYear.size(); i++) {
            System.out.println(PodarokNewYear.get(i).toString("sugar"));
        }

        //а теперь найдем конфетку в заданом диапазоне стоимости конфет
        System.out.println("Давай найдем конфетку в диапазоне содержания сахара.\n Введи в каждой строке по одной " +
                "цифре  от 9 до 16");
        podarok.findElementSugar(PodarokNewYear);

    }

    //метод который создает список конфет для дальнейшего выбора их пользователем
    public static ArrayList<Sladosti> createListCandy() {
    ArrayList<Sladosti> list = new ArrayList<Sladosti>();
    Sladosti karamel = new Karamel("\"Бим Бом\" Апельсин", 49.86, 25, 10);
    Sladosti karamel2 = new Karamel("\"Бим Бом\" Грейпфрут", 49.86, 26, 10.3);
    Sladosti karamel3 = new Karamel("\"Бим Бом\" Вишня", 49.86, 25, 9.8);
    Sladosti chocolade = new Chocolade("\"Крокант\" с измельченным миндалем", 145, 40, 16);
    Sladosti chocolade2 = new Chocolade("\"Инжир в шоколаде\" ручной работы", 450, 35, 12.5);
    Sladosti chocolade3 = new Chocolade("\"Pralines\" с молочным кремом и злаками", 350, 39, 15.8);
    Sladosti wafell = new Wafell("\"Дюймовочка\" вафельная конфета", 64, 35, 12.3);
    Sladosti wafell2 = new Wafell("\"Четыре мушкетера\" вафельная конфета", 58.6, 38, 14);
    Sladosti wafell3 = new Wafell("\"ЛЮБИМАЯ АЛЁНКА\" вафельная конфета", 115.5, 42, 15);
        list.add(karamel);
        list.add(karamel2);
        list.add(karamel3);
        list.add(chocolade);
        list.add(chocolade2); // где-то видел это можно зделать через asList помоему, не подскажешь как?
        list.add(chocolade3);
        list.add(wafell);
        list.add(wafell2);
        list.add(wafell3);
            return list;

//        for (int i = 0; i < list.size(); i++)
//            System.out.println(list.get(i).toString());
    }


    //метод который заносит конфеты в подарок. Выбор делает пользователь через консоль.
    public ArrayList<Sladosti> setCandyAsPodarok(ArrayList<Sladosti>list){
        ArrayList<Sladosti> box = new ArrayList<>();
        Pattern y = Pattern.compile("^(Д|д)(А|а)$");

        System.out.println("Давай выберем какие конфеты положить в подарок.(отвечать да либо нет)");
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString() + " ложим в подарок ?");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNext(y)) box.add(list.get(i));
        }
        System.out.println("\bИ так у нас в подарке такие конфеты: ");
        for (int j = 0; j < box.size(); j++) {
            System.out.println(box.get(j).toString(1));
        }

        return box;
    }

    //метод котрый подсумирует общий вес детского подарка
    public static double getFinalWeight(ArrayList<Sladosti> podarokBox, int sum){
        for (Sladosti s:podarokBox
                ) {
            sum += s.getWeight();
        }
        return sum;
    }

    //метод принимает с консоли 2 параметра и вызывает метод который находит нам конфетку в указаном диапазоне
    public void findElementSugar(ArrayList<Sladosti>PodarokBox){
        Scanner scanner = new Scanner(System.in); // как я понял сюда надо еще проверку на то являеться ли введеныц
        double a = scanner.nextDouble();            //символ числом, а то ошибку выдает, о, можено же исключение сделать?
        double b = scanner.nextDouble();
        scanner.close();
        StringBuilder item = findCandyBySugar(a, b, PodarokBox);
        System.out.println("\nВот твоя конффетка: " + item.toString());
    }
    //медот ищет  и конфетку в заданом диапазорне и возвращает строку
    public StringBuilder findCandyBySugar(double a, double b, ArrayList<Sladosti>PodarokBox) {
        StringBuilder candy = new StringBuilder();
        for (Sladosti vault : PodarokBox) {
            if ((vault.getSugar() >= a && vault.getSugar() <= b) || (vault.getSugar() >= b && vault.getSugar() <= a)) {
                candy.append(vault.getName()).append("(").append(vault.getType()).append("), ");
            }
        }
        if (a < 0 || b < 0) {

            throw new IllegalArgumentException("Проверь введеные данные, они не могут быть отрицательными.");
        }
        return candy;
    }


}

