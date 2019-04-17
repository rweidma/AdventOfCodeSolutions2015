package app.NotQuiteLispExample;

public class NotQuiteLispHardCode {
    /*
    * --- Day 1: Not Quite Lisp --- (2015)

Santa is trying to deliver presents in a large apartment building, but he can't find the right floor - the directions he got are a little confusing. He starts on the ground floor (floor 0) and then follows the instructions one character at a time.

An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ), means he should go down one floor.

The apartment building is very tall, and the basement is very deep; he will never find the top or bottom floors.

For example:

(()) and ()() both result in floor 0.
((( and (()(()( both result in floor 3.
))((((( also results in floor 3.
()) and ))( both result in floor -1 (the first basement level).
))) and )())()) both result in floor -3.
To what floor do the instructions take Santa?*/

    String instructions = "Santa is trying to deliver presents in a large apartment building, but he can't find the right floor - the directions he got are a little confusing. He starts on the ground floor (floor 0) and then follows the instructions one character at a time.\n" +
            "\n" +
            "An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ), means he should go down one floor.\n" +
            "\n" +
            "The apartment building is very tall, and the basement is very deep; he will never find the top or bottom floors.\n" +
            "\n" +
            "For example:\n" +
            "\n" +
            "(()) and ()() both result in floor 0.\n" +
            "((( and (()(()( both result in floor 3.\n" +
            "))((((( also results in floor 3.\n" +
            "()) and ))( both result in floor -1 (the first basement level).\n" +
            "))) and )())()) both result in floor -3.";





    String[] characters = instructions.split("");
    public int findRightFloor(){
        int floorNumber = 0;

        for(String s: characters){
            if(s.equals("(")){
                floorNumber++;
            }
            else if (s.equals(")")){
                floorNumber--;
            }
        }

        return floorNumber;
    }


}
