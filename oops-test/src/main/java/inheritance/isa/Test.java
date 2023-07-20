package inheritance.isa;

import java.time.LocalDate;

public class Test {



    public static void main(String[] args) {

        Person person = new Person("Nandakumar", LocalDate.of(1980, 10, 13));

        System.out.println(person.getAge());

        Student nivrithi = new Student("nivrithi", LocalDate.of(2011, 06,06), 19);

        System.out.println(nivrithi);

    }
}
