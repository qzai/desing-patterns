package com.mmosiej.desingpatterns.builder;


public class PersonLombokTest {

    public void createInstanceTest() {
        PersonLombok p1 = new PersonLombok.PersonLombokBuilder()
                .firstName("Andrzej")
                .lastName("Strzelba")
                .age(37)
                .build();
    }

}