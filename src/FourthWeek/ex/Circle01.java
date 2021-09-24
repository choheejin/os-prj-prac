package FourthWeek.ex;

public class Circle01 {
    int radius;
    String name;

    public Circle01() { }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle01 pizza = new Circle01();
        pizza.radius = 10;
        pizza.name = "자바피자";
        System.out.println(pizza.name + "의 면적은 " + pizza.getArea());

        Circle01 donut = new Circle01();
        donut.radius = 2;
        donut.name = "자바도넛";
        System.out.println(donut.name+"의 면적은 "+ donut.getArea());
    }
}
