package prometheus.olimpiatasks.number22;
import java.util.List;
public class BubbleListSorter implements ListSorter {


    @Override
    public void sort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; j++) {
                int firstElement = list.get(j);
                int secondElement = list.get(j + 1);

                if (firstElement > secondElement) {
                    list.set(j, secondElement);
                    list.set(j + 1, firstElement);
                }
            }
        }
    }
}