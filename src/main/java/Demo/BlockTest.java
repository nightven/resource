package Demo;

/*демострация использования блока кода
    назовиде файл именем "Demo.BlockTest.java"
 */
public class BlockTest {
    public static void main(String[] args) {
        int x, y =20;

        for(x = 0; x < 10; x++){
            System.out.println("значение х равно " + x);
            System.out.println("значение y равно " + y);
            y = y - 2;
        }
    }
}
