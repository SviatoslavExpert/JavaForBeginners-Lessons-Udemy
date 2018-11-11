//  The Equals Method

package com.gmail.granovskiy.s;

public class App {

    public static void main(String[] args) {

        System.out.println(new Object());

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(5, "Bob");


        System.out.println(person1.equals(person2));

        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println(value1.equals(value2));

        Integer number1 = 6;
        Integer number2 = 6;

        System.out.println(number1.equals(number2));

        String text1 = "Hello";
        String text2 = "Hellodfadf".substring(0, 5);

        System.out.println(text2);

        System.out.println(text1.equals(text2));
    }

}

