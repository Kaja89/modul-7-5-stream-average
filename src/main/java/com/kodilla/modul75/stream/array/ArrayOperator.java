package com.kodilla.modul75.stream.array;

import java.util.stream.IntStream;

public class ArrayOperator implements ArrayOperations{
    public double getAverage(int[] numbers){

        System.out.println("Numbers: ");
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();

        System.out.println("Average: " + average);
        return average;
    }
}
