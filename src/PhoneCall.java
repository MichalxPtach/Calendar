import java.time.LocalTime;

public class PhoneCall extends Event{
    private int phoneCall;

    public PhoneCall(LocalTime startTime, LocalTime endTime, String description, Event.Priority priority, int phoneCall) {
        super(startTime, endTime, description, priority);
        this.phoneCall = phoneCall;
    }

    @Override
    public void print() {
        System.out.println("Spotkanie zaczyna sie o: " + this.getStartTime());
        System.out.println("Spotkanie konczy sie o: " + this.getEndTime());
        System.out.println("Opis spotkania: " + this.getDescription());
        System.out.println("Priorytet spotkania: " + this.getPriority());
        System.out.println("Numer telefonu: " + this.getPhoneCall());
    }

    public int getPhoneCall() {
        return phoneCall;
    }

    public void setPhoneCall(int phoneCall) {
        this.phoneCall = phoneCall;
    }
}
