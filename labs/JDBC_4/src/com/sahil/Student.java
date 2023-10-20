package com.sahil;

public class Student {
    private int id;
    private String name;
    private String phone;
    private String city;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(int id, String name, String phone, String city) {
        super();
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public Student(String name, String phone, String city) {
        super();
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public String toString() {
        return "Student [studentId=" + id + ", studentName=" + name + ",studentPhone=" + phone + ", studentCity=" + city + "]";
    }
}
