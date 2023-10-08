package ru.isshepelev.creationalPatterns.abstractFactory.website;

import ru.isshepelev.creationalPatterns.abstractFactory.ProductManager;

public class WebsitePM implements ProductManager {
    @Override
    public void manageProject() {
        System.out.println("PM website project");
    }
}
