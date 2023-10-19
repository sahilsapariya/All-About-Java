class Person {
    private final String name;
    private final String birthday;
    private final String city;

    public Person(String name, String birthday, String city) {
        this.name = name;
        this.birthday = birthday;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Birthday: " + birthday + " City: " + city;
    }
}

class PersonFactory {
    public static Person createPerson (String name, String birthday, String city) {
        return new Person(name, birthday, city);
    }
}
public class Main {
    public static void main(String[] args) {
        Person s = PersonFactory.createPerson("Sahil sapariya", "02/11/2003", "Jamjodhpur");
        System.out.println(s.toString());
    }
}