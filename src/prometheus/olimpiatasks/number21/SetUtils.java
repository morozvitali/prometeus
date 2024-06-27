package prometheus.olimpiatasks.number21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class SetUtils {
    private SetUtils() {

    }

    public static Set<Set<Integer>> findAllPairs(Set<Integer> originalSet) {
        Set<Set<Integer>> pairs = new HashSet<>();

        List<Integer> elements = new ArrayList<>(originalSet);
        for (int i = 0; i < elements.size() - 1; i++) {
            Integer firstElement = elements.get(i);
            for (Integer secondElement : elements.subList(i + 1, elements.size())) {
                HashSet<Integer> pair = new HashSet<>();
                pair.add(firstElement);
                pair.add(secondElement);
                pairs.add(pair);
            }
        }

        return pairs;
    }

    public static Set<Set<Integer>> findAllTriples(Set<Integer> originalSet) {
        Set<Set<Integer>> triples = new HashSet<>();

        List<Integer> elements = new ArrayList<>(originalSet);
        for (int i = 0; i < elements.size() - 2; i++) {
            Integer firstElement = elements.get(i);
            for (int j = i + 1; j < elements.size() - 1; j++) {
                Integer secondElement = elements.get(j);
                for (Integer thirdElement : elements.subList(j + 1, elements.size())) {
                    Set<Integer> triple = new HashSet<>();
                    triple.add(firstElement);
                    triple.add(secondElement);
                    triple.add(thirdElement);
                    triples.add(triple);
                }
            }
        }

        return triples;
    }
}