package com.adventOfCode.service;

import com.adventOfCode.service.InputFileReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputFileReaderTest {

    protected static final String TEXT_FILENAME = "src/test/resources/day1.txt";

    @Test
    void whenReadingFileAsListOfString_thenGetArrayListWith10Lines() throws IOException {
        List<String> lines = InputFileReader.readFileAsListOfString(TEXT_FILENAME);
        assertEquals(10, lines.size());
    }

    @Test
    void whenReadingFileAsListOfString_FirstLineIs199() throws IOException {
        List<String> lines = InputFileReader.readFileAsListOfString(TEXT_FILENAME);
        assertEquals("199", lines.get(0));
    }

    @Test
    void whenReadingFileAsListOfInteger_FirstLineIs199() throws IOException {
        List<Integer> lines = InputFileReader.readFileAsListOfInteger(TEXT_FILENAME);
        assertEquals(199, lines.get(0));
    }

}