package ru.isshepelev.abstractFactory.banking;

import ru.isshepelev.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("пишу java код");
    }
}
