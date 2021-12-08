package com.adventOfCode.calendar;

import com.adventOfCode.service.InputFileReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {
    protected static final String TEXT_FILENAME = "src/test/resources/day1.txt";

    @Test
    void partOne() throws IOException {
        List<String> strings = InputFileReader.readFileAsListOfString(TEXT_FILENAME);

        Day d = new Day1();
        String result = d.partOne(strings);

        assertEquals("7", result);
    }

    @Test
    void partTwo() throws IOException {
        List<String> strings = InputFileReader.readFileAsListOfString(TEXT_FILENAME);

        Day d = new Day1();
        String result = d.partTwo(strings);

        assertEquals("5", result);
    }

}