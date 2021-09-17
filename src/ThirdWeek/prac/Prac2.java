package ThirdWeek.prac;

public class Prac2 {
    public static void main(String[] args) {
        int n[][] ={{1},{1,2,3},{1},{1,2,3,4},{1,2}};

        int size = n.length;
        for(int x =0; x < size; x++){
            for(int y=0; y< n[x].length;y++){
                System.out.print(n[x][y]+" ");
            }
            System.out.println();
        }
    }
}
