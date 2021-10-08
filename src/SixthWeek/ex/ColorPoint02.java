package SixthWeek.ex;

public class ColorPoint02 extends Point02{
    private String color;

    public ColorPoint02(int x, int y, String color){
        super(x, y); // Point의 생성자 Point(x,y) 호출
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(color);
        showPoint(); // Point 클래스의 showPoint() 호출
    }
}
