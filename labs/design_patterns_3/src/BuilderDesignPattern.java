class PersonB {
    private final String name;
    private final String birthday;
    private final String city;

    public PersonB(String name, String birthday, String city) {
        this.name = name;
        this.birthday = birthday;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Birthday: " + birthday + " City: " + city;
    }
}

class PersonBuilder {

    private String name;
    private String birthday;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public PersonB build(){
        return new PersonB(name, birthday, city);
    }
}

public class BuilderDesignPattern {
    public static void main(String[] args) {
        PersonB s = new PersonBuilder()
                .setName("Sahil sapariya")
                .setBirthday("2 Nov 2003")
                .setCity("Jamjodhpur")
                .build();
        System.out.println(s.toString());
    }
}
