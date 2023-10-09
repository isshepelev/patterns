package ru.isshepelev.behavioralPatterns.interpreter;

public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.equals(data)){
            return true;
        }
        return false;
    }
}
