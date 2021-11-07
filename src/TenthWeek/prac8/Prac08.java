package TenthWeek.prac8;

import java.io.*;

public class Prac08 {
    public static void main(String[] args) {
        File file = new File("c:\\");
        File [] files = file.listFiles();

        long max = 0;
        File fileName =null;

        for(int i=0; i<files.length; i++) {
            File f = files[i];
            if(!f.isFile())
                continue;

            long size = f.length();
            if(max < size) {
                max = size;
                fileName = f;
            }
        }

        if(fileName == null)
            System.out.println("파일은 없습니다");
        else
            System.out.println("가장 큰 파일은 " + fileName.getPath() + " " + max + "바이트");
    }
}
