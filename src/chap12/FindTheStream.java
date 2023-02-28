package chap12;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheStream {

    public static void main(String[] args) {

        Book b0 = new Book("Les Métamorphoses");
        Book b1 = new Book("Les Enfants de minuit");
        Book b2 = new Book("Hamlet");
        Book b3 = new Book("Les Voyages de Gulliver");
        Book b4 = new Book("La Mort d'Ivan Ilitch");
        Book b5 = new Book("Mrs Dalloway");
        Book b6 = new Book("Mémoires d'Hadrien");
        Book b7 = new Book("Le Jardin des fruits");
        Book b8 = new Book("Le Carnet d'or");
        Book b9 = new Book("Madame Bovary");

        List<Person> persons = List.of(
                new Person("Gilles", 35, List.of(b1, b2, b3, b4, b9)),
                new Person("Adrien", 27, List.of(b0, b6, b3, b9)),
                new Person("Emilie", 29, List.of(b7, b2, b4)),
                new Person("Carlos", 29, List.of(b8, b1, b6)),
                new Person("Rafik", 27, List.of(b1, b2, b3, b4, b9)),
                new Person("Sabine", 35, Collections.emptyList()),
                new Person("Hanss", 18, List.of(b5)),
                new Person("Fatima", 15, List.of(b9))
        );

        // 1 - La liste des noms des personnes majeures.
        System.out.println("\nLa liste des noms des personnes majeures");

        List<String> adults = null;

        System.out.println(adults);


        // 2 - L'ensemble des livres lus.
        System.out.println("\nL'ensemble des livres lus");

        Set<Book> booksRead =null;

        System.out.println(booksRead);


        // 3 - Les ensembles des livres lus indexés par l'âge du lecteur.
        System.out.println("\nLes ensembles des livres lus indexés par l'âge du lecteur");

        Map<Integer, Set<Book>> booksReadByAge = null;

        System.out.println(toString(booksReadByAge));


        // 4 - Pour chaque livre, le nombre de personnes l'ayant lu
        System.out.println("\nPour chaque livre, le nombre de personnes l'ayant lu");

        Map<Book, Long> ownerCountByBook = null;

        System.out.println(toString(ownerCountByBook));


    }

    final static class Person {
        final private String name;
        final private int age;
        final private List<Book> books;

        public Person(String name, int age, List<Book> books) {
            this.name = name;
            this.age = age;
            this.books = List.copyOf(books);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public List<Book> getBooks() {
            return List.copyOf(books);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name) && Objects.equals(books, person.books);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", books=" + books +
                    '}';
        }
    }

    final static class Book {
        final private String title;

        public Book(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(title, book.title);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title);
        }
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

