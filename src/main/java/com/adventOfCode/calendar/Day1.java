package com.adventOfCode.calendar;

import com.adventOfCode.service.DataConverter;

import java.util.List;

public class Day1 implements Day {

    @Override
    public String partOne(List<String> input) {
        List<Integer> numbers = DataConverter.convertStringsToIntegers(input);
        return countResult(numbers, 1);
    }

    @Override
    public String partTwo(List<String> input) {
        List<Integer> numbers = DataConverter.convertStringsToIntegers(input);
        return countResult(numbers, 3);
    }

    private String countResult(List<Integer> numbers, int step) {
        int count = 0;
        int previous = getPrevious(numbers, step);

        for (int i = 0; i <= numbers.size() - step; i++) {
            int sum = 0;
            for (int s = 0; s < step; s++) {
                sum = sum + numbers.get(i + s);
            }

            if (previous < sum) {
                count++;
            }
            previous = sum;
        }

        return Integer.toString(count);
    }

    private int getPrevious(List<Integer> numbers, int step) {
        int previous = 0;

        for (int i = 0; i < step; i++) {
            previous = previous + numbers.get(i);
        }
        return previous;
    }
}
