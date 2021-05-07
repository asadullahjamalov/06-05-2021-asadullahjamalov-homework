package com.company;

public class PersonImmutable {

    private String name;
    private String surname;
    private int age;


    public void setName(String name) {
        PersonImmutable person = new PersonImmutable();
        person.name = name;
        System.out.println(person); // We print the reference of object
        // to see that created objects are different
    }

    public void setSurname(String surname) {
        PersonImmutable person = new PersonImmutable();
        person.surname = surname;
        System.out.println(person); // We print the reference of object
        // to see that created objects are different
    }

    public void setAge(int age) {
        PersonImmutable person = new PersonImmutable();
        person.age = age;
        System.out.println(person); // We print the reference of object
        // to see that created objects are different
    }


}
