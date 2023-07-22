package inheritance.overloading;

import java.util.List;

public class MarkCalculator extends Calculator {

    public void average(List<? extends Number> marks) {

        double total = super.add(marks);
        double average = total / marks.size();
        System.out.println(average);
    }

    public String add(String s, String a) {
        return a.concat(s);
    }


}
