public class appendDemo {
    //Демонстрация применения append().
    public static void main(String[] args) {
        String s;
        int a = 423;
        StringBuffer sb = new StringBuffer(40);
        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}
