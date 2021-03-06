package TenthWeek.prac8;

import java.io.*;
import java.util.*;

public class Prac10 {
    private String fileName = "c:\\Temp\\phone.txt";
    private HashMap<String, String> phoneMap = new HashMap<String, String>();


    private void readPhoneFile() {
        try {
            Scanner scanner = new Scanner(new FileReader(new File(fileName)));
            while(scanner.hasNext()) {
                String name = scanner.next();
                String num = scanner.next();
                phoneMap.put(name, num);
            }
            scanner.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("총 " + phoneMap.size() + "개의 전화번호를 읽었습니다.");
    }

    private void processQuery() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("이름>> ");
            String name = scanner.next();
            if(name.equals("그만"))
                break;
            String tel = phoneMap.get(name);
            if(tel == null) {
                System.out.println("찾는 이름이 없습니다.");
            }
            else{
                System.out.println(tel);
            }
        }
        scanner.close();
    }

    public void run() {
        readPhoneFile();
        processQuery();
    }

    public static void main(String[] args) {
        Prac10 phoneNum = new Prac10();
        phoneNum.run();
    }
}
