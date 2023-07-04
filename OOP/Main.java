public class Main {
    public static void main(String[] args) {

        // getting started with creating objects
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();
        
        // One more example
        Student s1 = new Student();
        s1.name = "sahil";
        s1.age = 19;

        Student s2 = new Student(s1);

        s2.printInfo();
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
    Student() {}
}

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

