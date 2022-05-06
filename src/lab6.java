import java.time.LocalTime;
import java.util.Scanner;

public class lab6{
    private static Scanner scanner=new Scanner(System.in);
    private static Calendar calendar=new Calendar();
    public static void Lab6() {
        Meetings();
    }
    public static void Meetings() {
        boolean end = true;
        menu();
        while (end) {
            String x = scanner.nextLine();
            switch (x) {
                case "1":
                    addMeeting();
                    break;
                case "2":
                    addphonecall();
                    break;
                case "3":
                    addReminder();
                    break;
                case "4":
                    removeMeeting();
                    break;
                case "5":
                    printMeeting();
                    break;
                case "6":
                    printMeetingWithPriority();
                    break;
                case "7":
                    end = false;
                    break;
            }
            menu();
        }
    }
    public static void addphonecall(){
        System.out.print("Podaj dzień: ");
        int day =scanner.nextInt();
        System.out.print("Podaj numer telefonu: ");
        int phonenumber = scanner.nextInt();

        System.out.print("Podaj godzine rozpoczęcia: ");
        int hour = scanner.nextInt();
        System.out.print("Podaj minute rozpoczęcia: ");
        int minute = scanner.nextInt();
        LocalTime startTime = LocalTime.of(hour, minute);

        System.out.print("Podaj godzine zakonczenia: ");
        hour = scanner.nextInt();
        System.out.print("Podaj minute zakonczenia: ");
        minute = scanner.nextInt();
        LocalTime endTime = LocalTime.of(hour, minute);

        System.out.print("Podaj opis: ");
        String description =scanner.nextLine();
        description =scanner.nextLine();

        System.out.print("Podaj prorytet spotkania: ");
        PhoneCall.Priority priority = PhoneCall.Priority.valueOf(scanner.next().toUpperCase());

        calendar.addPhoneCall(day, new PhoneCall(startTime,endTime,description,priority,phonenumber));
    }
    public static void addReminder(){
        System.out.print("Podaj dzień: ");
        int day =scanner.nextInt();
        System.out.print("Podaj reminder: ");
        String reminder = scanner.nextLine();
        reminder = scanner.nextLine();

        System.out.print("Podaj godzine rozpoczęcia: ");
        int hour = scanner.nextInt();
        System.out.print("Podaj minute rozpoczęcia: ");
        int minute = scanner.nextInt();
        LocalTime startTime = LocalTime.of(hour, minute);

        System.out.print("Podaj godzine zakonczenia: ");
        hour = scanner.nextInt();
        System.out.print("Podaj minute zakonczenia: ");
        minute = scanner.nextInt();
        LocalTime endTime = LocalTime.of(hour, minute);

        System.out.print("Podaj opis: ");
        String description =scanner.nextLine();
        description =scanner.nextLine();

        System.out.print("Podaj prorytet spotkania: ");
        Reminder.Priority priority = Reminder.Priority.valueOf(scanner.next().toUpperCase());


        calendar.add(day,new Reminder(startTime,endTime,description,priority,reminder));
    }

    public static void menu(){
        System.out.println("=-------------------=");
        System.out.println("1.Dodaj meeting");
        System.out.println("2.Dodaj phone call");
        System.out.println("3.Dodaj reminder");
        System.out.println("4.Usunięcie meetingu");
        System.out.println("5.Wyswietlenie meetingu");
        System.out.println("6.Wyswietl wszystkie spotkania z priorytetem");
        System.out.println("7.Zakoncz program");
        System.out.println("=-------------------=");
    }
    private static void addMeeting(){
        System.out.print("Podaj dzień: ");
        int day =scanner.nextInt();

        System.out.print("Podaj godzine rozpoczęcia: ");
        int hour = scanner.nextInt();
        System.out.print("Podaj minute rozpoczęcia: ");
        int minute = scanner.nextInt();
        LocalTime startTime = LocalTime.of(hour, minute);

        System.out.print("Podaj godzine zakonczenia: ");
        hour = scanner.nextInt();
        System.out.print("Podaj minute zakonczenia: ");
        minute = scanner.nextInt();
        LocalTime endTime = LocalTime.of(hour, minute);

        System.out.print("Podaj opis: ");
        String description =scanner.nextLine();
        description =scanner.nextLine();

        System.out.print("Podaj prorytet spotkania: ");
        Event.Priority priority = Event.Priority.valueOf(scanner.next().toUpperCase());


        calendar.add(day,new Event(startTime,endTime,description,priority));
    }
    private static void removeMeeting(){
        int day;
        System.out.print("Podaj dzień: ");
        day =scanner.nextInt();
        System.out.print("podaj numer spotkania: ");
        int numberMeeting = scanner.nextInt()-1;
        calendar.remove(day,numberMeeting);
    }
    private static void printMeeting(){
        int day;
        System.out.print("Podaj dzień: ");
        day =scanner.nextInt();
        calendar.printAll(day);
    }
    private static void printMeetingWithPriority() {
        int day;
        System.out.print("podaj dzień: ");
        day =scanner.nextInt();
        System.out.print("Podaj prorytet spotkania: ");
        Event.Priority priority = Event.Priority.valueOf(scanner.next().toUpperCase());
        calendar.printAllWithPriority(day,priority);
    }


}