package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/*
Написать метод, который принимает строку времени и который возвращает количество градусов между часовой и
минутной стрелкой (в почасовом направлении)
Метод может принимать строки как в 24 так и в 12 часовом формате, разделенных двоеточием, пример строк:
12:25, 20:12 и т.д.

 */
public class HoursToGradus {

    public static void main(String[] args) {
        System.out.println("Введите время для расчета градуса между стрелками.(Формат ввода 12:45 либо 18:45);");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String string = br.readLine();
            System.out.println("Между срелками " + getAngle(getHourMinutes(string))+ " градусов");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        double angle12 =(hour+(minut/60))*30-minut * 6;
    }


    //метод принимает разбивает строку на часы и минуты
    public static double[] getHourMinutes(String s){
        Pattern pattern = Pattern.compile(":");
        String[] slova = pattern.split(s);
        double[]d = new double[2];
        for (int i = 0; i < slova.length; i++){
            d[i] = Double.parseDouble(slova[i]);
        }return  d;
    }

    //метод высчитывает градус между стрелками
    public static double getAngle(double[]d){
        double hour = d[0];
        double minuts = d[1];
        double agle;
        if(hour <= 12) agle =(hour+(minuts/60))*30-minuts * 6;
        else agle = ((hour+(minuts/60))*30-minuts * 6)-360; //если 24 часовой формат просто отннимем лишний круг
        return agle;
    }
}
