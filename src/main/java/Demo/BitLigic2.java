package Demo;//Демонстрация применения булевых логических операторов.

public class BitLigic2 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b) ;
        boolean q = !a;
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" alb = " + c);
        System.out.println(" a&b = " + d);
        System.out.println(" a^b = " + e);
        System.out.println(" !a&b|a&!b = " + f);
        System.out.println(" !a = " + q);

    }
}
