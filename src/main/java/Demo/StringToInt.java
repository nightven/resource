package Demo;//Переобразование строки в целое число


public class StringToInt {
    public static void main(String[] args) {
        String arg = "71";  //либо 071 или 0x71или 0b1000111
        try {
            int val1 = Integer.parseInt(arg); // возвращает int
            int val2 = Integer.valueOf(arg); // возвращает Integer
            int val3 = Integer.decode(arg); // возвращает Integer
            int val4 = new Integer(arg); /* создает Integer,
                                              для преобразования применяется редко */
        }catch (NumberFormatException e){
            System.out.println("Неверный формат числа" + e);
        }
        /* Обратное образование
            int value = 71;
            String arg1 = Integer.toString(value); // хороший способ
            String arg2 = String.valueOf(value); // хороший способ
            String arg3 = "" + value; // плохой способ
         */

    }
}
