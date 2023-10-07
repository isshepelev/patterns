package ru.isshepelev.abstractFactory;

import ru.isshepelev.abstractFactory.banking.PM;
import ru.isshepelev.abstractFactory.website.WebsiteTeamFactory;

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