package DR3;

public class Ex2_5 {
    private static byte left(byte a, byte s) {
        int x = a & 0xFF;
        int y = s % 8;
        return (byte) ((x << y) | (x >> (8 - y)));
    }
    public static void main(String[] args) {
        byte x = (byte) 130;
        x = left(x,(byte)1 );
        System.out.println(x);
    }
}
