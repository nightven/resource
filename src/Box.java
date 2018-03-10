public class Box {
    //Переопределение метода toString() для класса Box.

        double width;
        double height;
        double depth;

        Box(double w, double h, double d){
            width = w;
            height = h;
            depth = d;
        }
        public String toString(){
            return "Размеры " + width + " на " +
                    depth + " на " + height + ".";
        }
    }
    class toStringDemo {
        public static void main(String args[]) {
            Box b = new Box(10, 12, 14);
            String s = "Box b: " + b; // конкатенация объекта Box
            System.out.println(b); // преобразование Box в строку
            System.out.println(s);
        }
    }

