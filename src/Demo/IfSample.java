package Demo;

/*демонстрация применения оператора if
   назовите файл "Demo.IfSample.java"
 */
public class IfSample {
    public static void main(String[] args) {
        int x = 10, y = 20;

        if(x < y) System.out.println("х меньше у");

        x = x * 2;
        if(x == y) System.out.println("х теперь равна у");

        x = x * 2;
        if(x > y) System.out.println("х теперь больше у");

        //этот оператор не будет ничего отображать
        if(x == y) System.out.println("вы не увидите это");
    }
}
