package Lesson6.podarok;

import Lesson6.sladosti.Chocolade;
import Lesson6.sladosti.Sweets;
import Lesson6.sladosti.Karamel;
import Lesson6.sladosti.Wafell;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Podarok {


        public  static void createPodaroc(){
            Podarok podarok = new Podarok();
            ArrayList<Sweets>Box = podarok.createFirstCollection();
        //    System.out.println("Финальная цена подарка");
        //    System.out.println("В подарке больше всего сахара в конфете: ");

            System.out.println("Отсортируем их по стоимости");
            SortByCost(Box);
        }
        /*
        Обьедененный метод который создает конфеты и на основе созданой колекции конфет отбирает кикие нужно ложить в
        подарок узнавая это у пользователя
         */
        public ArrayList<Sweets> createFirstCollection(){
        ArrayList<Sweets> list = new ArrayList<Sweets>();
            Sweets karamel = new Karamel("\"Бим Бом\" Апельсин", 49.86, 25, 10);
            Sweets karamel2 = new Karamel("\"Бим Бом\" Грейпфрут", 49.86, 26, 10.3);
            Sweets karamel3 = new Karamel("\"Бим Бом\" Вишня", 49.86, 25, 9.8);
            Sweets chocolade = new Chocolade("\"Крокант\" с измельченным миндалем", 145, 40, 16);
            Sweets chocolade2 = new Chocolade("\"Инжир в шоколаде\" ручной работы", 450, 35, 12.5);
            Sweets chocolade3 = new Chocolade("\"Pralines\" с молочным кремом и злаками", 350, 39, 15.8);
            Sweets wafell = new Wafell("\"Дюймовочка\" вафельная конфета", 64, 35, 12.3);
            Sweets wafell2 = new Wafell("\"Четыре мушкетера\" вафельная конфета", 58.6, 38, 14);
            Sweets wafell3 = new Wafell("\"ЛЮБИМАЯ АЛЁНКА\" вафельная конфета", 115.5, 42, 15);
            list.add(karamel);
            list.add(karamel2);
            list.add(karamel3);
            list.add(chocolade);
            list.add(chocolade2);
            list.add(chocolade3);
            list.add(wafell);
            list.add(wafell2);
            list.add(wafell3);

//        for (int i = 0; i < list.size(); i++)
//            System.out.println(list.get(i).toString());

        ArrayList<Sweets> box = new ArrayList<>();
        Pattern y = Pattern.compile("^(Д|д)(А|а)$");

        System.out.println("Давайте выберем какие конфеты положить в подарок.(отвечать да либо нет)");
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString() + " ложим в подарок ?");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNext(y)) box.add(list.get(i));
            }
            System.out.println("\bИ так у нас в подарке такие конфеты: ");
           for (int j = 0; j < box.size(); j++) {
               System.out.println(box.get(j).toString());
            }
            return box;
        }


       }













