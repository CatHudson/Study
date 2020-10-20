package ru.geekbrains.lesson03;


public class Employee {

    private String name;
    private String email;
    private String title;
    private int age;


    public String info () {
        return (getName() + " " + getTitle() + " " + getAge() + " " + getEmail());
    }

    public Employee(String name, String email, String title, int age) {
        this.name = name;
        this.email = email;
        this.title = title;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAge(int age) {
        this.age = age;
    }
}