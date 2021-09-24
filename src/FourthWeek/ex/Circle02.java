package FourthWeek.ex;

public class Circle02 {
    int radius;
    String name;

    public Circle02(){
        radius = 1;
        name = "";
    }

    public Circle02(int r, String n){
        radius = r;
        name = n;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        // radius -> 10, name -> 자바피자
        Circle02 pizza = new Circle02(10, "자바피자");
        System.out.println(pizza.name + "의 면적은 " + pizza.getArea());

        // radius -> 1, name -> 자바도넛
        Circle02 donut = new Circle02();
        donut.name = "자바도넛";
        System.out.println(donut.name+"의 면적은 "+ donut.getArea());
    }
}
