package 有序数组;

public class OrdArray {

    private long[] a;
    private int size;

    public OrdArray(int initialCapacity) {

        a = new long[initialCapacity];
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public int find(long searchKey) {

        int start = 0;
        int end = size - 1;

        while (true) {

            int index = (start + end) / 2;
            long value = a[index];
            if (value == searchKey) {
                return index;
            } else if (start > end) {
                return size;
            } else {

                if (searchKey > value) {

                    start = index + 1;
                } else if (searchKey < value) {

                    end = index - 1;
                }
            }

        }
    }

    public void insert(long value) {
        int j = 0;
        for (j = 0; j < size; j++) {

            if (a[j] > value) {
                break;
            }
        }

        for (int k = size; k > j; k--) {

            a[k] = a[k - 1];

        }
        a[j] = value;
        size++;
    }

    public boolean delete(long value) {

        int j = find(value);
        if (j == size) {
            return false;
        }

        for (int k = j; k < size - 1; k++) {
            a[k] = a[k + 1];
        }
        size--;
        return true;
    }

    public void display() {

        for (int i = 0; i < size; i++) {

            System.out.print(" " + a[i]);
        }
        System.out.print("\n");
    }

}
