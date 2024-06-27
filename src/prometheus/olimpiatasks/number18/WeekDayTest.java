package prometheus.olimpiatasks.number18;

public class WeekDayTest {
    public static void main(String[] args) {
        WeekDay monday = WeekDay.findByDayName("Monday");
        System.out.println("Was correct weekDay found: " + (monday == WeekDay.MONDAY));

        WeekDay sunday = WeekDay.findByDayName("Sunday");
        System.out.println("Was correct weekDay found: " + (sunday == WeekDay.SUNDAY));

        WeekDay nonexistedWeekDay = WeekDay.findByDayName("Test incorrect name");
        System.out.println("Was correct response returned: " + (nonexistedWeekDay == null));
    }
}
