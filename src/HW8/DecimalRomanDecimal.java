package HW8;
/*
Создать класс с двумя статическими методами перевода из десятичной системы счисления в римскую и обратно.

public static String decimal2Roman(int x) { ... }
public static int roman2Decimal(String s) { ... }

Рабочий диапазон методов - от 1 до 100 включительно.
Работу методов продемонстрировать так:
DECIMAL ==decimal2Roman==> ROMAN ==roman2Decimal==> DECIMAL
1 ====> I ====> 1
2 ====> II ====> 2
3 ====> III ====> 3
4 ====> IV ====> 4
5 ====> V ====> 5
...
94 ====> XCIV ====> 94
95 ====> XCV ====> 95
96 ====> XCVI ====> 96
97 ====> XCVII ====> 97

 */

public class DecimalRomanDecimal {

    public static String[] arrayArab = {"1", "4", "5", "9", "10", "40", "50", "90", "100", "400", "500", "900", "1000"};
    public static String[] arrayRoman = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

    public static void main(String[] args) {

        System.out.println(1 + "===>" + arabToRoman(1) + "===>" + romanToArab(arabToRoman(1)));
        System.out.println(2 + "===>" + arabToRoman(2) + "===>" + romanToArab(arabToRoman(2)));
        System.out.println(5 + "===>" + arabToRoman(5) + "===>" + romanToArab(arabToRoman(5)));
        System.out.println(9 + "===>" + arabToRoman(9) + "===>" + romanToArab(arabToRoman(9)));
        System.out.println(19 + "===>" + arabToRoman(19) + "===>" + romanToArab(arabToRoman(19)));
        System.out.println(29 + "===>" + arabToRoman(29) + "===>" + romanToArab(arabToRoman(29)));

    }
        //метод переводит арабские в римские
    public static String arabToRoman(int number) {
        String result = "";
        int i = arrayArab.length - 1;
        if (number <= 0) {
            result = "";
        } else {
            while (number > 0) {
                if (number >= Integer.parseInt(arrayArab[i])) {
                    result += arrayRoman[i];
                    number -= Integer.parseInt(arrayArab[i]);
                } else {
                    i--;
                }
            }
        }
        return result;
    }
        // метод переводит римские в арабские
    public static int romanToArab(String str) {

        str = str.intern() + "  ";

        int ret = 0;
        int i = arrayArab.length - 1;
        int pos = 0;
        while(i >= 0 && pos <= (str.length()) )
        {
            String compare1 = str.substring(pos,pos+arrayRoman[i].length());
            if(compare1.equals(arrayRoman[i]))
            {
                ret += Integer.parseInt(arrayArab[i]);
                pos += arrayRoman[i].length();
                if (i == 0) {
                    i = arrayArab.length - 1;
                }
            }
            else
            {
                i--;
            }

        }
        return ret;
    }

}
