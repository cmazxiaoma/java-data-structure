package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {
        TreeSet<Student> mytree = new TreeSet<Student>();
        mytree.add(new Student(100, "garrett"));
        mytree.add(new Student(88, "xiaoma"));
        mytree.add(new Student(88, "am"));
        mytree.add(new Student(45, "augmentum"));

        Iterator<Student> itr = mytree.iterator();

        while (itr.hasNext()) {
            Student student = itr.next();
            System.out.println(student);
        }
    }
}
