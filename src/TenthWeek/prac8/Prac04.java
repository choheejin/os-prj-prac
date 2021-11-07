package TenthWeek.prac8;

import java.io.*;
import java.util.*;

public class Prac04 {
    public static void main(String[] args){
        System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
        try {
            Scanner scanner = new Scanner(new FileReader("c:\\windows\\system.ini"));

            int lineNumber = 1;

            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.printf("%4d", lineNumber++);
                System.out.println(": "+line);
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("입출력 오류가 발생했습니다.");
        }
    }
}
