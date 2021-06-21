package org.example;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String Address;

    public Person(String name, String surname, int age,String Address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.Address = Address;
    }

    public boolean hasAge() {
        return (this.getAge() != 0);
    }

    public boolean hasAddress() {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return Address;
    }

    public void happyBirthday() {
        this.age += this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + Address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name) &&
                surname.equals(person.surname) &&
                Address.equals(person.Address);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(this.surname);
        personBuilder.setAddress(this.Address);
        if(this.getAge() > 16){
            personBuilder.setAge(this.getAge() - 16);
        }else{
            personBuilder.setAge(0);
        }
        return personBuilder;
    }

}
