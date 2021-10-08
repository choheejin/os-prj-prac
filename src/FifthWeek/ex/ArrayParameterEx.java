package FifthWeek.ex;

public class ArrayParameterEx {
    static void replaceSpace(char a[]){
        for(int i = 0;i < a.length; i++){
            if(a[i] == ' ') // 공백문자 ','로 대체
                a[i] = ',';
        }
    }

    static void printCharArray(char a[]){
        for(int i=0; i< a.length; i++)
            System.out.print(a[i]);
        System.out.println();
    } // 배열 출력

    public static void main(String[] args) {
        char c[] = {'T','h','i','s', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.'};
        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }
}
