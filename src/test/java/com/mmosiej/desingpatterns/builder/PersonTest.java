package com.mmosiej.desingpatterns.builder;

public class PersonTest {

    public void createInstanceTest() {
        Person p1 = new Person("Andrzej", "Strzelba", 37, null, null);
        Person p2 = new Person("Lukasz", "Betonowy", 18, null, "128256512");

        Person p1Builded = new Person.PersonBuilder("Andrzej", "Strzelba")
                .age(37)
                .build();
    }

}