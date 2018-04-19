package HW12.score;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*1. Реализовать хранение корзины товаров в хеш-таблице. В качестве ключа использовать информацию о товаре (подумать,
 что именно должно использоваться в качестве ключа), а в качестве значения – количество единиц товара в корзине.
        1.1. Реализовать консольный интерфейс для интернет магазина. Пользователь должен иметь возможность:
        - вывести список товаров;
        - добавить товар в корзину;
        - просмотреть содержимое корзины;
        - купить все товары из корзины. (Оформить заказ). При этом надо вывести общую сумму заказа;
        - просмотреть информацию о 5 последних товарах, которые были добавлены в корзину во всех сеансах покупки. (Один
         список на все покупки. Реализовать через LinkedHashMap)

        2. Добавить к магазину возможность делать заказ. Если пользователь делает заказ, то информация о заказе
        заносится в TreeMap. В качестве ключа используется дата и время заказа (пока вводить с консоли), а в качестве
        значения – список заказанных товаров.
        2.1. Реализовать просмотр списка заказов за заданный период времени.
        2.2. Реализовать выбор заказа по ближайшей дате (например, пользователь указывает актуальные год, месяц, день,
         и нулевые часы и минуты, когда был сделан заказ).
*/


class Product{
   private String name;
   private double cost;

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;

    }


    @Override
    public String toString() {
        return  name + ", " + cost + "грн";
    }
}
public class ScoreExample {

    public static void main(String[] args) throws ParseException {
        double finalCost = 0;
        int menuItem;
        int it = 4;
        List list = new List();
        Basket bsk = new Basket();
        SimpleLRUCache<String, Integer> simpl = new SimpleLRUCache<>(5);
        TreeMap<Date, String> orders = new TreeMap<>();
        Product product1 = new Product("Ручка", 5.5);
        Product product2 = new Product("Карандаш", 2.3);
        Product product3 = new Product("Линейка", 8.0);
        Product product4 = new Product("Тетрадка", 1.5);
        Product product5 = new Product("Резинка", 0.75);
        list.setList(product1);
        list.setList(product2);
        list.setList(product3);
        list.setList(product4);
        list.setList(product5);
        menu(0);
        Scanner sc = new Scanner(System.in);

        while ((menuItem = sc.nextInt()) != 9) {
            menu(menuItem);
            switch (menuItem){
                case 1 :
                    list.printList(); //вызов списка товаров
                    System.out.println("0 - возврат в основное меню");
                    break;

                case 2: //ложим товары в корзину
                    boolean b = true;
                    String regx = ",";
                    int order;
                    System.out.println("Выберите товар который хотите добавить в корзину\n" +
                            "Введите номер товара и через запятую количество едениц товара\n" +
                            "В одной строке 1 вид товара, ддля подтверждения жмите кл. Enter\n" +
                            "Для возврата в меню введите  0");
                    list.printList();
                    Scanner scanner = new Scanner(System.in);
                    while (b) {
                        String[] s = scanner.nextLine().split(regx, 2);
                        order = Integer.parseInt(s[0]);
                        if (order == 0) {
                            b = false;
                            menu(0);

                        }
                        if (order == 1) {
                            bsk.setBascket(product1.getName(), Integer.parseInt(s[1]));
                            finalCost += (product1.getCost() * Integer.parseInt(s[1]));// сразу обсчитываем цену
                            simpl.put(product1.getName(),Integer.parseInt(s[1])); //заносим товар в кеш который хранит 5 последних
                        }
                       // System.out.println(bsk.bascket);
                        if (order == 2){
                            bsk.setBascket(product2.getName(), Integer.parseInt(s[1]));
                            finalCost += (product1.getCost() * Integer.parseInt(s[1]));
                            simpl.put(product1.getName(),Integer.parseInt(s[1]));
                        }
                        if (order == 3){
                            bsk.setBascket(product3.getName(), Integer.parseInt(s[1]));
                            finalCost += (product1.getCost() * Integer.parseInt(s[1]));
                            simpl.put(product1.getName(),Integer.parseInt(s[1]));
                        }
                        if (order == 4){
                            bsk.setBascket(product4.getName(), Integer.parseInt(s[1]));
                            finalCost += (product1.getCost() * Integer.parseInt(s[1]));
                            simpl.put(product1.getName(),Integer.parseInt(s[1]));
                        }
                        if (order == 5){
                            bsk.setBascket(product5.getName(), Integer.parseInt(s[1]));
                            finalCost += (product1.getCost() * Integer.parseInt(s[1]));
                            simpl.put(product1.getName(),Integer.parseInt(s[1]));
                        }

                    }
                    break;


                case 3: // подменю просмотра покупок
                    int menuID;
                    System.out.println("1 - Просмотр корзины\n" +
                            "2 - Оплатить  товар с корзины\n" +
                            "3 - Последние 5 товаров\n" +
                            "4 - Просмотр покупо за период\n" +
                            "5 - Просмотр покупок по ближайшей дате" +
                            "0 - Возврат в меню");
                    Scanner scanner1 = new Scanner(System.in);
                    while ((menuID = scanner1.nextInt()) != 0) {
                        if (menuID == 0) menu(0);

                        if (menuID == 1){ bsk.getBasket();
                        System.out.println("Финальная стоимость: " + finalCost + "грн");
                    }

                        if(menuID == 2){ //опаличиваем товар и заносим его в orders оплоченых товаров
                            for (String key: bsk.bascket.keySet()
                                 ) {
                                Date date = new Date();
                                orders.put(date,key);

                            }
                            bsk.bascket = new HashMap<>(); //обнуляем корзину
                            finalCost = 0; //обнуляем стоимость корзины
                            System.out.println("Тоавар оплачен");
//                            for (LocalDateTime key:orders.keySet()
//                                 ) {
//                                System.out.println(key + " " + orders.get(key));
//                            }
                        }

                        if(menuID == 3)

                            for (Date key : orders.keySet()
                                    ) {
                                System.out.println(key + " " + orders.get(key));
                                it--;
                                if (it == 0)break;
                            }

                        if (menuID == 4){
                            System.out.println("Введите дату в 1й стоке с какого перида\n" +
                                    "Во второй строке конеччный период\n" +
                                    "Формат даты yyyy/MM/dd");
                            Scanner dateScan = new Scanner(System.in);
                            String dateStart = dateScan.nextLine();
                            String dateFinish = dateScan.nextLine();
                            DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//                             format.parse(string)
                             orders.subMap(format.parse(dateStart),format.parse(dateFinish));

                        }
                    }

                    break;

                case 9 : sc.close();
                    break;
            }
        }

    }


