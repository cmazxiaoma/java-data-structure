package 模仿ArrayList类;

public class test {

    public static void main(String[] args) {

        test1();
        // test2();
    }

    public static void test2() {

        CmazList<String> mlist = new CmazList<String>(5);
        // 添加元素
        /**
         * 容量为5，在size=6扩容到7， 在size=8处，扩容到10， 在size=11,扩容到15， 在size=16时，扩容到22
         */
        for (int i = 0; i < 20; i++) {

            mlist.add("" + i);
        }

    }

    public static void test1() {
        CmazList<String> mlist = new CmazList<String>();
        /**
         * 默认的容量为10 在size=1，扩容到10， 在size=11,扩容到15; 在size=16,扩容到22;
         */
        // 添加元素
        for (int i = 0; i < 20; i++) {

            mlist.add("" + i);
        }

        System.out.println("输出CmazList=" + mlist.toString());

        // 通过下标，获取该元素
        int index = 5;
        System.out.println("该元素=" + mlist.get(index));

        // 通过元素的值删除 元素
        String deleteValue = "15";

        if (mlist.remove(deleteValue)) {
            System.out.println("删除成功" + deleteValue);
        } else {
            System.out.println("删除失败" + deleteValue);
        }
        System.out.println(mlist.toString());

        // 通过元素下标删除该元素
        int deleteIndex = 14;
        String oldValue = mlist.remove(deleteIndex);

        System.out.println("删除的旧值=" + oldValue);

        System.out.println(mlist.toString());

        // 是否包含该元素12

        String searchValue = "12";

        if (mlist.contains(searchValue)) {
            System.out.println("有" + searchValue + "这个元素");
        } else {

            System.out.println("不包含这个" + searchValue + "这个元素");
        }
    }

}
