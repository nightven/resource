//демонстрация времени существования переменной

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for(x = 0; x <3; x++){
            int y = -1; //y инициализация при каждом вхождении в блок
            System.out.println("y  равна " + y);   // эта строка всегда выводид
                                                   // значение  -1

            y = 100;
            System.out.println("y теперь равна " + y);

        }
    }
}
