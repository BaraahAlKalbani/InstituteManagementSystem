// TimeSheet class representing a time sheet, with fields date, classSession and
// teacher
public class TimeSheet {
    public TimeSheet(String date, Event classSession) {
        this.date = date;
        this.classSession = classSession;
    }

    String date;
    Event classSession;
    Teacher teacher;

    enum TimeSheetStatus {
        PRESENT, ABSENT
    }

    static void markCheakIn() {
    }

    static void markCheakOut() {
    }
}