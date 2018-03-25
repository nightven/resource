package Demo;//Сдвиг без учета знака значения byte

public class ByteUShift {
    public static void main(String[] args) {
        char hex [] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xfl;
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0xff) >> 4);
        System.out.println(" b = Ox"
                + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println(" b >> 4 = Ox"
                + hex[(c >>4) & 0x0f] + hex[c & 0x0f]);
        System.out.println(" b >>> 4 = Ox"
                + hex[(d >>4) & 0x0f] + hex[d & 0x0f]);
        System.out.println("(b & Oxff) >> 4 = Ox"
                + hex[(e >>4) & 0x0f] + hex[e & 0x0f]);
    }
}
