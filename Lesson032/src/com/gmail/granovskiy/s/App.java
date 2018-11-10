//  Reading Files Using Scanner

package com.gmail.granovskiy.s;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:/Users/User/IdeaProjects/JavaForBeginners-Lessons-Udemy/Lesson032/example.txt";

        File textFile = new File(fileName);

        Scanner sc = new Scanner(textFile);

        int count = 1;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }
        sc.close();
    }

}
