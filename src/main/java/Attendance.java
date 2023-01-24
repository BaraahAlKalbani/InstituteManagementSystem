
// Attendance class representing an attendance, with fields date, classSession
// and student
public class Attendance {


    public Attendance(String date, Student students) {
        this.date = date;
        this.students = students;
    }

    String date;
    Student students;
    
    enum AttendanceStatus {
        PRESENT, ABSENT
    }
    static void markAttendance()
    {}
    
}