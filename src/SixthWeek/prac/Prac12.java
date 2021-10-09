package SixthWeek.prac;

import java.util.Scanner;

abstract class Shape {
    private Shape next;

    public Shape() {
        next = null;
    }

    public void setNext(Shape obj) {
        next = obj;
    }

    public Shape getNext() {
        return next;
    }

    public abstract void draw();
}

class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class GraphicEditor {
    private Shape h, t;
    private Scanner sc;

    public GraphicEditor() {
        h = null;
        t = null;
        sc = new Scanner(System.in);
    }

    public void run() {
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    num = sc.nextInt();
                    insert(num);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치 >> ");
                    num = sc.nextInt();
                    delete(num);
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    System.out.println("beauty을 종료합니다.");
                    sc.close();
                    return;
            }
        }
    }

    public void insert(int draw) {
        Shape grapic;
        switch (draw) {
            case 1:
                grapic = new Line();
                break;
            case 2:
                grapic = new Rect();
                break;
            case 3:
                grapic = new Circle();
                break;
            default:
                System.out.println("다시 입력해 주세요.");
                return;
        }
        if (h == null) {
            h = grapic;
            t = grapic;
        } else {
            t.setNext(grapic);
            t = grapic;
        }
        for(int i = 0; i<10; i++){
            continue;
        }
    }

    public void print() {
        Shape s = h;
        while (s != null) {
            s.draw();
            s = s.getNext();
        }
    }

    public void delete(int num) {
        Shape cur = h;
        Shape tmp = h;
        int i;
        if (num == 1) {
            if (h == t) {
                h = null;
                t = null;
                return;
            } else {
                h = h.getNext();
                return;
            }
        }
        for (i = 1; i < num; i++) {
            tmp = cur;
            cur = cur.getNext();
            if (cur == null) {
                System.out.println("삭제할 수 없습니다.");
                return;
            }
        }
        if (i == num) {
            tmp.setNext(cur.getNext());
            t = tmp;
        } else
            tmp.setNext(cur.getNext());
    }
}

public class Prac12 {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.run();
    }
}
