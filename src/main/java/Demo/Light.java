package Demo;

/*вычисление растояния проходимого светом,
    с применением переменных типа long.
 */
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //приблизительная скорость света в миляз за секунду
        lightspeed = 186000;

        days = 1000; // указание количества дней

        seconds = days * 24 * 60 * 60; //переобразование в секунды

        distance = lightspeed * seconds; //вычисление растояния

        System.out.print("за " + days + " дней");
        System.out.print(" свет пройдет около ");
        System.out.println(distance + " миль");

    }
}
