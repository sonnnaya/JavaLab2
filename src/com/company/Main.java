package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("k", "l", 1);
        Person p2 = new Person(new String("k"), "l", 1);

        System.out.println(p1.equals(p2));
    }
}

class Person
{
    private String name;
    private String surname;
    private int age;

    public String getName() { return name; }

    public void setName(String Name) { this.name = Name; }

    public String getSurname() { return surname; }

    public void setSurname(String Surname) { this.surname = Surname; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object object){
        if (object == this)
            return true;
        if (object == null || object.getClass() != this.getClass())
            return false;

        Person person = (Person) object;

        if (person.age != age)
            return false;

        boolean isEqualName = name != null
                            ? name.equals(person.getName())
                            : null == person.getName();
        boolean isEqualSurname = surname != null
                               ? surname.equals(person.getSurname())
                               : null == person.getSurname();

        return isEqualName && isEqualSurname;

        //boolean isEqualName = Objects.equals(name, person.getName());
        //boolean isEqualSurname = Objects.equals(surname, person.getSurname());

        //return  isEqualName && isEqualSurname;
    }
}