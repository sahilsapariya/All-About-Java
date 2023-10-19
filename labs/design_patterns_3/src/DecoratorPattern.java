class PersonD {
    private final String name;
    private final String birthday;
    private final String city;

    public PersonD(String name, String birthday, String city) {
        this.name = name;
        this.birthday = birthday;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Birthday: " + birthday + " City: " + city;
    }
}

class PersonDecorator {
    private final PersonD person;
    private final String fatherName;
    private final String motherName;

    public PersonDecorator(PersonD person, String fatherName, String motherName) {
        this.person = person;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    @Override
    public String toString() {
        return person.toString() + "\nFather Name : " + fatherName + "\nMother Name : " + motherName;
    }
}


class PersonFactoryD {
    public static PersonD createPerson(String name, String birthdate, String city) {
        return new PersonD(name, birthdate, city);
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        PersonD sahil = PersonFactoryD.createPerson("Sahil Sapariya", "2/11/2003", "jamjodhpur");
        PersonDecorator sahilWithParent = new PersonDecorator(sahil, "Ashvin Sapariya", "Dipti Sapariya");
        System.out.println(sahilWithParent);
    }
}
