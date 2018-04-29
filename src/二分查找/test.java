package 二分查找;

import 模仿ArrayList类.CmazList1;

public class test {

    public static void main(String[] args) {

        CmazList1<Integer> mList = new CmazList1<Integer>();
        for (int i = 1; i <= 100; i++) {

            mList.add(i);
        }

        int start = 0;
        int end = mList.size() - 1;
        int searchCount = 0;

        int searchValue = 102;
        int index;
        while (true) {

            searchCount++;
            index = (start + end) / 2;

            int value = mList.get(index);
            System.out.println("index=" + index + ",value=" + value);

            if (value == searchValue) {

                System.out.println("找到了,查找次数=" + searchCount);
                return;

            }

            if (searchValue > value) {

                start = index + 1;

                System.out.println("start=" + start + ",end=" + end);
            } else if (searchValue < value) {

                end = index - 1;
                System.out.println("start=" + start + ",end=" + end);
            }

        }

    }

}
