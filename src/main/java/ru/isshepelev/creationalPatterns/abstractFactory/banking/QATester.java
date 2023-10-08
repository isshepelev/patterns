package ru.isshepelev.creationalPatterns.abstractFactory.banking;

import ru.isshepelev.creationalPatterns.abstractFactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("тестирую приложение");
    }
}
