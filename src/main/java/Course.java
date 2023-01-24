import java.util.ArrayList;

// Course class representing a course, with fields courseCode, title, credits,
// department and teacher
public class Course {
    public Course(String courseCode, String name, int credits, Teacher teacher) {
        this.courseCode = courseCode;
        this.name = name;
        this.credits = credits;
        this.teacher = teacher;
    }

    String courseCode;
    String name;
    int credits;
    Teacher teacher;
    ArrayList<Enrollment> enrollments;

    public void assignTeacher() {

    }

    public void removeTeacher() {

    }

}