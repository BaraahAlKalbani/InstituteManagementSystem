import java.util.ArrayList;

// Event class representing an event, with fields course, teacher, date and time
public class Event {
    public Event(Teacher teacher, String date, String time) {
        this.teacher = teacher;
        this.date = date;
        this.time = time;
    }
    
    Course course;
    Teacher teacher;
    String date;
    String time;
    ArrayList<Attendance> attendances;
}