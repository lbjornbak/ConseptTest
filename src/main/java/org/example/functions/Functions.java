package org.example.functions;

import org.example.interfaces.PentaFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {
    public static String performOperation(
            int x, int y,
            BiFunction<Integer, Integer, Integer> operation,
            //Note to self. BiFunction takes to input values and one return value
            // Also, "operation" is just a name for the function
            Function<Integer, String> converter) {
        // Note to self: Function only takes one value
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
    public static class CustomPentaFunction implements PentaFunction<Integer, Integer, Integer, Integer, Integer, Integer> {
        // CustomPentaFunction implements the PentaFunction interface
        // Must provide an implementation for the apply method declared in the interface.
        // This method takes five Integer parameters (a, b, c, d, e) and returns an Integer.
        @Override
        public Integer apply(Integer a, Integer b, Integer c, Integer d, Integer e) {
            return (a * b) + (c * d) - e;
        }
    }

}
