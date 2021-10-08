package FifthWeek.prac;

import java.util.Scanner;

public class Prac08_01 {
    public static void main(String[] args) {


        System.out.print("인원수 >> ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        Prac08_02 book[] = new Prac08_02[num];

        for(int i =0; i<num ; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
            String name = scanner.next();
            String tel = scanner.next();
            book[i] = new Prac08_02(name, tel);
        }

        System.out.println("저장되었습니다...");

        while (true){
            System.out.print("검색할 이름 >> ");
            String name = scanner.next();

            if(name.equals("그만")) break;
            else{
                int i = 0;
                for(i =0; i<num ; i++){
                    if(name.equals(book[i].getName())) {
                        System.out.println(name + "의 번호는 " + book[i].getTel() + "입니다.");
                        break;
                    }
                }
                if(i >= num) System.out.println(name + "이 없습니다.");
            }
        }
        scanner.close();
    }
}
