package prometheus.olimpiatasks.number15;

public class ConsoleUserPrinter implements UserPrinter {
    @Override
    public void printUserInfo(User user) {
        System.out.printf("User: %s %s (%s)", user.getFirstName(), user.getLastName(), user.getEmail());
    }
}
