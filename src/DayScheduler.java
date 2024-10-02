import java.util.EnumMap;

public class DayScheduler {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    private EnumMap<Day, String> schedule = new EnumMap<>(Day.class);

    public void addActivity(Day day, String activity) {
        schedule.put(day, activity);
    }

    public String getActivity(Day day) {
        return schedule.get(day);
    }

    public static void main(String[] args) {
        DayScheduler scheduler = new DayScheduler();
        scheduler.addActivity(Day.MONDAY, "Gym");
        scheduler.addActivity(Day.FRIDAY, "Movie night");

        System.out.println("Monday: " + scheduler.getActivity(Day.MONDAY));
        System.out.println("Friday: " + scheduler.getActivity(Day.FRIDAY));
    }
}

