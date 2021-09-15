package SecWeek.ex;

public class Ex06 {
    public static void main(String[] args) {
        // 대입연산자 사용
        int a = 3, b = 3, c =3;
        a += 3;
        b *= 3;
        c %= 2;
        System.out.println("a=" + a + ", b="+b+", c="+c);

        // 증감연산자 사용
        int d = 3;
        a = d++; // a=3, d=4
        System.out.println("a= "+a+", d=" + d);

        a = ++d; // a=5, d=5
        System.out.println("a= "+a+", d=" + d);

        a = d--; // a=5, d=4
        System.out.println("a= "+a+", d=" + d);

        a = --d; // a=3, d=3
        System.out.println("a= "+a+", d=" + d);
    }
}
