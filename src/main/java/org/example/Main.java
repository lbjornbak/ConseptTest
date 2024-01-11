package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static String performOperation(
            int x, int y,
            BiFunction<Integer, Integer, Integer> operation,
            //Note to self. BiFunction takes to input values and one return value
            // Also, "operation" is just a name for the function
            Function<Integer, String> converter) {
            // Note to self: Function only takes one
            // There are predefined Functions up to four inputs.
            // Also the same for "converter"
        int result = operation.apply(x, y);
        return converter.apply(result);
    }

    // PentaFunction definition get from interface
    public static <T, U, V, W, X, R> R usePentaFunction(
            T t, U u, V v, W w, X x, PentaFunction<T, U, V, W, X, R> operation) {
        return operation.apply(t, u, v, w, x);
    }

    // A different implementation of PentaFunction
    // Defines an inner static class named CustomPentaFunction.
    static class CustomPentaFunction implements PentaFunction<Integer, Integer, Integer, Integer, Integer, Integer> {
        // CustomPentaFunction implements the PentaFunction interface
        // Must provide an implementation for the apply method declared in the interface.
        // This method takes five Integer parameters (a, b, c, d, e) and returns an Integer.
        @Override
        public Integer apply(Integer a, Integer b, Integer c, Integer d, Integer e) {
            return (a * b) + (c * d) - e;
        }
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

        PentaFunction<Integer, Integer, Integer, Integer, Integer, Integer> customOperation2 =
                new CustomPentaFunction();

        String result = performOperation(num1, num2, multiply, intToString);
        int result2 = usePentaFunction(num1, num2, num3, num4, num5, customOperation);
        int result3 = usePentaFunction(10, 20, 3, 4, 5, customOperation2);

        System.out.println("Result 1: as string: " + result);
        System.out.println("Result 2: of custom operation: " + result2);
        System.out.println("Result 3: " + result3);

    }
}