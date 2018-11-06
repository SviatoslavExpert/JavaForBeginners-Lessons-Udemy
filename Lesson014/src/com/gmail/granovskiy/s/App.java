//  Getters and Return Values

package com.gmail.granovskiy.s;

class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("Hello!");
    }

    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        return yearsLeft;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

public class App {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Joe";
        person1.age = 25;

        person1.sayHello();
        int years = person1.calculateYearsToRetirement();

        System.out.println("I have " + years + " years to retirement.");

        String name = person1.getName();
        int age = person1.getAge();

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old.");

    }
}
