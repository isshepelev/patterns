package ru.isshepelev.structuralPatterns.decorator;

public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "write java code ";
    }
}
