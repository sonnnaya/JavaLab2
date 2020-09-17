package com.company;

public final class Person
{
    private final String name;
    private final String surname;
    private final int age;

    public String getName() { return name; }

    public String getSurname() { return surname; }

    public int getAge() { return age; }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int hashCode() {
        if (name == null || surname == null)
            return 0;

        int hash = 17;

        hash = hash * 31 + name.hashCode();
        hash = hash * 31 + surname.hashCode();
        hash = hash * 31 + age;

        return hash;
    }

    @Override
    public boolean equals(Object object){
        if (object == this)
            return true;
        if (object == null || object.getClass() != this.getClass())
            return false;

        com.company.Person person = (com.company.Person) object;

        if (person.age != age)
            return false;

        boolean isEqualName = name != null
                ? name.equals(person.getName())
                : null == person.getName();
        boolean isEqualSurname = surname != null
                ? surname.equals(person.getSurname())
                : null == person.getSurname();

        return isEqualName && isEqualSurname;
    }
}