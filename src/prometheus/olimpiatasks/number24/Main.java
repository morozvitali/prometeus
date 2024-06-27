package prometheus.olimpiatasks.number24;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(1, 4, 2, 6, 3, 8, 9, -7);
        Pair<Integer, Integer> pair = findTwoBiggestElements(set);

        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }

    private static Pair<Integer, Integer> findTwoBiggestElements(Set<Integer> numbers) {
        Integer firstElement = null;
        Integer secondElement = null;

        for (int element : numbers) {
            if (firstElement == null) {
                firstElement = element;
            } else if (secondElement == null && element < firstElement) {
                secondElement = element;
            } else if (secondElement == null || element > firstElement) {
                secondElement = firstElement;
                firstElement = element;
            } else if (element > secondElement) {
                secondElement = element;
            }
        }

        return new Pair<>(firstElement, secondElement);
    }
}