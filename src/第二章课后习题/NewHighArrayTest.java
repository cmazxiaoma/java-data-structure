package 第二章课后习题;

public class NewHighArrayTest {

    public static void main(String[] args) {

        int initialCapacity = 10;
        NewHighArray array = new NewHighArray(new HighArrayReverseSort() {

            @Override
            public void reverseSort(HighArray array) {
                // TODO Auto-generated method stub

            }
        }, initialCapacity);

        array.insert(56);
        array.insert(23);
        array.insert(15);
        array.insert(66);
        array.insert(67);
        array.insert(15);
        array.insert(100);
        array.insert(90);
        array.insert(15);
        array.insert(15);

        array.display();

        long dupValue = 15;
        array.noDup(dupValue);

        array.display();
    }
}
