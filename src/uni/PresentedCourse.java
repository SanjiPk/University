package uni;

import java.util.ArrayList;

public class PresentedCourse {
    public int id;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();
    public int courseID;
    public int professorID;
    public int capacity;
    public ArrayList<Integer> studentID = new ArrayList<>();

    public PresentedCourse(int courseID, int professorID, int maxCapacity) {
        this.courseID = courseID;
        this.professorID = professorID;
        this.capacity = maxCapacity;
        presentedCourseList.add(this);
        this.id = presentedCourseList.size();
    }

    public static PresentedCourse findById(int id) {
        for (PresentedCourse p : presentedCourseList) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }

    public void addStudent(int studentID) {
        if (this.studentID.size() >= this.capacity)
            this.studentID.add(studentID);
        else
            System.out.println("Capacity of class is too full.");
    }
}