package com.gmail.granovskiy.s;

public class Frog {

    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }
    /*
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(" : ").append(name);
        return sb.toString();
    }
    */
    public String toString(){
        return String.format("%-2d: %s", id, name);
    }

}

