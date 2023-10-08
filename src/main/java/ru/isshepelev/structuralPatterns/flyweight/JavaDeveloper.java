package ru.isshepelev.structuralPatterns.flyweight;

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("java разработчик пишет код");
    }
}
