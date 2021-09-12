package SecWeek.ex;

public class ex9 {
    public static void main(String[] args) {
        // 비트 논리 연산
        short a = (short) 0x55ff;
        short b = (short) 0x00ff;

        System.out.println("[ 비트 연산 결과 ]");
        System.out.printf("%04x\n", (short)(a & b)); // 비트연산자 AND
        System.out.printf("%04x\n", (short)(a | b)); // 비트연산자 OR
        System.out.printf("%04x\n", (short)(a ^ b)); // 비트연산자 XOR
        System.out.printf("%04x\n", (short)(~a)); // 비트연산자 NOT

        System.out.print("\n");

        // 비트 시프트 연산
        byte c = 20; // 0x14
        byte d = -8; // 0xf8

        System.out.println("[ 시프트 연산 결과 ]");
        System.out.println(c << 2); // c를 2비트 왼쪽 시프트
        System.out.println(c >> 2); // c를 2비트 오른쪽 시프트 => 0 삽입
        System.out.println(d >> 2); // d를 2비트 오른쪽 시프트 => 1 삽입
        System.out.printf("%x\n", (d >>> 2)); // d를 2비트 오른쪽 시프트 => 0 삽입
    }
}
