package FourthWeek.ex;

public class Book {
    String title;
    String author;

    public Book(String t) { // 작가를 알 경우
        title = t;
        author = "작자미상";
    }

    public Book(String t, String a){ // 작가가 미입력되었을 경우
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Book little = new Book("어린왕자", "생택쥐페리");
        Book chun = new Book("춘향전");
        System.out.println(little.title+ " " + little.author);
        System.out.println(chun.title+ " " + chun.author);
    }
}
