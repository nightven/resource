package HW6.sladosti;

public class Sladosti {
        private	String name;
        private double cost;
        private double costOne;
        private double weight;
        private  double sugar;
        private String type;

        public Sladosti(String name, double cost, double weight, double sugar){
            this.name = name;
            this.cost = cost;
            this.weight = weight;
            this.sugar = sugar;
        }




        public String toString(){
            return "Конфета:  "+name+", цена за кг:"+cost+"грн.";

        }public String toString(int i){
            return "Конфета:  "+name+", цена за конфету: " + getCostOne()+"грн"+".\n";
        }
        public String toString(String sugar){
            return "Конфета:  "+name+", количество сахара в конфете: " + getSugar()+".\n";
        }

        public String getName() {
            return name;
        }

        public double getCost() {
            return cost;
        }

        public double getCostOne() {
        return weight/1000*cost;
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


