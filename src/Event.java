import java.time.LocalTime;

public class Event {
    private LocalTime endTime, startTime;
    private String description;
    protected enum Priority{
        LOW,MEDIUM,HIGH
    }
    private Event.Priority Priority;
    public final static LocalTime earlyTime = LocalTime.parse("08:00");

    public Event(LocalTime startTime, LocalTime endTime, String description, Event.Priority priority) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        Priority= priority;
    }

    public void print() {
        System.out.println("Godzina rozpoczecia: " + this.startTime);
        System.out.println("Godzina zakonczenia: " + this.endTime);
        System.out.println("Opis spotkania: " + this.getDescription());
        System.out.println("Priorytet spotkania: "+this.getPriority());
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event.Priority getPriority() {
        return Priority;
    }

    public void setPriority(Event.Priority priority) {
        Priority = priority;
    }
}
