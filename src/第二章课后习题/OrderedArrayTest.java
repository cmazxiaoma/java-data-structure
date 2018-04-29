package 第二章课后习题;

public class OrderedArrayTest {

    public static void main(String[] args) {

        long t1, t2, t3, t4, t5, t6;
        int initialCapacity = 400000;
        OrderedArray array = new OrderedArray(initialCapacity);
        // 二分法插入
        t1 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            array.fastInsert(i);
        }
        t2 = System.currentTimeMillis();
        t3 = t2 - t1;
        System.out.println("二分法插入" + array.size() + "条数据，耗时=" + t3 + "毫秒");
        /**
         * 删除123456**
         *
         */
        boolean flag = array.delete(123456);
        String msg = flag ? "删除成功" : "删除失败";
        System.out.println("msg=" + msg);
        /*************** 线性插入 ******************/
        t4 = System.currentTimeMillis();
        for (int i = 200000; i < 400000; i++) {
            array.linearInsert(i);
        }
        t5 = System.currentTimeMillis();
        t6 = t5 - t4;
        System.out.println("线性插入" + 200000 + "条数据，耗时=" + t6 + "毫秒");

        long searchValue = 321234;
        /** 二分法查询 **/
        int index = array.fastFind(searchValue);
        /** 线性查询 **/
        array.linearFind(searchValue);
    }

}
