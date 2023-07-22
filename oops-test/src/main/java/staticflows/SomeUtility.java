package staticflows;

public class SomeUtility {

     SomePerson person;

    static {
//        System.out.println(person);
    }

    public static void someMethod() {
  //      System.out.println(person);
    }

    static class NestedClass {

        SomePerson person;

        public void someChildMethod() {
            System.out.println(person);
        }
    }


}


class SomePerson {
    private String name;

    public SomePerson() {
        this.name = "nanda";
    }


}
