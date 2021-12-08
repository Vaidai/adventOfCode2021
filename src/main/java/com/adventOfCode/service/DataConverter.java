package com.adventOfCode.service;

import java.util.List;
import java.util.stream.Collectors;

public class DataConverter {
    public static List<Integer> convertStringsToIntegers(List<String> input) {
        return input.stream().map(s -> Integer.parseInt(s.trim())).collect(Collectors.toList());
    }
}
