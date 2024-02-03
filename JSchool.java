import java.util.ArrayList;

/**
* The class JSchool is a collection of classes, lecture halls, instructors, and students at a college.
* @author Evan Cheng
*/

public class JSchool {
    /** ArrayList of classes at the school. */
    ArrayList<JClass> classes = new ArrayList<>();
    /** ArrayList of lecture halls at the school. */
    ArrayList<JLHall> lecHalls = new ArrayList<>();
    /** ArrayList of instructors at the school. */
    ArrayList<JInstruc> instructors = new ArrayList<>();
    /** ArrayList of students at the school. */
    ArrayList<JStudent> students = new ArrayList<>();


    /**
    * Returns a JSchool.
    */
    public JSchool() {
    }

    /**
    * Adds a new JClass to the classes ArrayList.
    * @param c The JClass being added.
    */
    public void createClass(JClass c) {
    }
    
    /**
    * Removes the JClass from the classes ArrayList.
    * @param c The JClass being removed.
    */
    public void deleteClass(JClass c) {
    }

    /**
    * Adds a new JLHall to the lecture hall ArrayList.
    * @param l The JLHall being added.
    */
    public void createLHall(JLHall l) {
    }

    /**
    * Removes the JLHall from the lecture hall ArrayList.
    * @param l The JLHall being removed.
    */
    public void deleteLHall(JLHall l) {
    }

    /**
    * Adds a new JInstruc to the instructor ArrayList.
    * @param i The JInstruc being added.
    */
    public void hireInstruc(JInstruc i) {
    }

    /**
    * Removes the JInstruc from the instructor ArrayList.
    * @param i The JInstruc being removed.
    */
    public void fireInstruc(JInstruc i) {
    }

    /**
    * Adds a new JStudent to the student ArrayList.
    * @param i The JInstruc being added.
    */
    public void admitStu(JStudent i) {
    }

    /**
    * Removes the JStudent from the student ArrayList.
    * @param i The JStuent being removed.
    */
    public void releaseStu(JStudent i) {
    }

    /**
    * Returns the catalog of each class with their list of prerequisites, lecture hall, instructor, and students.
    * @return The catalog of classes with their prerequisites, lecture hall, instructor, and list of students.
    */
    public String generateCatalog() {
    }
}
