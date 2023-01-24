
// Student class representing a student, with fields StudentID, name, address,
// phone and email
public class Student {
    public Student(String studentID, String name, String address, String phone, String email) {
        super();
        StudentID = studentID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    String StudentID;
    String name;
    String address;
    String phone;
    String email;

    // Method to enroll student in a course
    public void enrollInCourse(Course course) {
    }

    // Method to withdraw student from a course
    public void withdrawFromCourse(Course course) {
    }
}