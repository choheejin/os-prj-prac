package SecWeek.ex;

public class ex7 {
    public static void main(String[] args) {
        // 비교 연산자 사용
        System.out.println('a' > 'b'); // false
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <= 2 );
        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(!(3 != 2)); // !(true) => false

        // 비교연산자와 논리연산자 사용
        System.out.println((3 > 2) && (3 > 4)); // (true) && (false) => false
        System.out.println((3 != 1) || (-1 > 0)); // (true) || (false) => true
    }
}
