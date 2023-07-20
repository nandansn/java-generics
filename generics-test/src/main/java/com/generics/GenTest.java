package com.generics;

import java.util.ArrayList;
import java.util.List;


public class GenTest {

    public static void main(String[] args) {

        Box<Book> booksBox = new Box<>();

        Book b1 = new Book("nan","nanda",3.4f);
        Book b2 = new Book("niv","nivrithi",5f);
        Book b3 = new Book("san","sanmthi",4f);

        booksBox.add(b1);
        booksBox.add(b2);
        booksBox.add(b3);

        booksBox.showBooks();




    }
}

//class Basic {
//
//
////    public static void main(String[] args) {
////
////        // not type safe list, add any types
////        List list = new ArrayList<>();
////
////        list.add("nanda");
////        list.add(1234);
////        list.add(1.2f);
////
////        String s = (String)list.get(0); // need to do type casting
////
////        // using generics
////
////        List<String> newList = new ArrayList<>();
////        newList.add("nanda");
////        newList.add("kumar");
////        //newList.add(1234) // type safe
////
////        String s2 = newList.get(0); // type casting not required.
////
////
////        // base type and parameter type
////
////        // polymorphism applicable for base type. not for parameter type,
////
////        // BaseType<ParameterType>
////
////        // polymorphism for base type, allowed
////        ArrayList<String> al = new ArrayList<String>();
////        List<String> l = new ArrayList<String>();
////        Collection<String> c = new ArrayList<String>();
////
////        // polymorphism for parameter type, not allowed
////       // Collection<Object> co = new ArrayList<String>();
////
////
////    }
//
//    public static void main(String[] args) {
//        Box<Book> booksBox = new Box<>();
//
//        Book b1 = new Book("nan","nanda",3.4f);
//        Book b2 = new Book("niv","nivrithi",5f);
//        Book b3 = new Book("san","sanmthi",4f);
//
//        booksBox.add(b1);
//        booksBox.add(b2);
//        booksBox.add(b3);
//
//        booksBox.showBooks();
//
//
//    }
//
//
//}

class Box<T> {

    List<T> things;

    public Box() {
        this.things = new ArrayList<>();
    }

    public void add(T thing) {
        this.things.add(thing);
    }

    public void showBooks() {
        this.things.forEach(System.out::println);
    }



}

class Book {
    String name;
    String author;

    float rating;

    public Book(String name, String author, float rating) {
        this.name = name;
        this.author = author;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                '}';
    }
}




