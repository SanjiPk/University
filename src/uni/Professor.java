package uni;

import java.util.*;

public class Professor {
    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<>();
    public int personID;
    public int majorID;

    public Professor(int personID, int majorID) {
        this.personID = personID;
        this.majorID = majorID;
        professorList.add(this);
        id = professorList.size();
    }

    public static Professor findById(int ID) {
        for (Professor professor : professorList)
            if (ID == professor.id)
                return professor;
        return null;
    }
}