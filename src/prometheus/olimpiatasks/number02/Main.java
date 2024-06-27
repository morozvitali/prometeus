package prometheus.olimpiatasks.number02;

public class Main {
    public static void main(String[] args) {
        int secondsFromStartOfMonth = 1400 ;

        int days = secondsFromStartOfMonth / (24 * 60 * 60) + 1;
        secondsFromStartOfMonth %= 24 * 60 * 60;
        int hours = secondsFromStartOfMonth / (60 * 60);
        secondsFromStartOfMonth %= 60 * 60;
        int minutes = secondsFromStartOfMonth / 60;
        secondsFromStartOfMonth %= 60;
        int seconds = secondsFromStartOfMonth;

        System.out.println("Зараз " + days + " число " + hours + ":" + minutes + ":" + seconds);
    }
}
