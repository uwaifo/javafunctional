package imparative.mine;

import java.util.List;

import static imparative.mine.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Family> familyMember = List.of(
                new Family("Gloria", 36, FEMALE),
                new Family("Bernice", 5, FEMALE),
                new Family("Uncle Malachy", 74, MALE),
                new Family("Eric", 40, MALE)
        );

        familyMember.stream()
                .filter(person -> MALE.equals(person.gender))
                //filter(person ->  38 )
                .forEach(System.out::println);

    }

    static class Family {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Family(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Family{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }
}
