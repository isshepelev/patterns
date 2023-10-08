package ru.isshepelev.creationalPatterns.abstractFactory.banking;

import ru.isshepelev.creationalPatterns.abstractFactory.ProductManager;

public class PM implements ProductManager {
    @Override
    public void manageProject() {
        System.out.println("pm manages project");
    }
}
