package fr.almamy.springbootthymeleaf.model;

public class User {
    // == Fields ==
    private int id;
    private int age;
    private String name;

    // == Constructors ==

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
