package inheritance.overloading;

import java.util.List;

public class Calculator {

    public void add(int a, int b) {
        System.out.println(a+b);
    }

    public void add(float a, int c) {
        System.out.println(a+c);
    }


    public void add(int a, float c) {
        System.out.println(a+c);
    }

    public double add(List<? extends  Number> numbers) {
        double sum = numbers.stream().mapToDouble(Number::doubleValue).sum();
        return sum;
    }

    private void add(int... arg) {
        System.out.println("var arg");
    }


}
