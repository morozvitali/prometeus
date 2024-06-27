package prometheus.olimpiatasks.number21;

import java.util.HashSet;
import java.util.Set;

public class SetUtilsTest {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(5);

        Set<Set<Integer>> pairs = SetUtils.findAllPairs(integerSet);

        System.out.printf("Was found %d pairs for set %s:%n", pairs.size(), integerSet);
        for (Set<Integer> pair : pairs) {
            System.out.println(pair);
        }

        Set<Set<Integer>> triples = SetUtils.findAllTriples(integerSet);
        System.out.printf("%n%nWas found %d triples for set %s:%n", triples.size(), integerSet);
        for (Set<Integer> triple : triples) {
            System.out.println(triple);
        }
    }
}
