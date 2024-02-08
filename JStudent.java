import java.util.ArrayList;

/**
 * The class JStudent is a student at a school with a name, ID number, list of classes, list of grades grades, who can add classes, drop classes, generate a class schedule, and generate a grade report.
 * @author Evan Cheng
 */

public class JStudent {
    /** String specifying name of instructor. */
    String name;
    /** int specifying ID number of instructor. */
    int ID;
    /** JClass ArrayList of classes assigned to the instructor. */
    private ArrayList<JClass> classes;
    /** Float ArrayList of grades corresponding to classes. */
    private ArrayList<Float> grades;

    /**
     * Returns a JStudent.
     */
    public JStudent() {
    }

    /**
     * Adds a class to the student's classes ArrayList.
     * @param c The JClass being assigned.
     */
    public void addClass(JClass c) {
    }

    /**
     * Drops a class in the student's classes ArrayList.
     * @param c The JClass being removed.
     */
    public void dropClass(JClass c) {
    }

    /**
     * Assigns a grade to a student in the instructor's class.
     * @param s The JStudent the grade is being assigned to.
     * @param g The grade value being assigned to the student.
     */
    public void assignGrade(JStudent s, float g) {
    }

    /**
     * Returns the schedule of each class and their times for this student.
     * @return The schedule of each class and their times for this student.
     */
    public String generateSchedule() {
    }

    /**
     * Returns the grades for each of the student's class.
     * @return The grades for each of the student's class.
     */
    public String generateReport() {
    }
}
