public class setCharAtDemo {
    // Демонстрация charAt() и setCharAt().
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("буфер до = " + sb);
        System.out.println("до charAt(1) = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("буфер после = " + sb);
        System.out.println("после charAt(1) = " + sb.charAt(1));
    }
}
