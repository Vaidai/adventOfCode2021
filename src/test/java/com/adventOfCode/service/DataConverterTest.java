package com.adventOfCode.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataConverterTest {
    private final List<String> strings = Arrays.asList("1 ", "2");

    @Test
    void convertStringsToInteger_whenFirstElementWithSpaceAfterNumber() {
        List<Integer> integers = DataConverter.convertStringsToIntegers(strings);
        assertEquals(1, integers.get(0));
    }

    @Test
    void convertStringsToIntegers_checkTheSizeOfConvertedList() {
        List<Integer> integers = DataConverter.convertStringsToIntegers(strings);
        assertEquals(2, integers.size());
    }
}