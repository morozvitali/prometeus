package prometheus.olimpiatasks.number27;

import java.util.List;
import java.util.function.Predicate;

public final class Utils {
    private Utils() {}

    public static void findAndPrintFirst(List<Integer> list, Predicate<Integer> predicate) {
        Integer result = null;
        for (int element : list) {
            if (predicate.test(element)) {
                result = element;
                break;
            }
        }

        if (result != null) {
            System.out.println("Element: " + result);
        } else {
            System.out.println("Element wasn't found");
        }
    }
}

