package TenthWeek.prac8;

import java.io.*;

public class Prac02 {
    public static void main(String[] args) {
        BufferedReader fr = null;
        File fin = new File("c:\\Temp\\phone.txt");
        try {
            fr = new BufferedReader(new FileReader(fin));
            System.out.println(fin.getPath() + "를 출력합니다.");

            while(true) {
                String line = fr.readLine();
                if(line == null)
                    break;
                System.out.print(line+"\n");
            }

            fr.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
