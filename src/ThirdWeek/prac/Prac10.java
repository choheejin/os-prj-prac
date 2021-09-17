package ThirdWeek.prac;

public class Prac10 {
    public static void main(String[] args) {
        int array[][] = new int[4][4];
        int count = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                array[i][j] = (int)(Math.random()*10 +1);
            }
        }

        while(true){
            if(count==6)
                break;
            int ranRow = (int)(Math.random()*3);
            int ranCol = (int)(Math.random()*3);
            if(array[ranRow][ranCol] != 0){
                array[ranRow][ranCol] = 0;
                count++;
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(array[i][j]==10)
                    System.out.print(array[i][j] + "  ");
                else
                    System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