    /*
    Метод, производит навигацию по основному меню.
     */
    public static void menu(int i){


        switch (i) {
            case 0 :System.out.println("1 - Список товаров\n" +
                    "2 - Добавить товар в корзину\n" +
                    "3 - Просмотр заказов\n" +
                    "9 - Exit");
            break;
        }
    }


    /*
    Этот клас содержит список товаров и может их выводить на консоль
     */
    public static class List{
        int id = 1;
        ArrayList<Product>list = new ArrayList<>();
        //помещаем товар в список
        public void setList(Product p){
            list.add(p);
        }
        //даный метод выводит список из наших товаров
        public void printList(){
            Iterator<Product>iterator = list.iterator();
            while (iterator.hasNext()){
                System.out.println(id + " - " + iterator.next());
                id++;
            }
            id = 1;
        }
    }


    /*
    В этом класе содержиться корзина с заказами. Заказы можно выводить на консоль.
     */
      public static class Basket {
          ScoreExample scExemple = new ScoreExample();
        Map<String, Integer> bascket = new HashMap<>();
        //помещаем елементы в корзину
        public void setBascket(String s, Integer i) {
            bascket.put(s, i);
        }

        //метод выводит елементы помещенные в корзину
        public void getBasket() {
            if(bascket.isEmpty()) System.out.println("Коорзина пустая");
            else for (String key : bascket.keySet()
                    ) {
                System.out.println(key + ", " + bascket.get(key));

        }

        }
    }
    /*
    Кеш, который хранит последние 5 покупок
     */
    public static class SimpleLRUCache<K, V> extends LinkedHashMap<K,V>{
          private final int capacity; //размер кеша

    /*
    Вызываем констркутор, в котором указываем размер конструктора по умолчанию на 1 больше, чтоы не было коллизии,
    Лоадфактор ставим больше 1 чтобы коллекция не расширялась. И указываем значчению true для порядка доступа чтобы он
    сохранял порядок согласно частоте доступа
     */
        public SimpleLRUCache(int capacity){
              super(capacity+1,1.1f, true);
              this.capacity = capacity;
          }
    /*
    Переопредиляем метод removeEldestEntry, чтобы он удалял елементы с найменьшим доступом при заполнении коллекции
     */
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return this.size() > capacity;
        }
    }

}

