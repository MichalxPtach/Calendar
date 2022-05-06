import java.time.LocalTime;

public class Reminder extends Event{
    private String reminder;

    public Reminder(LocalTime startTime, LocalTime endTime, String description, Event.Priority priority, String reminder) {
        super(startTime, endTime, description, priority);
        this.reminder = reminder;
    }
    @Override
    public void print() {
        System.out.println("Spotkanie zaczyna sie o: " + this.getStartTime());
        System.out.println("Spotkanie konczy sie o: " + this.getEndTime());
        System.out.println("Opis spotkania: " + this.getDescription());
        System.out.println("Priorytet spotkania: " + this.getPriority());
        System.out.println("Reminder: " + this.getReminder());
    }
    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }
}
