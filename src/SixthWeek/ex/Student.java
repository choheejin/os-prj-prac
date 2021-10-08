package SixthWeek.ex;

public class Student extends Person{
    public void set(){
        age = 30; // defalut
        name = "홍길동"; // public
        height = 175; // protected
        // weight = 99; // weight는 private 필드이므로 접근 불가. 오류 발생
        setWeight(99); // setWeight()를 이용한 간접 접근은 가능
    }
}
