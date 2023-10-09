package ru.isshepelev.behavioralPatterns.interpreter;

public interface Expression {
    boolean interpret(String context);
}
