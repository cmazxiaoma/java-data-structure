package 设计一个高级数组;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        int maxSize = 100;
        HighArray array;
        array = new HighArray(maxSize);
        array.insert(77);
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(33);
        /**
         * 遍历
         */
        array.display();
        // 查询一个searchValue=35
        int searchValue = 00;
        boolean flag = array.find(searchValue);
        if (flag) {
            System.out.println("find " + searchValue);
        } else {
            System.out.println("can not find " + searchValue);
        }
        /**
         * 删除
         */
        boolean flag1 = array.delete(00);
        boolean flag2 = array.delete(55);
        boolean flag3 = array.delete(99);
        System.out.println("flag1=" + flag1 + ",flag2=" + flag2 + ",flag3=" + flag3);
        // 遍历
        array.display();
    }
}
