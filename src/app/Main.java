package app;

import app.NotQuiteLispExample.NotQuiteLispHardCode;

public class Main {

    public static void main(String [] args){
        System.out.println("Hello, World!");

        NotQuiteLispHardCode hardCodeExample = new NotQuiteLispHardCode();

        int floor = hardCodeExample.findRightFloor();

        System.out.println("Final floor " + floor);
    }

}
