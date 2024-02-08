import java.util.ArrayList;

/**
 * The class JInstruc is an instructor at a school with a name, ID number, list of classes, and can assign grades, be assigned classes, and generate a class schedule.
 * @author Evan Cheng
 */

public class JInstruc {
    /** String specifying name of instructor. */
    String name;
    /** int specifying ID number of instructor. */
    int ID;
    /** JClass ArrayList of classes assigned to the instructor. */
    private ArrayList<JClass> classes;


    /**
     * Returns a JInstruc.
     */
    public JInstruc() {
    }

    /**
     * Assigns a class to the instructor, adding it to the classes ArrayList.
     * @param c The JClass being assigned.
     */
    public void assignClass(JClass c) {
    }

    /**
     * Assigns a grade to a student in the instructor's class.
     * @param s The JStudent the grade is being assigned to.
     * @param g The grade value being assigned to the student.
     */
    public void assignGrade(JStudent s, float g) {
    }

    /**
     * Returns the schedule of each class and their times for this instructor.
     * @return The schedule of each class and their times for this instructor.
     */
    public String generateSchedule() {
    }
}
