package com.adventOfCode.service;

import com.adventOfCode.calendar.SubmarineCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataConverter {
    public static List<Integer> convertStringsToIntegers(List<String> input) {
        return input.stream().map(s -> Integer.parseInt(s.trim())).collect(Collectors.toList());
    }

    public static List<SubmarineCommand> convertStringListToSubmarineCommands(List<String> input){
        List<SubmarineCommand> commands = new ArrayList<>();
        for (var line: input){
            var split = line.split(" ");
            commands.add(new SubmarineCommand(split[0], Integer.parseInt(split[1].trim())));
        }
        return commands;
    }
}
