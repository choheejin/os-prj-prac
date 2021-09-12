package SecWeek.ex;

public class ex3 {
    public static void main(String[] args) {
        byte b = 127; // int 타입은 byte 로 자동 변환이 불가능하다. (큰 타입이 작은 타입으로 변환되기 때문)
        int i = 100;

        System.out.println(b + i);
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println((char)0x12340041);
        System.out.println((byte)(b+i));
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }
}
