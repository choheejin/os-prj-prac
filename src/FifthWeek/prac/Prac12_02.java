package FifthWeek.prac;

public class Prac12_02 {
    private String grade[];

    public Prac12_02(){
        grade = new String[10];
        for(int i=0; i < grade.length; i++)
            grade[i] = "---";
    }

    public void book(String name, int seat){
        grade[seat-1] = name;
    }

    public void print(){
        for(int i = 0; i< grade.length; i++){
            System.out.print(grade[i] + " ");
        }
    }

    public void cancle(String name){
        int i = 0;
        for(i = 0; i<grade.length; i++){
            if(name.equals(grade[i])){
                grade[i] = "---";
                break;
            }
        }
        if (i >= grade.length)
            System.out.println("없는 이름입니다.");
    }
}
