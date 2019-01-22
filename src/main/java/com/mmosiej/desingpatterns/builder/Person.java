package com.mmosiej.desingpatterns.builder;


public class Person {

    // required
    private String firstName;
    // required
    private String lastName;
    private int age;
    private String nationality;
    private String phone;

    // może być również private
    public Person(String firstName, String lastName, int age, String nationality, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPhone() {
        return phone;
    }

    public static class PersonBuilder {

        private String firstName;
        private String lastName;
        private int age;
        private String nationality;
        private String phone;

        // różne podejścia - z konstruktorem paramerowym lub bezparametrowym
        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public PersonBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build() {
            // Alternatywa dla konsturktora parametrowego w klasie budowniczego
            if (firstName == null) {
                throw new IllegalStateException("First name must be specified.");
            }
            if (lastName == null) {
                throw new IllegalStateException("Last name must be specified.");
            }

            return new Person(firstName, lastName, age, nationality, phone);
        }
    }
}
