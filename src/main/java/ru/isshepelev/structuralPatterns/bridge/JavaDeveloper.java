package ru.isshepelev.structuralPatterns.bridge;

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java разработчик пишет код");
    }
}
