//  Method Parameters

package com.gmail.granovskiy.s;

public class App {

    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("I am Sam.");
        sam.jump(9);
        sam.move("West", 17.35);

        String greeting = "Nice to meet you!";
        sam.speak(greeting);

    }
}
