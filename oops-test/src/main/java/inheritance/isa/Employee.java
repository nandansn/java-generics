package inheritance.isa;

import java.time.LocalDate;

public class Employee extends Person {

    private int employeeNumber;

    private float salary;


    public Employee(String name, LocalDate dob, int employeeNumber, float salary) {
        super(name, dob);
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }
}
