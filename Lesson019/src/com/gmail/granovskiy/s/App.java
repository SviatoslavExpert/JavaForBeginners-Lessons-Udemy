//  String builder and String Formatting

package com.gmail.granovskiy.s;

public class App {
    public static void main(String[] args) {
        //  Inefficient
        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";
        System.out.println(info);

        //  StringBuilder
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("My name is Roger.");
        s.append(" ");
        s.append("I am a skydiver.");
        System.out.println(s.toString());

        //  Formatting
        System.out.print("Here is some text.\t That was a tab.\nThat was a new line.");
        System.out.println(" More text.");

        //  Formatting integers
        System.out.printf("Total cost: %d; quantity is: %d\n", 5, 120);

        for(int i = 0; i < 20; i++) {
            System.out.printf("%-2d: %s\n", i, "Here is some text.");
        }

        //  Formatting floating point value
        System.out.printf("Total value: %.2f\n", 5.6874);
        System.out.printf("Total value: %-6.1f\n", 343.23423);

    }
}
