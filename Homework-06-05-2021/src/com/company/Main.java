package com.company;

public class Main {

    public static void main(String[] args) {

        ImmutablePerson p1 = new ImmutablePerson("Veli", "Aliyev", 22);


        PersonImmutable p2 = new PersonImmutable();
        p2.setName("Veli");
        p2.setName("Arif");
        p2.setName("Akif");
        p2.setSurname("Adilov");
        p2.setAge(23);
        p2.setAge(35);


    }
}
