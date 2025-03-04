package uni;

import java.util.*;

public class Student {
    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personID;
    public final int enteranceYear;
    public int majorID;
    public String studentID;

    public Student(int personID, int entranceYear, int majorID) {
        this.enteranceYear = entranceYear;
        this.personID = personID;
        this.majorID = majorID;
        Major major = Major.findById(majorID);
        major.addStudent();
        setStudentCode(major.numberOfStudents);
    }
    public static Student findById(int id) {
        for (Student student : studentList)
            if (student.id == id)
                return student;
        return null;
    }
    public void setStudentCode(int numberOfStudents) {
        studentID = String.valueOf(enteranceYear) + 
                    String.valueOf(majorID) + String.valueOf(numberOfStudents);
    }
}