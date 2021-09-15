package SecWeek.ex;

public class Ex08 {
    public static void main(String[] args) {
        int a = 3, b = 5;

        // condition ? opr2 : opr3
        // condition(T) => opr2
        // condition(F) => opr3
        System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a))); // 3>5 => false => (5-3)
    }
}
