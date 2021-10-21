package SeventhWeek.Ex;

class Point02{
    int x,y;
    public Point02(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point(" + x + ", " + y + ")";
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Point02 p = new Point02(2,3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p+"입니다.");
    }
}
