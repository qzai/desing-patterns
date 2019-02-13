package com.mmosiej.desingpatterns.builder;

public class BuilderClient {

    public static void main(String[] args) {
        Person p = new Person("Andrzej", "Strzelba", 37, "Bułgaria", null, 80, 180, null);

        Person pBuilded = new Person.PersonBuilder()
                .firstName("Andrzej")
                .lastName("Strzelba")
                .age(37)
                .nationality("Bułgaria")
                .weight(80)
                .height(180)
                .build();


        PersonLombok pl = new PersonLombok.PersonLombokBuilder()
                .firstName("Andrzej")
                .lastName("Strzelba")
                .age(37)
                .nationality("Bułgaria")
                .weight(80)
                .height(180)
                .build();
    }
}
