package SixthWeek.prac;

interface Shape02{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("---다시 그립니다. ");
        draw();
    }
}

class Circle02 implements Shape02{
    private int radius;
    protected Circle02(int radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + radius+ "인 원입니다.");
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }
}

class Oval implements Shape02{
    private int radius1, radius2;
    protected Oval(int radius1, int radius2){
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public void draw() {
        System.out.println(radius1 + "X" + radius2 + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return PI*radius1*radius2;
    }
}

class Rect02 implements Shape02{
    private int height, weight;
    protected Rect02(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void draw() {
        System.out.println(height + "X" + weight + "크기의 사각형 입니다.");
    }

    @Override
    public double getArea() {
        return height*weight;
    }
}

public class Prac14 {
    public static void main(String[] args) {
        Shape02 [] list = new Shape02[3];

        list[0] = new Circle02(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect02(10, 40);

        for(int i =0; i<list.length; i++)
            list[i].redraw();
        for(int i =0; i<list.length; i++)
            System.out.println("면적은 " + list[i].getArea());
    }
}
