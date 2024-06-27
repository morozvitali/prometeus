package prometheus.olimpiatasks.number15;

public class Main {
    public static void main(String[] args) {
        UserReader userReader = new ConsoleUserReader();
        UserPrinter userPrinter = new ConsoleUserPrinter();

        User user = userReader.readUser();
        userPrinter.printUserInfo(user);
    }
}
