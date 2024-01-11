package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;


public class Main {

    public static String performOperation(
            int x, int y,
            BiFunction<Integer, Integer, Integer> operation,
            Function<Integer, String> converter) {
        int result = operation.apply(x, y);
        return converter.apply(result);
    }


    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;


        System.out.print("Hello and welcome! \n This is to run a test some concepts");
        // Define multiply as a lambda expression
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Define Integer to String as a lambda expression
        Function<Integer, String> intToString = Object::toString;


        String result = performOperation(num1, num2, multiply, intToString);


        System.out.println("Result as string: " + result);

    }
}