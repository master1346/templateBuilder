package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
        super();
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String city) {
        this.address = city;
        return this;
    }

    public Person build() throws IllegalArgumentException, IllegalStateException{
        if(this.name.equals(" ")) throw new IllegalStateException("Обьект не создан,  так как не задано имя");
        if(surname.equals(" ")) throw new IllegalStateException("Обьект не создан,  так как не задана фамилия");
        if((age < 0)) throw new IllegalArgumentException("Возраст должен быть больше 0. Текущий возраст: " + age);

        return new Person(name, surname, age, address);
    }
}