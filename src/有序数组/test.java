package 有序数组;

public class test {

    public static void main(String[] args) {

        int maxSize = 100;
        OrdArray array = new OrdArray(100);
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

        int searchValue = 55;
        if (array.find(searchValue) != array.size()) {
            System.out.println("find " + searchValue);
        } else {
            System.out.println("NotFound " + searchValue);
        }

        array.display();

        array.delete(00);
        array.delete(55);
        array.delete(99);

        array.display();

        array.insert(31);
        array.display();
    }

}
