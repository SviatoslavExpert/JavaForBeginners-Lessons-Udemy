//  Setters and "this"

package com.gmail.granovskiy.s;

public class App {

    public static void main(String[] args) {
        Frog frog1 = new Frog();

        frog1.setName("Bertie");
        frog1.setAge(1);

        System.out.println("My name is " + frog1.getName() + ".");
        System.out.println("I am " + frog1.getAge() + ".");
    }
}
