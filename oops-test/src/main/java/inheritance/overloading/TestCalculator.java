package inheritance.overloading;

import java.util.Arrays;
import java.util.List;

public class TestCalculator {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,6,7,8);

        Calculator calculator = new Calculator();
        calculator.add(numbers);
        calculator.add(10,12);
        // type promotion
        calculator.add('a','b');
        calculator.add(10.4f,4);

        List<? extends Number> marks = Arrays.asList(20,19,18,17,16);

        MarkCalculator markCalculator = new MarkCalculator();
        markCalculator.average(marks);

        // in overloading, parent reference to child object, you can access only parent methods
        Calculator calculator1 = new MarkCalculator();




    }
}
