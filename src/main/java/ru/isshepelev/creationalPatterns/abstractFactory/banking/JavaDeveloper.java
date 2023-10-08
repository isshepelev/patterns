package ru.isshepelev.creationalPatterns.abstractFactory.banking;

import ru.isshepelev.creationalPatterns.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("пишу java код");
    }
}
