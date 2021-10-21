package SeventhWeek.Prac;

import java.util.Scanner;

class Person02 {
    private int num1, num2, num3;
    public String name;
    public Person02(String name) {
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


public class Prac10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1번째 선수 이름>>");
        String name = scanner.next();
        Person02 person1 = new Person02(name);
        System.out.print("2번째 선수 이름>>");
        name =scanner.next();
        Person02 person2 = new Person02(name);
        String buffer = scanner.nextLine();
        while(true) {
            System.out.print("["+person1.name+"]:<Enter>");
            buffer = scanner.nextLine();
            if(person1.game()) {
                System.out.println(person1.name+"님이 이겼습니다!");
                break;
            }
            System.out.println("아쉽군요!");
            System.out.print("["+person2.name+"]:<Enter>");
            buffer = scanner.nextLine();
            if(person2.game()) {
                System.out.println(person2.name+"님이 이겼습니다!");
                break;
            }
            System.out.println("아쉽군요!");
        }
        scanner.close();
    }
}
