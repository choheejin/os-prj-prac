package FifthWeek.prac;

public class Prac04_01 {
    public static void main(String[] args) {
        Prac04_02 r = new Prac04_02(2, 2, 8, 7);
        Prac04_02 s = new Prac04_02(5, 5, 6, 6);
        Prac04_02 t = new Prac04_02(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 "+ s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
    }
}
