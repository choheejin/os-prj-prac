package FourthWeek.ex;

public class Book02 {
    String title;
    String author;

    void show(){
        System.out.println(title+ " " + author);
    }

    public Book02() {
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public Book02(String t) { // 작가를 알 경우
        this(t, "작자미상");
    }

    public Book02(String t, String a){ // 작가가 미입력되었을 경우
        this.title = t;
        this.author = a;
    }

    public static void main(String[] args) {
        Book02 little = new Book02("어린왕자", "생택쥐페리");
        Book02 chun = new Book02("춘향전");
        Book02 empty = new Book02();
        Book02 bible = new Book02("Bible");

        bible.show();
    }
}
