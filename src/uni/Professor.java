package uni;

import java.util.*;

public class Professor {
    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<>();
    public int persionID;
    public int majorID;

    public Professor(int persionID, int majorID) {
        this.persionID = persionID;
        this.majorID = majorID;
    }

    public static Professor findById(int ID) {
        for (Professor professor : professorList)
            if (ID == professor.persionID)
                return professor;
        return null;
    }
}