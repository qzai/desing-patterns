package com.mmosiej.desingpatterns.builder;


public class Person {

    // required
    private String firstName;
    // required
    private String lastName;
    private Integer age;
    private String nationality;
    private String phone;
    private Integer weight;
    private Integer height;
    private Integer shoeSize;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Integer age, String nationality, String phone, Integer weight, Integer height, Integer shoeSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        this.phone = phone;
        this.weight = weight;
        this.height = height;
        this.shoeSize = shoeSize;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getShoeSize() {
        return shoeSize;
    }

    public static class PersonBuilder {

        private String firstName;
        private String lastName;
        private Integer age;
        private String nationality;
        private String phone;
        private Integer weight;
        private Integer height;
        private Integer shoeSize;

        public PersonBuilder() {
        }

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

        public PersonBuilder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public PersonBuilder height(Integer height) {
            this.height = height;
            return this;
        }

        public PersonBuilder phone(Integer shoeSize) {
            this.shoeSize = shoeSize;
            return this;
        }

        public Person build() {
            if (firstName == null) {
                throw new IllegalStateException("First name must be specified.");
            }
            if (lastName == null) {
                throw new IllegalStateException("Last name must be specified.");
            }

            return new Person(firstName, lastName, age, nationality, phone, weight, height, shoeSize);
        }
    }
}
