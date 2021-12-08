package com.adventOfCode.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputFileReader {

    public static List<String> readFileAsListOfString(String filePath) throws IOException {
        List<String> numbers = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader(filePath))) {
            while (sc.hasNext()) {
                numbers.add(sc.nextLine());
            }
            return numbers;
        }
    }


    public static List<Integer> readFileAsListOfInteger(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader(filePath))) {
            while (sc.hasNext()) {
                numbers.add(sc.nextInt());
            }
            return numbers;
        }
    }

}
