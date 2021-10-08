package FifthWeek.prac;

public class Prac02_02 {
    private int math;
    private int science;
    private int english;

    public Prac02_02(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int average(){
        return (math + science + english)/3;
    }
}
