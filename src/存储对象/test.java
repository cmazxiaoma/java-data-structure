package 存储对象;

public class test {

    public static void main(String[] args) {

        int initialCapacity = 100;
        ClassDataArray array = new ClassDataArray(initialCapacity);
        array.insert("Evans", "Patty", 24);
        array.insert("Smith", "Lorraine", 37);
        array.insert("Yee", "Tom", 43);
        array.insert("Adams", "Henry", 63);
        array.insert("Hashimoto", "Sato", 21);
        array.insert("Stimson", "Henry", 29);
        array.insert("Velasquez", "Jose", 72);
        array.insert("Lanarque", "Henry", 24);
        array.insert("Vang", "Minh", 22);
        array.insert("Creswell", "Lucinca", 18);

        array.display();

        String searchLastNameValue = "Stimson";
        Person person = null;
        person = array.find(searchLastNameValue);
        if (person != null) {

            System.out.println("Found");
            person.displayPerson();
        } else {
            System.out.print("Can not find" + searchLastNameValue);
        }

        System.out.println("Deleting Smith,Yee,and Creswell");
        array.delete("Smith");
        array.delete("Yee");
        array.delete("Creswell");
        array.display();
    }
}
