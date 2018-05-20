package HW9;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class LRUCeche {
    private final int INITIAL_CAPACITY;
    private final ArrayDeque<LRUNode> nodes; //двусторонняя очередь которая будет будет убирать елемент вошедший первым
    private final Map<Integer, LRUNode> cache; //интерфейс для нашего кеша
            //не могу вообразить как написаное выше выглядит
    public LRUCeche(int capacity) {  // консруктор который задет размер кеша
        this.INITIAL_CAPACITY = capacity;
        this.nodes = new ArrayDeque<>(INITIAL_CAPACITY);
        this.cache = new HashMap<>();
    }

    public int get(int key) {
        LRUNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        nodes.remove(node);
        nodes.addFirst(node);
        return node.value;
    }

    public void put(int key, int value) { //здесь мы заносим значения в кеш
        LRUNode node = cache.get(key); //передаем ноде адрес ячейки

        if (node != null) { //если в ноде не пустая ячейка
            node.value = value; //заносим туда переданое значение
            nodes.remove(node); //очищаем чейчку
            nodes.addFirst(node); // заносим наше значение в начало списка
        } else {
            if (cache.size() >= INITIAL_CAPACITY) { //если выходим за пределы или равно  размеру кеша
                LRUNode last = nodes.pollLast(); //берем последнюю ячейку и очищаем ее
                cache.remove(last.key, last); // так как в ней ххраниться самое первое вощедщее значение
            }
            node = new LRUNode(key, value);
            nodes.addFirst(node); //и добавляем новое значение в начало списка
        }

        cache.put(key, node); // а тут просто заносим значение в кеш
    }

    private class LRUNode { // этот клас будет хранит значения в двусторонней очереди

        private int key;
        private int value;

        LRUNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LRUCeche lruCeche = new LRUCeche(2);
        lruCeche.put(1,100);
        lruCeche.put(2,200);
//        lruCeche.get(1);
// если ячейку по ключу 1 вызвать то ячейка по ключу 2 затреться, потому как она статус 1я попадет в начало списка

        lruCeche.put(3,300);


            System.out.println(lruCeche.get(1));
            System.out.println(lruCeche.get(2));
            System.out.println(lruCeche.get(3));



    }
}
