package 第二章课后习题;

import java.util.Random;

public class NewOrderedArrayTest {

    public static void main(String[] args) {

        NewOrderedArray oldArray1 = new NewOrderedArray(10);
        NewOrderedArray oldArray2 = new NewOrderedArray(10);

        for (int i = 0; i < 10; i++) {
            oldArray1.fastInsert(new Random().nextInt(9999));
            oldArray2.fastInsert(new Random().nextInt(666));
        }

        oldArray1.display();
        oldArray2.display();
        oldArray1.merge(oldArray2);
    }

}
