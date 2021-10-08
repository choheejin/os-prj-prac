package FifthWeek.prac;

public class Prac06_02 {
    private double x, y;
    private int radius;

    public Prac06_02(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show(){
        System.out.println("(" + x +", " + y + ")" + radius);
    }

    public int getRadius() {
        return radius;
    }
}
