package chap12;

import chap11.collections.Person;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(List.of(
                new Person("John",15),
                new Person("John",35),
                new Person("Jane",18),
                new Person("Jack",20),
                new Person("Adam",21),
                new Person("Adam",19),
                new Person("Adam",31),
                new Person("Steven",30),
                new Person("Sara",32),
                new Person("Aline",20),
                new Person("Bruno",18)
        ));

//        var list = persons.stream()
//                .map(Person::getName)
//                .collect(Collectors.toList());
//        System.out.println(list);

        var names = persons.stream()
                .map(Person::getName)
              .collect(Collectors.joining(", "));
        System.out.println(names);

        var oldPerson = persons.stream()
                .max(Comparator.comparing(Person::getAge))
                .orElseThrow(()->new RuntimeException("Empty Stream"));
        System.out.println(oldPerson);
        var youngPerson = persons.stream()
                .min(Comparator.comparing(Person::getAge))
                .orElseThrow(()->new RuntimeException("Empty Stream"));
        System.out.println(youngPerson);

        var jPersons = persons.stream()
                .filter(person -> person.getName().toLowerCase().startsWith("j"))
                .collect(Collectors.toSet());
        System.out.println(jPersons);

        var jPerson = persons.stream()
                .filter(person -> person.getName().toLowerCase().startsWith("j"))
                .findFirst().orElseThrow(()->new RuntimeException("Empty Stream"));
        System.out.println(jPerson);

        var jPerson2 = persons.stream()
                .filter(person -> person.getName().toLowerCase().startsWith("j"))
                .findAny().orElseThrow(()->new RuntimeException("Empty Stream"));
        System.out.println(jPerson2);

        var old20Person = persons.stream()
                .anyMatch(person -> person.getAge()==20);

        System.out.println(old20Person);

        var allOldOver20Person = persons.stream()
                .allMatch(person -> person.getAge()>=20);

        System.out.println(allOldOver20Person);

        var noOneOver40Person = persons.stream()
                .noneMatch(person -> person.getAge()>=40);

        System.out.println(noOneOver40Person);

        var groupByAge = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge,Collectors.toSet()));

        System.out.println(toString(groupByAge));

        var countByAge = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));

        System.out.println(countByAge);

        var over18 = persons.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge()>=18));

        System.out.println(over18);

        var res = Stream.of(persons,persons)
                .flatMap(List::stream)
                .map(Person::getName)
                .collect(Collectors.joining(", "));
                //.collect(Collectors.toList());


        var groupByName = persons.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.groupingBy(person -> person.hashCode()));
        System.out.println(toString(groupByName));

        var sumOfAges = persons.stream()
                .mapToInt(Person::getAge).sum();
        System.out.println(sumOfAges);

        var sumOfAges2 = persons.stream()
                .map(Person::getAge)
                .parallel()
                .reduce((Integer a1,Integer a2)->a1+a2);
        System.out.println(sumOfAges2);

        var sumOfAges3 = persons.stream()
                .map(Person::getAge)
                .parallel()
                .reduce(0,(Integer a1, Integer a2)->a1+a2);
        System.out.println(sumOfAges3);

        var sumOfAges4 = persons.stream()
                .parallel()
                .reduce(0,(Integer i, Person p)-> i+p.getAge(),(Integer a1,Integer a2)->a1+a2);
        System.out.println(sumOfAges4);

        Stream.generate(() -> "growl!").limit(2).forEach(System.out::println);
        Stream.iterate("",s -> s+"1").limit(4).forEach(System.out::println);

        Predicate<String> predicate = s -> s.length()> 3;
        var stream = Stream.iterate("-",
                s -> ! s.isEmpty(), (s) -> s + s);
        var b1 = stream.noneMatch(predicate);
        var b2 = stream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);

    }

    static <K,V> String toString(Map<K,V> map) {

        if (map == null) {
            return "null";
        }

        return map.entrySet()
                .stream()
                .map(entry -> entry.getKey() + " => " + entry.getValue())
                .collect(Collectors.joining("\n"));
    }
}
