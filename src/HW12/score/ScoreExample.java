package HW12.score;
import java.util.*;



class Product{
    String name;
    double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + cost;
    }
}
public class ScoreExample {

    public static void main(String[] args) {
        Product product1 = new Product("Ручка", 5.5);
        Product product2 = new Product("Карандаш", 2.3);
        Product product3 = new Product("Линейка", 8.0);
        Product product4 = new Product("Тетрадка", 1.5);
        Product product5 = new Product("Резинка", 3.5);

        ArrayList<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);

        Map<String,Integer> basket = new HashMap<>();
        putBasket(product1.name,4);
        putBasket(product3.name,5);

//        Integer p1 = basket.get(product1.name);
//        System.out.println( p1*product1.cost);
    }
    public static void putBasket(String s, Integer i){
        Map<String,Integer> basket2 = new HashMap<>();
        basket2.put(s,i);
//        System.out.println(basket2.get());
    }
}
