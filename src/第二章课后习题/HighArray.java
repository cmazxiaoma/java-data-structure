package 第二章课后习题;

import java.util.ArrayList;

public class HighArray {

    private long[] a;
    public int size;
    private HighArrayReverseSort highArrayReverseSort;

    public HighArray(HighArrayReverseSort highArrayReverseSort, int initialCapacity) {
        this.highArrayReverseSort = highArrayReverseSort;
        a = new long[initialCapacity];
        size = 0;
    }

    public boolean find(long findValue) {
        int j;
        for (j = 0; j < size; j++) {

            if (a[j] == findValue) {
                break;
            }
        }

        if (j == size) {
            return false;
        } else {
            return true;
        }

    }

    public void insert(long value) {
        a[size] = value;
        size++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < size; j++) {

            if (a[j] == value) {
                break;
            }
        }

        if (j == size) {
            return false;
        } else {

            for (int k = j; k < size - 1; k++) {
                a[k] = a[k + 1];
            }
            size--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < size; j++) {
            System.out.print(" " + a[j]);
        }
        System.out.print("\n");
    }

    public long getMax() {
        if (size == 0) {
            return -1;
        } else {
            long max = a[0];
            for (int j = 0; j < size; j++) {

                if (a[j] > max) {
                    max = a[j];
                }
            }
            return max;
        }
    }

    public boolean removeMax() {
        highArrayReverseSort.reverseSort(this);
        return delete(getMax());
    }

    public int size() {
        return size;
    }

    public long get(int index) {
        return a[index];
    }

    public long set(int index, long value) {
        long oldValue = this.get(index);
        a[index] = value;
        return oldValue;
    }
}
