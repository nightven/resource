package Demo;

public class indexOfDemo {
    //Демонстрация использования indexOf() и lastlndexOf().
    public static void main(String[] args) {
        String s = "Now is the time for all good men " +
                "to come to the aid of their country.";
        System.out.println(s);
        System.out.println("indexOf(t) = " +
                s .indexOf('t'));
        System.out.println("всего строк " + s.length());
        System.out.println("lastlndexOf(t) = " +
                s .lastIndexOf('t'));
        System.out.println("indexOf(the) = " +
                s .indexOf("the"));
        System.out.println("lastlndexOf(the) = " +
                s .lastIndexOf("the"));
        System.out.println("indexOf(t, 10) = " +
                s .indexOf('t', 10));
                        System.out.println("lastlndexOf(t, 60) = " +
                                s .lastIndexOf('t', 60));
                                        System.out.println("indexOf(the, 10) = " +

        s .indexOf("the" , 10));
        System.out.println("lastlndexOf(the, 60) = " +
                s .lastIndexOf("the", 60));
    }
}
