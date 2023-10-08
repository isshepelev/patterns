package ru.isshepelev.creationalPatterns.abstractFactory;

import ru.isshepelev.creationalPatterns.abstractFactory.website.WebsiteTeamFactory;

public class SecondBank {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProductManager productManager = projectTeamFactory.getProductManager();

        developer.writeCode();
        tester.testCode();
        productManager.manageProject();
    }
}