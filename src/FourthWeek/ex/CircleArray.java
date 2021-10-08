package FourthWeek.ex;

public class CircleArray {
    public static void main(String[] args) {
        Circle03 [] c;
        c = new Circle03[5];

        for(int i = 0; i<c.length; i++){
            c[i] = new Circle03(i);
        }
        for(int i = 0; i<c.length; i++){
            System.out.print((int)(c[i].getArea())+" ");
        }
    }
}



