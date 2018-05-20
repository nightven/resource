package Demo;

public class equalsDemo {
    //Демонстрация применения equals() и equalslgnoreCase().
    public static void main(String[] args) {
        String s1 = "Привет";
        String s2 = "Привет";
        String s3 = "Пока";
        String s4 = "ПРИВЕТ";
        System.out.println(s1 + " эквивалентно " + s2 + " -> " +
                s1.equals(s2));
        System.out.println(s1 + " эквивалентно " + s3 + " -> " +
                s1.equals(s3));

        System.out.println(s1 + " эквивалентно " + s4 + " -> " +
                s1.equals(s4) ) ;
        System.out.println(s1 + " эквивалентно, игнорируя регистр " +
                s4 + " -> " + s1.equalsIgnoreCase(s4));
    }
}
