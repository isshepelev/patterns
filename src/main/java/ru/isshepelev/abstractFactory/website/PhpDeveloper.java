package ru.isshepelev.abstractFactory.website;

import ru.isshepelev.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("пишу php код");
    }
}
