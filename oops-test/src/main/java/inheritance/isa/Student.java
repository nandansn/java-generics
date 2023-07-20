package inheritance.isa;

import java.time.LocalDate;

public class Student extends Person {

    private int rollNumber;

    public Student(String name, LocalDate dob, int rollNumber) {
        super(name, dob);
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        String person = super.toString();
        return "Student[" + person + " | Roll Number=" + rollNumber + " | Age="+this.getAge()+"]";
    }
}
