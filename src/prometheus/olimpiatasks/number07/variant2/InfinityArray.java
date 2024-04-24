package prometheus.olimpiatasks.number07.variant2;

public class InfinityArray {

    public int size = 0;
    public int[] innerArray = new int[0];

    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;
        } else {
            return innerArray[index];
        }
    }

    public void add(int element) {
        if (size == Integer.MAX_VALUE) {
            System.out.println("розмір більше за MaxInt");
            return;
        }

        int[] newArray = new int[size + 1];
        for (int i = 0; i < size; i++) {
            newArray[i] = innerArray[i];
        }
        newArray[size] = element;
        innerArray = newArray;
        size++;
    }
}