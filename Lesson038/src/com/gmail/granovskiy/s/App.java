//  Try With Resources

package com.gmail.granovskiy.s;

public class App {

    public static void main(String[] args) {

        try (Temp temp = new Temp()) {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
