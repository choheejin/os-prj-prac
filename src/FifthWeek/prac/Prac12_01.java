package FifthWeek.prac;

import java.util.Scanner;

public class Prac12_01 {
    public static void main(String[] args) {
        System.out.println("명품콘서트홀 예약 시스템입니다.");

        Prac12_02 S = new Prac12_02();
        Prac12_02 A = new Prac12_02();
        Prac12_02 B = new Prac12_02();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("예약: 1, 조회: 2, 취소: 3, 끝내기 4 >> ");
            int num = scanner.nextInt();

            if(num == 1){
                System.out.print("좌석구분 S(1), A(2), B(3) >> ");
                int gradeNum = scanner.nextInt();
                if(gradeNum == 1){
                    System.out.print("S>> ");
                    S.print();
                    System.out.println();
                    System.out.print("이름>> ");
                    String name = scanner.next();
                    System.out.print("번호>> ");
                    int seat = scanner.nextInt();
                    S.book(name, seat);
                }
                else if(gradeNum == 2){
                    System.out.print("A>> ");
                    A.print();
                    System.out.println();
                    System.out.print("이름>> ");
                    String name = scanner.next();
                    System.out.print("번호>> ");
                    int seat = scanner.nextInt();
                    A.book(name, seat);
                }
                else if(gradeNum == 3){
                    System.out.print("B>> ");
                    B.print();
                    System.out.println();
                    System.out.print("이름>> ");
                    String name = scanner.next();
                    System.out.print("번호>> ");
                    int seat = scanner.nextInt();
                    B.book(name, seat);
                }
                else {
                    System.out.println("오류!");
                }
            }
            else if(num == 2){
                System.out.print("S>> ");
                S.print();
                System.out.println();
                System.out.print("A>> ");
                A.print();
                System.out.println();
                System.out.print("B>> ");
                B.print();
                System.out.println();
                System.out.println("<<<조회를 완료하였습니다. >>>");
            }
            else if(num == 3){
                System.out.print("좌석구분 S(1), A(2), B(3) >> ");
                int gradeNum = scanner.nextInt();
                if(gradeNum == 1){
                    System.out.print("S>> ");
                    S.print();
                    System.out.println();
                    System.out.print("이름>> ");
                    String name = scanner.next();
                    S.cancle(name);
                }
                else if(gradeNum == 2){
                    System.out.print("A>> ");
                    A.print();
                    System.out.println();
                    System.out.print("이름>> ");
                    String name = scanner.next();
                    A.cancle(name);
                }
                else if(gradeNum == 3){
                    System.out.print("B>> ");
                    B.print();
                    System.out.println();
                    System.out.print("이름>> ");
                    String name = scanner.next();
                    B.cancle(name);
                }
                else {
                    System.out.println("오류!");
                }
            }
            else if(num == 4){
                break;
            }
            else System.out.println("오류 발생! 다시 입력해주세요");
        }
    }
}
