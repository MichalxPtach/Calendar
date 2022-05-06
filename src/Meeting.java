
import java.time.LocalTime;

public class Meeting extends Event{

    public Meeting(LocalTime startTime, LocalTime endTime, String description, Event.Priority priority) {
        super(startTime, endTime, description, priority);
    }
}
