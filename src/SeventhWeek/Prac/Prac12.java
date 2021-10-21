package SeventhWeek.Prac;

import java.util.Scanner;

class Person03 {
    private int num1, num2, num3;
    public String name;
    public Person03(String name) {
        this.name = name;
    }
    public boolean game() {
        num1 = (int) ((Math.random()*3)+1);
        num2 = (int) ((Math.random()*3)+1);
        num3 = (int) ((Math.random()*3)+1);
        System.out.print("\t"+num1+"  "+num2+"  "+num3+"  ");
        if(num1 == num2 && num2 == num3)
            return true;
        else
            return false;
    }
}


public class Prac12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int num = scanner.nextInt();
        Person03[] person = new Person03[num];
        for(int i=0; i<num; i++) {
            System.out.print((i+1)+"번째 선수 이름>>");
            String name = scanner.next();
            person[i] = new Person03(name);
        }
        String buffer = scanner.nextLine();
        while(true) {
            for(int i=0; i<num; i++) {
                System.out.print("["+person[i].name+"]:<Enter>");
                buffer = scanner.nextLine();
                if(person[i].game()) {
                    System.out.println(person[i].name+"님이 이겼습니다!");
                    scanner.close();
                    return;
                }
                System.out.println("아쉽군요!");
            }
        }
    }
}

