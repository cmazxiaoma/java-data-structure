package 第二章课后习题;

public class HighArrayTest {

    public static void main(String[] args) {

        HighArray array = new HighArray(new HighArrayReverseSort() {

            @Override
            public void reverseSort(HighArray a) {
                class Inner {

                    public void swap(int m, int i) {
                        long temp = a.get(m);
                        a.set(m, a.get(i));
                        a.set(i, temp);
                    }
                }
                // TODO Auto-generated method stub
                for (int i = 0; i < a.size(); i++) {
                    // 最大值的小标
                    int m = i;
                    for (int k = i + 1; k < a.size(); k++) {

                        if (a.get(k) > a.get(m)) {
                            m = k;
                        }
                    }

                    // 如果待排序中的最大元素的下标等于i的话，那么就不用排序
                    // i是每次循环默认的最大元素的下标
                    if (m != i) {
                        new Inner().swap(m, i);
                    }
                }

                a.display();

            }
        }, 100);

        array.insert(23);
        array.insert(343);
        array.insert(2543);
        array.insert(234);
        array.insert(23);
        array.insert(233);
        array.insert(230);
        array.insert(253);
        array.insert(223);
        array.insert(2);

        array.display();

        System.out.println("最大数=" + array.getMax());

        array.removeMax();

        array.display();
    }
}
