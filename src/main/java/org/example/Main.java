package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static String performOperation(
            int x, int y,
            BiFunction<Integer, Integer, Integer> operation,
            //Note to self. BiFunction takes to input values and one return value
            Function<Integer, String> converter) {
            // Note to self: Function only takes one
            // There are predefined Functions up to four inputs.
        int result = operation.apply(x, y);
        return converter.apply(result);
    }

    public static <T, U, V, W, X, R> R pentaFuncOperation(T t, U u, V v, W w, X x, PentaFunction<T, U, V, W, X, R> operation) {
        return operation.apply(t, u, v, w, x);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 2;
        int num4 = 3;
        int num5 = 7;


        System.out.print("Hello and welcome! \nThis is to run a test some concepts \n \n");

        // Define multiply as a lambda expression
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Define Integer to String function as a lambda expression
        Function<Integer, String> intToString = Object::toString;

        // Define  customOperation
        PentaFunction<Integer, Integer, Integer, Integer, Integer, Integer> customOperation =
                (a, b, c, d, e) -> (a + b) * (c - d) / e;

        String result = performOperation(num1, num2, multiply, intToString);
        int result2 = pentaFuncOperation(num1, num2, num3, num4, num5, customOperation);

        System.out.println("Result1 as string: " + result);
        System.out.println("Result2 of custom operation: " + result2);

    }
}