package com.adventOfCode.calendar;

import com.adventOfCode.service.InputFileReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day2Test {
    protected static final String TEXT_FILENAME = "src/test/resources/day2.txt";
    List<String> stringCommands;
    Day day = new Day2();

    Day2Test() throws IOException {
        stringCommands = InputFileReader.readFileAsListOfString(TEXT_FILENAME);
    }

    @Test
    void partOne() {
        assertEquals("150", day.partOne(stringCommands));
    }

    @Test
    void partTwo() {
        assertEquals("900", day.partTwo(stringCommands));
    }

}

