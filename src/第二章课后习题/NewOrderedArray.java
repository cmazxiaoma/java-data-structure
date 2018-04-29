package 第二章课后习题;

import java.util.Arrays;

public class NewOrderedArray extends OrderedArray {

    public NewOrderedArray(int inititalCapacity) {
        super(inititalCapacity);
        // TODO Auto-generated constructor stub
    }

    public void merge(NewOrderedArray oldArray1) {
        NewOrderedArray oldArray2 = this;
        NewOrderedArray newArray = new NewOrderedArray(oldArray1.size() + oldArray2.size());
        for (int i = 0; i < oldArray1.size(); i++) {
            newArray.fastInsert(oldArray1.get(i));
        }
        for (int j = 0; j < oldArray2.size(); j++) {
            newArray.fastInsert(oldArray2.get(j));
        }

        newArray.display();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        for (int j = 0; j < this.size(); j++) {
            System.out.print(" " + this.get(j));
        }
        System.out.print("\n");
    }

}
