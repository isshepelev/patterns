package ru.isshepelev.abstractFactory.banking;

import ru.isshepelev.abstractFactory.ProductManager;

public class PM implements ProductManager {
    @Override
    public void manageProject() {
        System.out.println("pm manages project");
    }
}
