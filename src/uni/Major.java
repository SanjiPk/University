package uni;

import java.util.*;

public class Major {
    public int id;
    public static ArrayList<Major> majorList = new ArrayList<>();
    public String name;
    public final int capacity;
    public int numberOfStudents = 0;

    public Major(String name, int maxStudentNumber) {
        capacity = maxStudentNumber;
        this.name = name;
        majorList.add(Major.this);
        id = majorList.size();
    }

    public static Major findById(int id) {
        for (Major major : majorList)
            if (major.id == id)
                return major;
        return null;
    }

    public void addStudent() {
        if (numberOfStudents < capacity)
            numberOfStudents++;
        else 
            System.out.println("there isn't enough capacity for another student");
    }
}