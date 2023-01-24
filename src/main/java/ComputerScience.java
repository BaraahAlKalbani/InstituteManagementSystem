import java.util.ArrayList;

// ComputerScience class representing the computer science department
public class ComputerScience extends Department {

    public ComputerScience(String name, ArrayList<Staff> staff, ArrayList<Course> course) {
        super(name, staff);
        this.course = course;
    }
    ArrayList<Course> course;
    
}