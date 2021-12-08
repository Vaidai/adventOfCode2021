package com.adventOfCode;

import com.adventOfCode.calendar.Day;
import com.adventOfCode.calendar.Day1;
import com.adventOfCode.calendar.Day2;
import com.adventOfCode.service.InputFileReader;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Advent Of Code 2021");

        String fileName = "src/main/resources/" + "day2.txt";
        List<String> input = InputFileReader.readFileAsListOfString(fileName);

        Day day = new Day2();

        System.out.println(day.getClass().getSimpleName());
        System.out.println("-----------------------------------------------------");
        System.out.println("Part One Result: " + day.partOne(input));
        System.out.println("-----------------------------------------------------");
        System.out.println("Part Two Result: " + day.partTwo(input));
        System.out.println("-----------------------------------------------------");

    }
}
