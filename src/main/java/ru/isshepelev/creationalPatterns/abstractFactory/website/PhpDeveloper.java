package ru.isshepelev.creationalPatterns.abstractFactory.website;

import ru.isshepelev.creationalPatterns.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("пишу php код");
    }
}
