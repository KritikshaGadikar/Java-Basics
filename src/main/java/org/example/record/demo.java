package org.example.record;

import java.util.Objects;

/*class Person {
    private final int id;
    private final String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}*/

record Person(int id, String name) {}                               // just one line of code for recode is sufficient instead of writing this 40 line of code which is commented

public class demo {

    public static void main(String args[]) {

        Person p1 = new Person(1, "kittu");
        Person p2 = new Person(1, "kittu");

        System.out.println(p1.equals(p2));
    }
}
