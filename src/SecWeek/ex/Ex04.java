package SecWeek.ex;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        String name = scanner.next(); // 다음 토큰을 문자열로 리턴
        System.out.print("이름은 "+ name+", ");

        String city = scanner.next();
        System.out.print("도시는 "+city+", ");

        int age = scanner.nextInt(); // 다음 토큰을 int 타입으로 리턴
        System.out.print("나이는 "+age+"살, ");

        double weight = scanner.nextDouble(); // 다음 토큰을 double 타입으로 리컨
        System.out.print("체중은 "+weight+"kg, ");

        boolean single = scanner.nextBoolean(); // 다음 토큰을 boolean 타임으로 리턴
        System.out.print("독신 여부는 "+single+"입니다.");

        scanner.close();
    }
}
