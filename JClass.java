import java.util.ArrayList;

/**
* The class JClass is a class at a school with a class name, lecture hall location, specified class time, list of students, and list of prerequisites.
* @author Evan Cheng
*/

public class JClass {
    /** String specifying class name. */
    private String name;
    /** JLHall specifying lecture hall corresponding to class. */
    private JLHall lecHall;
    /** String specifying class time. */
    private String classTime;
    /** JStudent ArrayList of students in the class. */
    private ArrayList<JStudent> students;
    /** JClass ArrayList of prerequisite classes for this class. */
    private ArrayList<JClass> prereq;


    /**
    * Returns a JClass.
    */
    public JSchool() {
    }

    /**
    * Assigns a lecture hall to this class in the lecHall field.
    * @param l The JLHall being assigned.
    */
    public void assignLHall(JLHall l) {
    }
    
    /**
    * Returns a string array of all the students currently in the class.
    * @return A string array of all the students currently in the class.
    */
    public String generateRoster() {
    }
}
