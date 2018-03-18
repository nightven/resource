package Lesson6.sladosti;
/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Использовать возможности ООП: классы, наследование, полиморфизм, ин-
капсуляция.
• Каждый класс должен иметь отражающее смысл название и информатив-
ный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении
кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения параметров инициализации можно использовать файлы.

Новогодний подарок.
 1)Определить иерархию конфет и прочих сладостей.
 2)Создать несколько объектов-конфет.
 3)Собрать детский подарок с определением его веса.
 4)Провести сортировку конфет в подарке на основе одного из параметров.
 Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
 */

public class Confection {
    private	String name;
    private double cost;
    private double weight;
    private  double sugar;
    private String type;

    public Confection(String name, double cost, double weight, double sugar){
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.sugar = sugar;
    }



    public Confection(){}
    public String toString(){
        return "Конфета:  "+name+", цена за кг:"+cost+"грн";
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }



}







