package org.example;

import org.example.functions.Functions;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class MainTest {

    public static void main(String[] args) {
        testPerformOperation();
        testUsePentaFunction();
        testCustomPentaFunction();
    }

    public static void testPerformOperation() {
        System.out.println("Testing performOperation...");

        // Test multipy and int to string
        String result1 = Functions.performOperation(5, 10, (a, b) -> a * b, Object::toString);
        if (result1.equals("50")) {
            System.out.println("\u001B[32mTest case 1 passed: Result is 50\u001B[0m"); // Green color
        } else {
            System.out.println("\u001B[31mTest case 1 failed: Result is " + result1 + "\u001B[0m"); // Red color
        }
    }

    public static void testUsePentaFunction() {
        System.out.println("Testing usePentaFunction...");

        // Test customOperation
        int result2 = Functions.usePentaFunction(5, 10, 2, 3, 7, (a, b, c, d, e) -> (a + b) * (c - d) / e);
        if (result2 == 35) {
            System.out.println("\u001B[32mTest case 2 passed: Result is 35\u001B[0m"); // Green color
        } else {
            System.out.println("\u001B[31mTest case 2 failed: Result is " + result2 + "\u001B[0m"); // Red color
        }
    }

    public static void testCustomPentaFunction() {
        System.out.println("Testing CustomPentaFunction...");

        Functions.CustomPentaFunction customPentaFunction = new Functions.CustomPentaFunction();

        // Test CustomPentaFunction
        int result3 = customPentaFunction.apply(10, 20, 3, 4, 5);
        if (result3 == 45) {
            System.out.println("\u001B[32mTest case 3 passed: Result is 45\u001B[0m"); // Green color
        } else {
            System.out.println("\u001B[31mTest case 3 failed: Result is " + result3 + "\u001B[0m"); // Red color
        }
    }
}



