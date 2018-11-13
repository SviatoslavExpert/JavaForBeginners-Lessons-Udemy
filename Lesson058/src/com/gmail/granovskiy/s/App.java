//  Implementing Iterable; Downloading HTML Using Java: Java Collections Framework

package com.gmail.granovskiy.s;

public class App {

    public static void main(String[] args) {

        UrlLibrary urlLibrary = new UrlLibrary();

        for (String url : urlLibrary) {
            //System.out.println(html.length());
            System.out.println(url);
        }
    }
}
