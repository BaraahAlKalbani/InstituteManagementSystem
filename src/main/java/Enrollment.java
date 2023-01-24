
// Enrollment class representing an enrollment, with fields student, course and
// status
public class Enrollment {
    public Enrollment(Student student, Course course, Enrollment.EnrollmentStatus status) {
        this.student = student;
        this.course = course;
        this.status = status;
    }

    Student student;
    Course course;
    EnrollmentStatus status;

    enum EnrollmentStatus {
        ACTIVE, WITHDRAWN, GRADUATED
    }
}