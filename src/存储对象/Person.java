package 存储对象;

public class Person {

    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int age) {

        this.lastName = last;
        this.firstName = first;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("LastName=" + lastName + ",firstName=" + firstName + ",age=" + age);

    }

    public String getLast() {
        return lastName;
    }
}
