package com.adventOfCode.service;

import com.adventOfCode.calendar.SubmarineCommand;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataConverterTest {
    private final List<String> strings = Arrays.asList("1 ", "2");
    private final List<String> commands = Arrays.asList("forward 4", "down 3");

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

    @Test
    void convertListOfStringsToSubmarineCommands() {
        List<SubmarineCommand> input = DataConverter.convertStringListToSubmarineCommands(commands);

        assertAll(
                "Checking List<SubmarineCommand> input value",
                () -> assertEquals("forward", input.get(0).getCommand()),
                () -> assertEquals(4, input.get(0).getUnit()),
                () -> assertEquals(2, commands.size())
        );
    }
}