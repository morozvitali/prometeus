package prometheus.olimpiatasks.number18;

public enum WeekDay {
    MONDAY("Monday", false),
    TUESDAY("Tuesday", false),
    WEDNESDAY("Wednesday", false),
    THURSDAY("Thursday", false),
    FRIDAY("Friday", false),
    SATURDAY("Saturday", true),
    SUNDAY("Sunday", true);

    private final String dayName;
    private final boolean isWeekend;

    WeekDay(String dayName, boolean isWeekend) {
        this.dayName = dayName;
        this.isWeekend = isWeekend;
    }

    public String getDayName() {
        return dayName;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public static WeekDay findByDayName(String dayName) {
        for (WeekDay weekDay : WeekDay.values()) {
            if (weekDay.getDayName().equals(dayName)) {
                return weekDay;
            }
        }
        return null;
    }
}
