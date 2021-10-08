package SixthWeek.ex;

class Person02 { }
class Student02 extends Person02 { }
class Researcher extends Person02 { }
class Professor extends Researcher { }

public class InstacneOfEx {
    static void print(Person02 p){
        if(p instanceof Person02){
            System.out.print("Person02 ");
        }
        if(p instanceof Student02){
            System.out.print("Student02 ");
        }
        if(p instanceof Researcher){
            System.out.print("Researcher ");
        }
        if(p instanceof Professor){
            System.out.println("Professor ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student02() -> \t");
        print(new Student02());
        System.out.print("new Researcher() -> \t");
        print(new Researcher());
        System.out.print("new Professor() -> \t");
        print(new Professor());
    }
}
