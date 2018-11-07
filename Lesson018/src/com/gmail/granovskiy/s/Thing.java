package com.gmail.granovskiy.s;

public class Thing {

    public final static int LUCKY_NUMBER = 7;
    public String name;
    public static String description;

    public int id;
    public static int count;

    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Object id is: " + id + " , " + description + " : " + name);
    }

    public static void showInfo() {
        System.out.println(description);
        //  won't work: System.out.println(name);
    }

}
