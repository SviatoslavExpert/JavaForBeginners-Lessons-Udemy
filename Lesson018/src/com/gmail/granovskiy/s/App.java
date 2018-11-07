//  Static (and Final)

package com.gmail.granovskiy.s;

public class App {

    public static void main(String[] args) {

        Thing.description = "I am a thing";

        Thing.showInfo();

        System.out.println("Before creating objects the amount of objects is: " + Thing.count);
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects the amount of objects is: " + Thing.count);

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
    }
}
