package Demo;//демонстрация области видимости блока

public class Scope {
    public static void main(String[] args) {
        int x;     //эта переменная видна всему коду внутри медода mine

        x = 10;
        if(x == 10){    // начало новой области видимости
            int y = 20; // известной только этому блоку

                //и х и у известны в этой области видимости
            System.out.println("x и y " + x + " " + y);
        }
        //y = 100 // ошибка! у не известна в этой области видимости
        // переменная х известна и здесь
        System.out.println("x равна " + x);
    }
}
