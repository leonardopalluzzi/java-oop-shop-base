package org.lessons.java.shop;

public class Student {

    private String firstName;
    private String lasetName;
    private int age;

    public Student(String firstname, String lastName, int age) {
        this.firstName = firstname;
        this.lasetName = lastName;
        this.age = age;
    }

    public String getStudet() {
        return firstName + " " + lasetName + "," + " " + age + " | ";
    }

}
