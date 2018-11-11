package com.gmail.granovskiy.s;

class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no!");
    }

}
