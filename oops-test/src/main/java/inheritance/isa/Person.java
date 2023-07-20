package inheritance.isa;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

    private String name;
    private LocalDate dob;

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Name=" + name + " | DOB=" + dob;
    }

    public int getAge() {
        int year = LocalDate.now().getYear();
        int month = LocalDate.now().getMonth().getValue();
        int date = LocalDate.now().getDayOfMonth();

        LocalDate currentDate = LocalDate.of(year, month, date);

        return Period.between(this.dob, currentDate).getYears();

    }
}
