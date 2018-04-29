package 第二章课后习题;

import java.util.Arrays;

public class OrderedArray {

    private long[] a;
    private int size;

    public OrderedArray(int inititalCapacity) {

        a = new long[inititalCapacity];
        size = 0;
    }

    public int linearFind(long searchValue) {
        long startTime = System.currentTimeMillis();
        int j;

        for (j = 0; j < size; j++) {

            if (searchValue == a[j]) {

                break;
            }
        }

        if (j == size) {
            long noFoundTime = System.currentTimeMillis();
            System.out.println("本次是线性查询,查询的数字=" + searchValue + ",耗时=" + (noFoundTime - startTime));
            return size;
        } else {
            long endTime = System.currentTimeMillis();
            System.out.println("本次是线性查询，查询的数字=" + searchValue + ",返回索引=" + j + ",查询时间=" + (endTime - startTime));
            return j;
        }
    }

    public int fastFind(long searchValue) {
        System.out.println("进行了二分法查询");
        long startTime = System.currentTimeMillis();
        int start = 0;
        int end = size - 1;
        int mid;
        while (start <= end) {

            mid = (start + end) >> 1;
            System.out.println("start=" + start + ",end=" + end + ",mid=" + mid);

            long value = a[mid];
            if (searchValue > value) {
                start = mid + 1;
            } else if (searchValue < value) {
                end = mid - 1;
            } else {
                long endTime = System.currentTimeMillis();
                System.out.println("本次是二分法查询，查询的数字=" + searchValue + ",返回索引=" + mid + ",查询时间=" + (endTime - startTime));
                return mid;
            }
        }
        long noFoundTime = System.currentTimeMillis();
        System.out.println("本次是二分法查询，没找到该数字=" + searchValue + ",耗时=" + (noFoundTime - startTime));
        return -1;
    }

    public void fastInsert(long insertValue) {
        int start = 0;
        int end = size - 1;
        int mid;

        while (start <= end) {

            mid = (start + end) / 2;

            long value = a[mid];

            if (insertValue > value) {

                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }

        for (int k = size; k > start; k--) {

            a[k] = a[k - 1];
        }

        a[start] = insertValue;
        size++;
    }

    /**
     * 线性插入
     * 
     * @param value
     */
    public void linearInsert(long value) {

        int j;

        for (j = 0; j < size; j++) {

            if (a[j] > value) {

                break;
            }
        }

        for (int k = size; k > j; k--) {

            a[k] = a[k - 1];
        }
        a[j] = value;
        System.out.println("线性插入，此时数组size=" + size);
        size++;
    }

    public boolean delete(long value) {

        int i = fastFind(value);

        if (i == size) {
            return false;
        } else {

            for (int k = i; k < size - 1; k++) {

                a[k] = a[k + 1];
            }
            size--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < size; j++) {
            System.out.println("" + a[j]);
        }
    }

    public int size() {
        return size;
    }

    public void removeAll() {
        size = 0;
    }

    public long get(int index) {
        return a[index];
    }
}
