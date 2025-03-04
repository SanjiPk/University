package  uni;

import base.Person;

import java.util.*;

public class Transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript = new HashMap<>();

    public Transcript(int studentID) {
        this.studentID = studentID;
    }

    public void setGrade(int presentCourseID, double grade) {
        PresentedCourse temp = PresentedCourse.findById(presentCourseID);
        if (temp != null) {
            if (temp.studentID.contains(this.studentID)) {
                transcript.put(presentCourseID, grade);
            }
            else
                System.out.println("Student " + studentID + " does not have this class.");
        }
        else
            System.out.println("there is no class by this id : " + presentCourseID);
    }

    public void printTranscript() {
        Student student = Student.findById(this.studentID);
        Person person = null;
        Course course = null;
        if (student != null)
            person = Person.findById(student.personID);
        if (person != null) {
            System.out.println(person.name);
            for (Map.Entry<Integer, Double> entry : transcript.entrySet()) {
                course = Course.findById(entry.getKey());
                if (course != null)
                    System.out.println(course.title + " : " + entry.getValue());
            }
        }
    }

    public double getGPA() {
        double gpa = 0.0;
        for (Map.Entry<Integer, Double> entry : transcript.entrySet()) {
            Course c = Course.findById(entry.getKey());
            if (c != null)
                gpa += entry.getValue() * c.unit;
        }
        return gpa / transcript.size();
    }
}