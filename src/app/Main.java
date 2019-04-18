package app;

import app.IWasToldThereWouldBeNoMath.NotNoMathWorker;
import app.NotQuiteLispExample.NotQuiteLispWorker;

public class Main {

    public static void main(String [] args){
        System.out.println("Hello, World!");

        NotQuiteLispWorker nqlWorker = new NotQuiteLispWorker();

        int floor = nqlWorker.findRightFloorDefaultValue();

        System.out.println("Final floor from default instructions is Floor  " + floor);

        floor = nqlWorker.findRightFloorPassInValue("()()())))))()()))((()()()(Dude these are terrible instructions()()");
        System.out.println("Final floor from app input instructions is Floor  " + floor);

        NotNoMathWorker nmWorker = new NotNoMathWorker();
        System.out.println(nmWorker.figureOutHowMuch(1,2,3));
    }

}
