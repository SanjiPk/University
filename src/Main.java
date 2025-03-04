import uni.*;
import base.*;

public class Main {
    public static void main(String[] args) {

        Major math = new Major("Math", 45);
        Major english = new Major("English", 76);

        Person sara = new Person("Sara", "1111");
        Person john = new Person("John", "2222");
        Person charlie = new Person("Charlie", "3333");
        Person david = new Person("David", "4444");
        Person alice = new Person("Alice", "5555");

        Student saraStu = new Student(sara.personID, 1403, 1);
        Student johnStu = new Student(john.personID, 1400, 1);
        Student charlieStu = new Student(charlie.personID, 1401, 2);

        Professor davidPro = new Professor(321, 1);
        Professor alicePro = new Professor(123, 2);

        Course mathCourse = new Course("Mathematics 1", 4);
        Course englishCourse = new Course("English", 1);
        Course physicCourse = new Course("Physic", 3);

        PresentedCourse mathP = new PresentedCourse(1, 321, 25);
        PresentedCourse englishP = new PresentedCourse(2, 321, 12);
        PresentedCourse physicP = new PresentedCourse(3, 123, 12);

        mathP.addStudent(saraStu.personID);
        mathP.addStudent(johnStu.personID);

        englishP.addStudent(saraStu.personID);
        englishP.addStudent(charlieStu.personID);
        englishP.addStudent(johnStu.personID);

        physicP.addStudent(charlieStu.personID);

    }
}