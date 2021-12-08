package com.adventOfCode.calendar;

import com.adventOfCode.service.DataConverter;

import java.util.List;

public class Day2 implements Day {
    @Override
    public String partOne(List<String> input) {
        List<SubmarineCommand> commands = DataConverter.convertStringListToSubmarineCommands(input);

        int depth = calculatePosition(commands, "depth");

        return Integer.toString(depth);
    }

    @Override
    public String partTwo(List<String> input) {
        List<SubmarineCommand> commands = DataConverter.convertStringListToSubmarineCommands(input);

        int aim = calculatePosition(commands, "aim");

        return Integer.toString(aim);
    }

    private int calculatePosition(List<SubmarineCommand> commands, String parameter) {
        int horizontal = 0;
        int depth = 0;
        int aim = 0;


        for (SubmarineCommand c : commands) {
            switch (c.getCommand()) {
                case "forward":
                    horizontal = horizontal + c.getUnit();
                    aim = aim + Math.abs(depth) * c.getUnit();

                    break;
                case "down":
                    depth = depth - c.getUnit();
                    break;
                case "up":
                    depth = depth + c.getUnit();
                    break;
                default:
                    break;
            }

        }

        int result = 0;
        if (parameter.equals("depth")) {
            result = horizontal * Math.abs(depth);

        } else if (parameter.equals("aim")) {

            result = horizontal * Math.abs(aim);
        }

        return result;
    }


}

