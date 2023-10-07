package ru.isshepelev.abstractFactory.website;

import ru.isshepelev.abstractFactory.ProductManager;

public class WebsitePM implements ProductManager {
    @Override
    public void manageProject() {
        System.out.println("PM website project");
    }
}
