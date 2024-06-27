package prometheus.olimpiatasks.number27;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        Utils.findAndPrintFirst(list, e -> e % 2 == 0);
        Utils.findAndPrintFirst(list, e -> e % 2 != 0);
        Utils.findAndPrintFirst(list, e -> false);
        Utils.findAndPrintFirst(list, e -> true);
        Utils.findAndPrintFirst(list, e -> e > 8);
    }
}