package ru.isshepelev.behavioralPatterns.strategy;

public class Reading implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Reading...");
    }
}
