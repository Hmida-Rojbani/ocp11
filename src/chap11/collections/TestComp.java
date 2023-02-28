package chap11.collections;

import java.util.*;

public class TestComp {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(List.of(
                new Person("John",15),
        new Person("Jane",28),
         new Person("Jack",20),
         new Person("Adam",21),
         new Person("Steven",30),
         new Person("Sara",32),
         new Person("Aline",20),
         new Person("Bruno",18)
        ));

        //Collections.sort(persons);-->//persons.sort(null);
        //Collections.sort(persons, (o1, o2) -> o1.getAge()-o2.getAge());
        //persons.sort((o1, o2) -> o1.getAge()-o2.getAge());
        //persons.sort(Comparator.comparingInt(Person::getAge));
        //persons.sort(Comparator.comparingInt(Person::getAge).reversed());
        //persons.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
        //persons.sort(Comparator.comparingInt(Person::getAge).thenComparing(Comparator.comparing(Person::getName).reversed()));
        persons.sort(Comparator.naturalOrder());
        //persons.sort(Comparator.reverseOrder());

        System.out.println(persons);
        
    }
}
