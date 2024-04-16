package Tasks.number07.mentor;

public class InfinityArray {
    int[] innerArray = new int[2];
    int size = 0;

    void add(int element) {
        if (innerArray.length == size) {
            int[] newArray = new int[innerArray.length * 2];
            for (int i = 0; i < innerArray.length; i++) {
                newArray[i] = innerArray[i];
            }
            innerArray = newArray;
        }
        innerArray[size] = element;
        size++;
    }

    int get(int index) {
        if (index < size && index >= 0) {
            return innerArray[index];
        }
        return -1;
    }
}