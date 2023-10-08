package ru.isshepelev.structuralPatterns.bridge;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ разработчик пишет код");

    }
}
