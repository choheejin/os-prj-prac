package SixthWeek.ex;

public class MethodOverridingEx {
    static void paint(Shape p){
        p.draw(); // 동적 바인딩
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }
}
