//  Handling Exceptions

package com.gmail.granovskiy.s;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
        File file = new File("C:/Users/User/IdeaProjects/JavaForBeginners-Lessons-Udemy/Lesson033/example.txt");

        try {
            FileReader fr = new FileReader(file);

            // This will not be executed if an exception is thrown.
            System.out.println("Continuing ....");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }

        System.out.println("Finished.");
    }

}

