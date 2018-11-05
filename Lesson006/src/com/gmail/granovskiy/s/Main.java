// Getting user input (Scanner)

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  creating Scanner object
        Scanner input = new Scanner(System.in);

        //  Output the prompt
        System.out.println("Enter a floating point value: ");

        //  Wait for the user to enter something
        double value = input.nextDouble();

        //  Tell them what they entered
        System.out.println("You entered: " + value);

    }
}
