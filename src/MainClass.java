
public class MainClass {
    public static void main(String[] args) {
        byte b; // 8 bits -128 127 (2^7 .. 2^7-1)
        short s;//16 bits -32 768 .. 32 767 (2^15 .. 2^15-1)
        int i;//32 bits 2^31 .. 2^31-1
        long l;//64 bits 2^63 .. 2^63-1

        b = 127;
        b++;
        System.out.println(b);
        i = 20/11;
        System.out.println(i);

        float f;//32 bits
        double d;//64 bits

        f = 2345.454656456f;
        d = 2345.454656456;

        System.out.println(f);
        System.out.println(d);

        char c;//16 bits 0 .. 65536
        c = 'e';
        c++;
        System.out.println(c);

        boolean bool;//32 bits
        bool = true;


    }
}
