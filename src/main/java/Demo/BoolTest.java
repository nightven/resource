package Demo;//демонстрация использованя значения типа boolean

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равна " + b);

        b = true;
        System.out.println("b равна " + b);

        //значения типа bollean может управлять оператором типа if
        if(b) System.out.println("Это выполняеться.");
        b = false;
        if(b) System.out.println("Это не выполняется.");

        //результаты сравнения значений типа boolean
        System.out.println("10 > 9 равно " + (10 > 9));
    }
}
