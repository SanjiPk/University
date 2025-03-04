package uni;

import java.util.*;

public class Course {
    public int id;
    public static ArrayList<Course> courseList = new ArrayList<>();
    public String title;
    public int unit;

    public Course(String title, int unit) {
        this.title = title;
        this.unit = unit;
    }

    public static Course findById(int id) {
        for (Course course : courseList) {
            if (course.id == id) {
                return course;
            }
        }
        return null;
    }
}