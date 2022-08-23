package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge{
    private final int SUSPENSION = 100;

    @Override
    public int getCarsCount() {
        return SUSPENSION;
    }
}
