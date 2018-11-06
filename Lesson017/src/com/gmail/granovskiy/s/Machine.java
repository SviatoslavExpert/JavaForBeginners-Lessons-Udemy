package com.gmail.granovskiy.s;

public class Machine {
    private String name;
    private int code;

    public Machine() {
        this("Arnie", 0);
        System.out.println("Constructor running!");
    }

    public Machine(String name) {
        System.out.println("Second constructor running!");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third constructor running!");
        this.name = name;
        this.code = code;

    }
}
