package 设计一个高级数组;

import java.util.ArrayList;

public class HighArray {

    private long[] a;

    private int count;

    public HighArray(int max) {

        a = new long[max];
        count = 0;
    }

    public void insert(long value) {
        a[count] = value;
        count++;
    }

    public boolean find(long searchValue) {
        int j;

        for (j = 0; j < count; j++) {

            if (a[j] == searchValue) {
                break;
            }
        }

        if (j == count) {
            return false;
        } else {
            return true;
        }
    }

    public boolean delete(long deleteValue) {

        int j;
        for (j = 0; j < count; j++) {

            if (a[j] == deleteValue) {

                break;
            }

        }

        if (j == count) {

            return false;
        } else {

            for (int k = j; k < count - 1; k++) {

                a[k] = a[k + 1];
            }

            count--;
            return true;
        }
    }

    public void display() {
        int j;
        for (j = 0; j < count; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.print("\n");

    }
}
