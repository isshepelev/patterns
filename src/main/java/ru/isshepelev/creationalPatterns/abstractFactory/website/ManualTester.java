package ru.isshepelev.creationalPatterns.abstractFactory.website;

import ru.isshepelev.creationalPatterns.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("пишу тесты ManualTester");
    }
}
