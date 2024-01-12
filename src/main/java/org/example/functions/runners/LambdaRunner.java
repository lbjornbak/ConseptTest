package org.example.functions.runners;

import org.example.interfaces.PentaFunction;
import org.example.functions.Functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaRunner {
    public static void lambdaRunner() {

        int num1 = 5;
        int num2 = 10;
        int num3 = 2;
        int num4 = 3;
        int num5 = 7;

        // Define multiply as a lambda expression
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Define Integer to String function as a lambda expression
        Function<Integer, String> intToString = Object::toString;

        // Define  customOperation
        PentaFunction<Integer, Integer, Integer, Integer, Integer, Integer> customOperation =
                (a, b, c, d, e) -> (a + b) * (c - d) / e;

        PentaFunction<Integer, Integer, Integer, Integer, Integer, Integer> customOperation2 =
                new Functions.CustomPentaFunction();

        String result = Functions.performOperation(num1, num2, multiply, intToString);
        int result2 = Functions.usePentaFunction(num1, num2, num3, num4, num5, customOperation);
        int result3 = Functions.usePentaFunction(10, 20, 3, 4, 5, customOperation2);

        System.out.println("Result 1: as string: " + result);
        System.out.println("Result 2: of custom operation: " + result2);
        System.out.println("Result 3: " + result3);
    }
}
