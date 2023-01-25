import java.util.ArrayList;


// Department class representing a department, with name and students list as
// fields
public class Department {
   

    public Department(String name, ArrayList<Staff> staff) {
        this.name = name;
        this.staff = staff;
    }

    String name;
    ArrayList<Student> students;
    ArrayList<Staff> staff;
    ArrayList<Event> events;
    public void assignStaff() {

    }

    // Method to hire staff
    public void hireStaff(Staff staff) {
        // code to hire staff
    }

    // Method to admit student
    public void admitStudent(Student student) {
        // code to admit student
    }
}