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

    public void add(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0, (a,b) -> a +b);
        System.out.println(sum);
    }

}
