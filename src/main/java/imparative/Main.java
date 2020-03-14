package imparative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imparative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Kunle", MALE),
                new Person("Alice", FEMALE),
                new Person("Katana", MALE),
                new Person("Iyabo", FEMALE)
                );

        //imperative style
        System.out.println("Imparative style . . .");
        List<Person> females = new ArrayList<Person>();

        for (Person person : people) {
            if(FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female: females) {
            System.out.println(female);
        }
        //end of imparative style


        //Declaratice approach using streams with collections
        System.out.println("Declarative style . . .");
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                //.collect(Collectors.toList())
                .forEach(System.out::println);


        //Declarative 2
        System.out.println("Even better declarative style");
        List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);


     }


    static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,FEMALE

    }
}
