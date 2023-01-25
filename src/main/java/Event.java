
// Event class representing an event, with fields course, teacher, date and time
public class Event {
    public Event(String date, String time) {
        this.date = date;
        this.time = time;
    }
    
    Course course;
    String date;
    String time;
    Attendance attendances;
}