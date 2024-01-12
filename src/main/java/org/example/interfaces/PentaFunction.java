package org.example.interfaces;

@FunctionalInterface
// Note to self: This annotation is used to indicate that the PentaFunction interface is a functional interface.
// A functional interface is an interface that only has one abstract method (SAM - Single Abstract Method).
// This annotation helps ensure that it only has one abstract method.
public interface PentaFunction<T, U, V, W, X, R> {
    R apply(T t, U u, V v, W w, X x);
    // This is a single abstract method named apply. This method takes five parameters
}
