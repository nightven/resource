package Lesson6.HW6;

public class Sweets {
    import java.io.PrintStream;

    public class Sweets {
        private	String name;
        private double cost;
        private double weight;
        private  double sugar;
        private String type;

        public Sweets(String name, double cost, double weight, double sugar){
            this.name = name;
            this.cost = cost;
            this.weight = weight;
            this.sugar = sugar;
        }



        public Sweets(){}
        public String toString(){
            return "Конфета:  "+name+", цена за кг:"+cost+"грн";

        }public String toString(int i){
            return "Конфета:  "+name+", цена за конфету: " + cost+"грн"+"\n";
        }

        public String getName() {
            return name;
        }

        public double getCost() {
            cost = (weight/1000)*cost;
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

}
