package prometheus.olimpiatasks.number07.variant1;

public class InfinityArray {

    public int size = 1;
    public int[] innerArray = new int[1];
    public int arraylength = 0;

    public int get(int index) {
            if (index >= arraylength || index < 0) {
                throw new IndexOutOfBoundsException("Невірно введено індекс");
            }
        return innerArray[index];
    }

    public void add(int element) {
        if (arraylength == Integer.MAX_VALUE) {
            System.out.println("розмір більше за MaxInt");
            return;
        }
        if (size == arraylength) {
            size *= 2;
            int[] myNewArray = new int[size];
            for (int i = 0; i < arraylength; i++) {
                myNewArray[i] = innerArray[i];
            }
            innerArray = myNewArray;
        }
        innerArray [arraylength] = element;
        arraylength++;
    }
}
