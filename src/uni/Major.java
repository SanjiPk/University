package uni;

import java.util.List;

public class Major {
    public int majorID;
    public static List<Major> majorList;
    public String name;
    public final int maxCapacity;
    public int numberOfStudents = 0;

    public Major(String name, int maxStudentNumber) {
        maxCapacity = maxStudentNumber;
        this.name = name;
        majorList.add(Major.this);
        majorID = majorList.size();
    }

    public static Major findById(int id) {
        for (Major major : majorList)
            if (major.majorID == id)
                return major;
        return null;
    }
}