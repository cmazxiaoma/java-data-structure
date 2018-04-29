package TreeSet;

public class Student implements Comparable {
    private int english = 0;
    private String name;

    public Student(int english, String name) {
        super();
        this.english = english;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;

        if (this.getName().compareTo(student.getName()) == 0) {
            return -1;
        } else {
            return this.getName().compareTo(student.getName());
        }
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [english=" + english + ", name=" + name + "]";
    }
}
