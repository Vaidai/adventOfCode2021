package com.adventOfCode.calendar;

public class SubmarineCommand {
    private String command;
    private int unit;

    public SubmarineCommand(String command, int unit) {
        this.command = command;
        this.unit = unit;
    }

    public String getCommand() {
        return command;
    }

    public int getUnit() {
        return unit;
    }
}
