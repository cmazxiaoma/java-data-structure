package 设计一个数组;

import java.awt.datatransfer.StringSelection;

public class LowArrayTest {

    public static void main(String[] args) {

        LowArray array;
        array = new LowArray(100);
        int count = 0;
        int j;
        array.setElem(0, 77);
        array.setElem(1, 99);
        array.setElem(2, 44);
        array.setElem(3, 55);
        array.setElem(4, 22);
        array.setElem(5, 88);
        array.setElem(6, 11);
        array.setElem(7, 00);
        array.setElem(8, 66);
        array.setElem(9, 33);

        count = 10;
        /**
         * 输出
         */
        for (j = 0; j < count; j++) {
            System.out.print(array.getElem(j) + " ");
        }

        System.out.println("\n");

        /**
         * 从这个数组里面搜索26
         */
        int searchKey = 26;
        for (j = 0; j < count; j++) {

            if (array.getElem(j) == searchKey) {
                break;
            }
        }

        System.out.println("j=" + j);

        if (j == count) {
            System.out.println("can not find " + searchKey);
        } else {
            System.out.println("find" + searchKey);
        }

        /**
         * 从这个数组里面删除55
         */

        int deleteKey = 55;
        for (j = 0; j < count; j++) {

            if (array.getElem(j) == deleteKey) {

                break;
            }
        }

        if (j == count) {
            System.out.println("can not find " + deleteKey);
        } else {

            System.out.println("find " + deleteKey);
            System.out.println("下一步删除" + deleteKey);

            for (int k = j; k < count; k++) {
                /**
                 * 从deleteKey元素开始后面的元素，从后面往前面移动。 移动完毕，整个数组的长度就会减少1
                 */
                array.setElem(k, array.getElem(k + 1));
            }

            count--;
            System.out.println("delete " + deleteKey + " success!");
        }

        /**
         * 遍历数组
         */

        for (j = 0; j < count; j++) {

            System.out.print(array.getElem(j) + " ");
        }
    }

}
