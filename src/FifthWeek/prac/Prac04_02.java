package FifthWeek.prac;

import FourthWeek.ex.Rectangle;

public class Prac04_02 {
    public int x, y, width, height;

    public Prac04_02(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square(){
        return width*height;
    }

    public void show(){
        System.out.println("("+x+", " + y+ ")에서 크기가 "+width+"X"+height+"인 사각형");
    }

    public boolean contains(Prac04_02 r){
        if(x < r.x && y < r.y)
            if((width+x) > (r.x+r.width) && (height+y) > (r.y+r.height))
                return true;
        return false;
    }
}
