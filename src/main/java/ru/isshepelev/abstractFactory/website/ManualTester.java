package ru.isshepelev.abstractFactory.website;

import ru.isshepelev.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("пишу тесты ManualTester");
    }
}
