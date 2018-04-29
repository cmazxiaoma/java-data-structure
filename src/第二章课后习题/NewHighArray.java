package 第二章课后习题;

public class NewHighArray extends HighArray {

    public NewHighArray(HighArrayReverseSort highArrayReverseSort, int initialCapacity) {
        super(highArrayReverseSort, initialCapacity);
        // TODO Auto-generated constructor stub
    }

    public void noDup(long value) {

        // 第一种方法
        int NULL = -1;

        for (int i = 0; i < size; i++) {

            if (this.get(i) == value) {
                this.set(i, NULL);
            }
        }

        for (int j = 0; j < this.size(); j++) {

            if (this.get(j) == NULL) {

                System.out.println("j=" + j);
                for (int k = j; k < size - 1; k++) {

                    this.set(k, get(k + 1));
                }
                size--;
                j--;
                // 因为删除了一个元素,j下标对应的元素会发生改变,所以j-1后才能正确访问填充j下标的元素
                System.out.println("size=" + size);
            }
        }
        this.insert(value);
    }
}
