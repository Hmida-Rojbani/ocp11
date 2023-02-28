package chap11.collections;

import java.util.*;


public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("John",15);
        Person p2 = new Person("Jane",28);
        Person p3 = new Person("Jack",20);
        Person p4 = new Person("Adam",21);
        Person p5 = new Person("Steven",30);
        Person p6 = new Person("Sara",32);
        Person p7 = new Person("Aline",20);
        Person p8 = new Person("Bruno",18);
        Set<Person> set = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);
        set.add(p7);
        set.add(p8);
        System.out.println(set);

        for (Person p : set) {
            System.out.println(p.getName()+ "-->"+p.hashCode());
        }

    }
}
