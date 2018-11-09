package com.gmail.granovskiy.s;

class Camera extends Machine {
    @Override
    public String toString() {
        return "I am a camera";
    }

    public void snap() {
        System.out.println("snap!");
    }
}
