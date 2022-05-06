import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calendar{
    private List<Event>[] listmeeting = new ArrayList[31];

    public Calendar(){
        for (int i = 0; i < 31; i++) {
            listmeeting[i] = new ArrayList<Event>();
        }
    }

    public void add(int day, Event event){
        listmeeting[day].add(event);
    }

    public void remove(int day,int numberMeeting){
        listmeeting[day].remove(numberMeeting);
    }

    public void printAll(int day){
        listmeeting[day].stream()
                .forEach(value->value.print());
    }
    public void printAllWithPriority(int day, Event.Priority priority){
        listmeeting[day].stream()
                .filter(value -> value.getPriority() == priority)
                .forEach(value->value.print());
    }
    public void addPhoneCall(int day, PhoneCall phoneCall){
        listmeeting[day].add(phoneCall);
    }
}