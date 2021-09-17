package ThirdWeek.prac;

import java.util.Scanner;

public class Prac8 {
    public static void main(String[] args) {
        System.out.print("정수 몇 개? ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int intArray[] = new int[num];

        for(int i = 0; i < num; i++){
            intArray[i] = (int)(Math.random()*100 + 1);
            for(int j =0; j<i;j++){
                if(intArray[i] == intArray[j]){
                    i--;
                    break;
                }
            }
        }

        for(int i = 0; i < num; i++){
            if(i%10==0 && i!=0)
                System.out.print("\n"+intArray[i]+" ");
            else
                System.out.print(intArray[i]+" ");
        }

        scanner.close();
    }
}
