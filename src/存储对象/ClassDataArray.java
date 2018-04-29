package 存储对象;

public class ClassDataArray {

    private Person[] a;
    private int size;

    public ClassDataArray(int inititalCapacity) {

        a = new Person[inititalCapacity];
        size = 0;
    }

    public Person find(String searchName) {
        int j = 0;
        for (j = 0; j < size; j++) {

            if (a[j].getLast().equals(searchName)) {
                break;
            }
        }

        if (j == size) {
            return null;
        } else {
            return a[j];
        }
    }

    public void insert(String last, String first, int age) {
        a[size] = new Person(last, first, age);
        size++;
    }

    public boolean delete(String searchName) {
        int j = 0;
        for (j = 0; j < size; j++) {

            if (a[j].getLast().equals(searchName)) {
                break;
            }
        }

        if (j == size) {
            return false;
        } else {

            for (int k = j; k < size - 1; k++) {

                a[k] = a[k + 1];
            }
            size--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < size; j++) {

            a[j].displayPerson();
        }
    }

}
