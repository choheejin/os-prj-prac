package SecWeek.prac;

import java.util.Scanner;

public class Prac12_2 {
    public static void main(String[] args) {
        System.out.print("연산>>");
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        String op = scanner.next();
        double num2 = scanner.nextDouble();

        switch (op){
            case "+":
                System.out.println(num1+"+"+num2+"의 계산 결과는 "+(num1+num2));
                break;

            case "-":
                System.out.println(num1+"-"+num2+"의 계산 결과는 "+(num1-num2));
                break;

            case "*":
                System.out.println(num1+"*"+num2+"의 계산 결과는 "+(num1*num2));
                break;

            case "/":
                if(num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                else {
                    System.out.println(num1 + "/" + num2 + "의 계산 결과는 " + (num1 / num2));
                break;
                }
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
    }
}
