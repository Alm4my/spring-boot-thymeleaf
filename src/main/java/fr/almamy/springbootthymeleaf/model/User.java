package fr.almamy.springbootthymeleaf.model;

public class User {
    // == Fields ==
     public int id;
     public int age;
     public String name;

    // == Constructors ==
    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
