package 模仿ArrayList类;

public class test1 {

    public static void main(String[] args) {

        CmazList1<String> mlist = new CmazList1<String>();
        for (int i = 0; i < 20; i++) {
            mlist.add(i + "");
        }
        System.out.println(mlist.toString());

        /**
         * 删除下标4-14的元素
         */
        mlist.removeRange(4, 15);

        System.out.println(mlist.toString());
    }

}
